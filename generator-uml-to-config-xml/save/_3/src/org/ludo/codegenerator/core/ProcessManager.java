/*
 * Projet   : Gen
 * Package  : gen.core
 * Source   : GenerationManager.java
 * Création : CHABOUD   Date : 29 mars 2007
 * Copyright (C) 2007   Apria RSA
 *
 * --------------- Dernière mise à jour ---------------------
 * @author  : $author$
 * @version : $Revision$, $Date$
 * --------------- Historique -------------------------------
 * Auteur :                      Date : ../../....
 * Motif  :
 */
package org.ludo.codegenerator.core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.ludo.codegenerator.core.gen.bean.ITemplateGeneration;
import org.ludo.codegenerator.core.gen.bean.impl.TemplateGenerationBean;
import org.ludo.codegenerator.core.gen.manager.TemplateGenerationManager;
import org.ludo.codegenerator.core.gen.manager.TemplateGenerationMap;
import org.ludo.codegenerator.xml.core.gen.core.bean.Gen;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasseRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenClassesRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParClasses;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParStereotypes;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenGenererParTemplates;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRef;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypeRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenStereotypesRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupe;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupeRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParClasse;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParStereotype;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateGroupesRefPourGenererParTemplate;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplateRef;
import org.ludo.codegenerator.xml.core.gen.core.bean.GenTemplates;
import org.ludo.codegenerator.xml.core.gen.core.xmlreader.GenXmlReaderManager;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.LoggerManager;

/**
 * <b>Description :</b>
 * <description de la classe>
 *
 * @version : $Revision$, $Date$
 * @author  : $Author$
 * @since   : version 1.0.0
 */
public class ProcessManager {
    
    private static Logger log = LoggerManager.getLogger(ProcessManager.class);
    
    private String nomFichierConfiguration = null;
    private GenXmlReaderManager genXmlReaderManager = null;
    private Gen gen = null;
    
    public ProcessManager(String nomFichierConfiguration) {
    	this.nomFichierConfiguration = nomFichierConfiguration;
    	genXmlReaderManager = GenXmlReaderManager.getGenXmlReaderManager(nomFichierConfiguration);
    	gen = genXmlReaderManager.getGen();
    	log.debug("genXmlReaderManager = "+genXmlReaderManager);
    }
    
    public void genererFichier() throws Exception {
        try {
            Velocity.init();
            GenTemplates templates = gen.getGenTemplates();
            if( templates == null ) return;
            GenClasses classes = gen.getGenClasses();
            if( classes == null ) return;
            GenGenererGroupe genererGroupe = gen.getGenGenererGroupe();
            if( genererGroupe == null ) return;
            /** Post Gen Process */
            // Définir le package de chaque classe
            //definirPackagePourClasses(gen.getGenClasses());
            //definirClassePourAssociations(gen.getGenClasses());
            /** Fin Post Gen Process */
            // Par Classes
            GenGenererParClasses genererParClasses = genererGroupe.getGenGenererParClasses();
            if( genererParClasses != null ) {
                for( Iterator iterGenererParClasse = genererParClasses.getListeGenGenererParClasse().iterator(); iterGenererParClasse.hasNext(); ) {
                	GenGenererParClasse genererParClasse = (GenGenererParClasse) iterGenererParClasse.next();
                	GenClassesRefPourGenererParClasse classesRefPourGenererParClasse = genererParClasse.getGenClassesRefPourGenererParClasse();
                	for( Iterator iterClassesRefPourGenererParClasse = classesRefPourGenererParClasse.getListeGenClasseRefPourGenererParClasse().iterator(); iterClassesRefPourGenererParClasse.hasNext(); ) {
                		GenClasseRefPourGenererParClasse classeRefPourGenererParClasse = (GenClasseRefPourGenererParClasse) iterClassesRefPourGenererParClasse.next();
                    	GenClasse classe = classes.getGenClasseByGenId(classeRefPourGenererParClasse.getClasseGenId());
                    	GenTemplateGroupesRefPourGenererParClasse templateGroupesRefPourGenererParClasse = genererParClasse.getGenTemplateGroupesRefPourGenererParClasse();
                    	if( classe != null
                    	 && templateGroupesRefPourGenererParClasse != null ) {
                            for( Iterator iterTemplateGroupeRefPourGenererParClasse = templateGroupesRefPourGenererParClasse.getListeGenTemplateGroupeRefPourGenererParClasse().iterator(); iterTemplateGroupeRefPourGenererParClasse.hasNext(); ) {
                            	GenTemplateGroupeRefPourGenererParClasse templateGroupeRefPourClasse = (GenTemplateGroupeRefPourGenererParClasse) iterTemplateGroupeRefPourGenererParClasse.next();
                            	GenTemplateGroupe templateGroupe = gen.getGenTemplateGroupes().getGenTemplateGroupeByNom(templateGroupeRefPourClasse.getTemplateGroupeNom());
                            	if( templateGroupe != null ) {
                            		genererFichierParClasse(templateGroupe, classe);
                            	}
                            }
                    	}
                	}
                }
            }
            // Par Stéréotypes
            /*
            GenGenererStereotypes genererStereotypes = genererGroupe.getGenGenererStereotypes();
            if( genererStereotypes != null ) {
                for( Iterator iterGenererStereotype = genererStereotypes.getListeGenGenererStereotype().iterator(); iterGenererStereotype.hasNext(); ) {
                	GenGenererStereotype genererStereotype = (GenGenererStereotype) iterGenererStereotype.next();
                	GenStereotypesRefPourGenererStereotype StereotypesRefPourGenererStereotype = genererStereotype.getGenStereotypesRefPourGenererStereotype();
                	for( Iterator iterStereotypesRefPourGenererStereotype = StereotypesRefPourGenererStereotype.getListeGenStereotypeRefPourGenererStereotype().iterator(); iterStereotypesRefPourGenererStereotype.hasNext(); ) {
                		GenStereotypeRefPourGenererStereotype stereotypeRefPourGenererStereotype = (GenStereotypeRefPourGenererStereotype) iterStereotypesRefPourGenererStereotype.next();
                		GenStereotype stereotype = gen.getGenStereotypes().getGenStereotypeByNom(stereotypeRefPourGenererStereotype.getStereotypeNom());
                		if( stereotype != null ) {
	                    	GenTemplateGroupesRefPourGenererStereotype templateGroupesRefPourGenererStereotype = genererStereotype.getGenTemplateGroupesRefPourGenererStereotype();
	                    	if( templateGroupesRefPourGenererStereotype != null ) {
	                            for( Iterator iterTemplateGroupeRefPourGenererStereotype = templateGroupesRefPourGenererStereotype.getListeGenTemplateGroupeRefPourGenererStereotype().iterator(); iterTemplateGroupeRefPourGenererStereotype.hasNext(); ) {
	                            	GenTemplateGroupeRefPourGenererStereotype templateGroupeRefPourStereotype = (GenTemplateGroupeRefPourGenererStereotype) iterTemplateGroupeRefPourGenererStereotype.next();
	                            	GenTemplateGroupe templateGroupe = gen.getGenTemplateGroupes().getGenTemplateGroupeByNom(templateGroupeRefPourStereotype.getTemplateGroupeNom());
	                            	if( templateGroupe != null ) {
	                            		genererFichierParStereotype(templateGroupe, stereotype);
	                            	}
	                            }
	                    	}
                		}
                	}
                }
            }
            */
            
            GenGenererParTemplates genererParTemplates = genererGroupe.getGenGenererParTemplates();
            if( genererParTemplates != null ) {
                for( Iterator iterGenererParTemplate = genererParTemplates.getListeGenGenererParTemplate().iterator(); iterGenererParTemplate.hasNext(); ) {
                	GenGenererParTemplate genererParTemplate = (GenGenererParTemplate) iterGenererParTemplate.next();
                	GenTemplateGroupesRefPourGenererParTemplate templateGroupesRefPourGenererParTemplate = genererParTemplate.getGenTemplateGroupesRefPourGenererParTemplate();
                	if( templateGroupesRefPourGenererParTemplate != null ) {
                        for( Iterator iterTemplateGroupeRefPourGenererParTemplate = templateGroupesRefPourGenererParTemplate.getListeGenTemplateGroupeRefPourGenererParTemplate().iterator(); iterTemplateGroupeRefPourGenererParTemplate.hasNext(); ) {
                        	GenTemplateGroupeRefPourGenererParTemplate templateGroupeRefPourParTemplate = (GenTemplateGroupeRefPourGenererParTemplate) iterTemplateGroupeRefPourGenererParTemplate.next();
                        	GenTemplateGroupe templateGroupe = gen.getGenTemplateGroupes().getGenTemplateGroupeByNom(templateGroupeRefPourParTemplate.getTemplateGroupeNom());
                        	if( templateGroupe != null ) {
			                	GenStereotypesRefPourGenererParTemplate StereotypesRefPourGenererParTemplate = templateGroupeRefPourParTemplate.getGenStereotypesRefPourGenererParTemplate();
			                	List listeStereotype = new ArrayList();
			                	for( Iterator iterStereotypesRefPourGenererParTemplate = StereotypesRefPourGenererParTemplate.getListeGenStereotypeRefPourGenererParTemplate().iterator(); iterStereotypesRefPourGenererParTemplate.hasNext(); ) {
			                		GenStereotypeRefPourGenererParTemplate stereotypeRefPourGenererParTemplate = (GenStereotypeRefPourGenererParTemplate) iterStereotypesRefPourGenererParTemplate.next();
			                		GenStereotype stereotype = gen.getGenStereotypes().getGenStereotypeByNom(stereotypeRefPourGenererParTemplate.getStereotypeNom());
			                		if( stereotype != null ) {
			                			listeStereotype.add(stereotype);
	                            	}
	                            }
                        		genererFichierParTemplate(templateGroupe, listeStereotype);
	                    	}
                		}
                	}
                }
            }
            
            GenGenererParStereotypes genererParStereotypes = genererGroupe.getGenGenererParStereotypes();
            if( genererParStereotypes != null ) {
                for( Iterator iterGenererParStereotype = genererParStereotypes.getListeGenGenererParStereotype().iterator(); iterGenererParStereotype.hasNext(); ) {
                	GenGenererParStereotype genererParStereotype = (GenGenererParStereotype) iterGenererParStereotype.next();
                	GenStereotypesRefPourGenererParStereotype genStereotypesRefPourGenererParStereotype = genererParStereotype.getGenStereotypesRefPourGenererParStereotype();
                	List listeStereotype = new ArrayList();
                	for( Iterator iterStereotypeRefPourGenererParStereotype = genStereotypesRefPourGenererParStereotype.getListeGenStereotypeRefPourGenererParStereotype().iterator(); iterStereotypeRefPourGenererParStereotype.hasNext(); ) {
                		GenStereotypeRefPourGenererParStereotype stereotypeRefPourGenererParStereotype = (GenStereotypeRefPourGenererParStereotype) iterStereotypeRefPourGenererParStereotype.next();
                		GenStereotype stereotype = gen.getGenStereotypes().getGenStereotypeByNom(stereotypeRefPourGenererParStereotype.getStereotypeNom());
                		if( stereotype != null ) {
                			GenTemplateGroupesRefPourGenererParStereotype templateGroupesRefPourGenererParStereotype = stereotypeRefPourGenererParStereotype.getGenTemplateGroupesRefPourGenererParStereotype();
                			if( templateGroupesRefPourGenererParStereotype != null ) {
                				for( Iterator iterTemplateGroupeRefPourGenererParStereotype = templateGroupesRefPourGenererParStereotype.getListeGenTemplateGroupeRefPourGenererParStereotype().iterator(); iterTemplateGroupeRefPourGenererParStereotype.hasNext(); ) {
                					GenTemplateGroupeRefPourGenererParStereotype templateGroupeRefPourStereotype = (GenTemplateGroupeRefPourGenererParStereotype) iterTemplateGroupeRefPourGenererParStereotype.next();
                					GenTemplateGroupe templateGroupe = gen.getGenTemplateGroupes().getGenTemplateGroupeByNom(templateGroupeRefPourStereotype.getTemplateGroupeNom());
                					if( templateGroupe != null ) {
                						genererFichierParStereotype(templateGroupe, stereotype);
                					}
            					}
            				}
            			}
                	}
                }
            }
            
            List listeTemplateGeneration = this.getListeTemplateGeneration();
            processTemplateGeneration(gen, listeTemplateGeneration);
            
            /* Ancien code
            for(Iterator iterGenerer = genererManager.getListeGenerer().iterator(); iterGenerer.hasNext(); ) {
                Generer generer = (Generer) iterGenerer.next();
                Classe classe = classes.getClasse(generer.getNomClasse());
                for(Iterator iterNomTemplate = generer.getListeNomTemplate().iterator(); iterNomTemplate.hasNext(); ) {
                    String nomTemplate = (String) iterNomTemplate.next(); 
                    Template template = templates.getTemplate(nomTemplate);
                    genererFichier(template, classe);
                }
            }
            */
        } catch(Exception e) {
            log.debug(this,e);
            throw e;
        }
    }
    
    private void definirPackagePourClasses(GenClasses classes) {
    	String packageBase = classes.getPackageBase();
    	List listeGenClasse = classes.getListeGenClasse();
    	for(Iterator iterClasse = listeGenClasse.iterator(); iterClasse.hasNext(); ) {
    		GenClasse classe = (GenClasse) iterClasse.next();
    		if( StringUtils.isBlank(packageBase) ) {
    			classe.setPackageJava(classe.getPackageJava());
    		}
    		if( StringUtils.isBlank(classe.getPackageJava()) ) {
    			classe.setPackageJava(packageBase);
    		}
    		if( StringUtils.isNotBlank(packageBase)
    		 && StringUtils.isNotBlank(classe.getPackageJava()) ) {
    			classe.setPackageJava(packageBase + "." + classe.getPackageJava());
    		}
    	}
    }
    /*
    private void definirClassePourAssociations(GenClasses classes) {
    	List listeGenClasse = classes.getListeGenClasse();
    	for(Iterator iterClasse = listeGenClasse.iterator(); iterClasse.hasNext(); ) {
    		GenClasse classe = (GenClasse) iterClasse.next();
    		GenAssociations associations = classe.getGenAssociations();
        	List listeGenAssociation = associations.getListeGenAssociation();
        	for(Iterator iterAssociation = listeGenAssociation.iterator(); iterAssociation.hasNext(); ) {
        		GenAssociation association = (GenAssociation) iterAssociation.next();
        		GenClasse classeDeAssociation = classes.getGenClasseByNomJava(association.getNomJavaClasse());
       			association.setClasse(classeDeAssociation);
        	}
    	}
    }
    */
    
    private void genererFichierParClasse(GenTemplateGroupe templateGroupe, GenClasse classe) {
   		for(Iterator iterTemplateRef = templateGroupe.getListeGenTemplateRef().iterator(); iterTemplateRef.hasNext(); ) {
   			GenTemplateRef templateRef = (GenTemplateRef) iterTemplateRef.next();
   			GenTemplate template = gen.getGenTemplates().getGenTemplateByNom(templateRef.getNom());
   			if( template != null ) {
   				genererFichierParClasse( template, classe );
   			}
    	}
    }
    
    private void genererFichierParClasse(GenTemplate template, GenClasse classe) {
        String nomFichierTemplate = 
                    gen.getGenTemplates().getInDir()
            + "/" + template.getFile();
        log.debug("nomFichierTemplate = "+nomFichierTemplate);
        String nomPackage =
			//		gen.getGenTemplates().getPackageJavaBase()
		    //+ "." + 
		    template.getPackageJava().replaceAll("XXX", classe.getPackageJava());
		log.debug("nomPackage = "+nomPackage);
        String nomRepertoireSortie =
        			//gen.getGenTemplates().getOutDir()
            //+ "/" + 
            template.getOutDir()
            + "/" + nomPackage.replaceAll("\\.", "/");
		log.debug("nomRepertoireSortie = "+nomRepertoireSortie);
        String nomFichierSortie = 
                    nomRepertoireSortie
            + "/" + template.getOutFile().replaceAll("XXX", classe.getNomJava());
        log.debug("nomFichierSortie = "+nomFichierSortie);
        String nomElementGenere = 
        	template.getNomElementGenere().replaceAll("XXX", classe.getNomJava() );
        log.debug("nomElementGenere = "+nomElementGenere);
        
        ITemplateGeneration templateGeneration = new TemplateGenerationBean();
        templateGeneration.setNomFichierTemplate(nomFichierTemplate);
        templateGeneration.setNomPackage(nomPackage);
        templateGeneration.setNomElementGenere(nomElementGenere);
        templateGeneration.setNomRepertoireSortie(nomRepertoireSortie);
        templateGeneration.setNomFichierSortie(nomFichierSortie);
        templateGeneration.setGenClasse(classe);
        templateGeneration.setGenTemplate(template);
        this.addTemplateGeneration(templateGeneration);
    }
    
    private void genererFichierParTemplate(GenTemplateGroupe templateGroupe, List listeStereotype) {
    	// TODO Rechercher les classes
    	Map mapListeClasseParStereotype = new HashMap();
    	for(Iterator iterStereotype = listeStereotype.iterator(); iterStereotype.hasNext(); ) {
    		GenStereotype stereotype = (GenStereotype) iterStereotype.next();
	    	ListeClasseParStereotype listeClasseParStereotype = new ListeClasseParStereotype(stereotype);
	    	for(Iterator iterClasse = gen.getGenClasses().getListeGenClasse().iterator(); iterClasse.hasNext(); ) {
	    		GenClasse classe = (GenClasse) iterClasse.next();
	    		boolean contientStereotype = false;
	    		if( classe.getGenStereotypesRef() != null
	    		 && classe.getGenStereotypesRef().getListeGenStereotypeRef() != null ) {
		    		for(Iterator iterStereotypeRef = classe.getGenStereotypesRef().getListeGenStereotypeRef().iterator(); iterStereotypeRef.hasNext(); ) {
		    			GenStereotypeRef stereotypeRef = (GenStereotypeRef) iterStereotypeRef.next();
		    			if( listeClasseParStereotype.getStereotypeNom().equals(stereotypeRef.getStereotypeNom()) ) {
		    				listeClasseParStereotype.addClasse(classe);
		    			}
		    		}
	    		}
	    	}
	    	if( ! listeClasseParStereotype.getListeClasse().isEmpty() ) {
	    		mapListeClasseParStereotype.put(listeClasseParStereotype.getStereotypeNom(), listeClasseParStereotype);
	    	}
    	}
		genererFichierParTemplate( templateGroupe, mapListeClasseParStereotype );
    }
    
    private void genererFichierParTemplate(GenTemplateGroupe templateGroupe, Map mapListeClasseParStereotype) {
   		for(Iterator iterTemplateRef = templateGroupe.getListeGenTemplateRef().iterator(); iterTemplateRef.hasNext(); ) {
   			GenTemplateRef templateRef = (GenTemplateRef) iterTemplateRef.next();
   			GenTemplate template = gen.getGenTemplates().getGenTemplateByNom(templateRef.getNom());
   			if( template != null ) {
   				genererFichierParTemplate( template, mapListeClasseParStereotype );
   			}
    	}
    }
    
    private void genererFichierParTemplate(GenTemplate template, Map mapListeClasseParStereotype) {
        String nomFichierTemplate = 
                    gen.getGenTemplates().getInDir()
            + "/" + template.getFile();
        log.debug("nomFichierTemplate = "+nomFichierTemplate);
        String nomRepertoireSortie =
        			//gen.getGenTemplates().getOutDir()
            // + "/" + 
        	template.getOutDir();
		log.debug("nomRepertoireSortie = "+nomRepertoireSortie);
        String nomFichierSortie = 
                    nomRepertoireSortie
            + "/" + template.getOutFile();
        log.debug("nomFichierSortie = "+nomFichierSortie);
        String nomPackage =
        		//	gen.getGenTemplates().getPackageJavaBase()
            //+ "." + 
            template.getPackageJava();
        log.debug("nomPackage = "+nomPackage);
        String nomElementGenere = 
        	template.getNomElementGenere();
        log.debug("nomElementGenere = "+nomElementGenere);
        //VelocityContext context = new VelocityContext();
        //context.put("", mapListeClasseParStereotype);
        ITemplateGeneration templateGeneration = new TemplateGenerationBean();
        templateGeneration.setNomFichierTemplate(nomFichierTemplate);
        templateGeneration.setNomPackage(nomPackage);
        templateGeneration.setNomElementGenere(nomElementGenere);
        templateGeneration.setNomRepertoireSortie(nomRepertoireSortie);
        templateGeneration.setNomFichierSortie(nomFichierSortie);
        templateGeneration.setMapListeClasseParStereotype(mapListeClasseParStereotype);
        templateGeneration.setGenTemplate(template);
        this.addTemplateGeneration(templateGeneration);
    }
    
    
    
    private void genererFichierParStereotype(GenTemplateGroupe templateGroupe, GenStereotype stereotype) {
    	// TODO Rechercher les classes
    	List listeClasse = new ArrayList();
    	for(Iterator iterClasse = gen.getGenClasses().getListeGenClasse().iterator(); iterClasse.hasNext(); ) {
    		GenClasse classe = (GenClasse) iterClasse.next();
    		boolean contientStereotype = false;
    		if( classe.getGenStereotypesRef() != null
    		 && classe.getGenStereotypesRef().getListeGenStereotypeRef() != null ) {
	    		for(Iterator iterStereotypeRef = classe.getGenStereotypesRef().getListeGenStereotypeRef().iterator(); iterStereotypeRef.hasNext(); ) {
	    			GenStereotypeRef stereotypeRef = (GenStereotypeRef) iterStereotypeRef.next();
	    			if( stereotype.getNom().equals(stereotypeRef.getStereotypeNom()) ) {
	    				listeClasse.add(classe);
	    			}
	    		}
    		}
    	}
    	for(Iterator iterClasse = listeClasse.iterator(); iterClasse.hasNext(); ) {
    		GenClasse classe = (GenClasse) iterClasse.next();
    		genererFichierParStereotype( templateGroupe, stereotype, classe );
    	}
    }
    
    private void genererFichierParStereotype(GenTemplateGroupe templateGroupe, GenStereotype stereotype, GenClasse classe) {
   		for(Iterator iterTemplateRef = templateGroupe.getListeGenTemplateRef().iterator(); iterTemplateRef.hasNext(); ) {
   			GenTemplateRef templateRef = (GenTemplateRef) iterTemplateRef.next();
   			GenTemplate template = gen.getGenTemplates().getGenTemplateByNom(templateRef.getNom());
   			if( template != null ) {
   				genererFichierParStereotype( template, stereotype, classe );
   			}
    	}
    }
    
    private void genererFichierParStereotype(GenTemplate template, GenStereotype stereotype, GenClasse classe) {
        String nomFichierTemplate = 
                    gen.getGenTemplates().getInDir()
            + "/" + template.getFile();
        log.debug("nomFichierTemplate = "+nomFichierTemplate);
        String nomPackage =
        		//	gen.getGenTemplates().getPackageJavaBase()
            //+ "." + 
            template.getPackageJava().replaceAll("XXX", classe.getPackageJava());
        log.debug("nomPackage = "+nomPackage);
        String nomRepertoireSortie =
        			//gen.getGenTemplates().getOutDir()
        	//+ "/" + 
        	template.getOutDir()
        	+ "/" + nomPackage.replaceAll("\\.", "/");
        log.debug("nomRepertoireSortie = "+nomRepertoireSortie);
        String nomFichierSortie = 
        			nomRepertoireSortie
        	+ "/" + template.getOutFile().replaceAll("XXX", StringUtils.capitalize(classe.getNomJava()) );
        log.debug("nomFichierSortie = "+nomFichierSortie);
        AssertHelper.assertDefined(template.getNomElementGenere(), "nom de l'élément généré du template");
        String nomElementGenere = 
        	template.getNomElementGenere().replaceAll("XXX", StringUtils.capitalize(classe.getNomJava()) );
        log.debug("nomElementGenere = "+nomElementGenere);
        ITemplateGeneration templateGeneration = new TemplateGenerationBean();
        templateGeneration.setNomFichierTemplate(nomFichierTemplate);
        templateGeneration.setNomPackage(nomPackage);
        templateGeneration.setNomRepertoireSortie(nomRepertoireSortie);
        templateGeneration.setNomFichierSortie(nomFichierSortie);
        templateGeneration.setNomElementGenere(nomElementGenere);
        templateGeneration.setGenStereotype(stereotype);
        templateGeneration.setGenClasse(classe);
        templateGeneration.setGenTemplate(template);
        this.addTemplateGeneration(templateGeneration);
    }
    
    private List listeTemplateGeneration = new ArrayList();
    
    private void addTemplateGeneration(ITemplateGeneration templateGeneration) {
    	listeTemplateGeneration.add(templateGeneration);
    }
    
    private List getListeTemplateGeneration() {
    	return listeTemplateGeneration;
    }
    
    private static class VelocityUtils {
    	public static void putInContextIfNotNull(VelocityContext context, String nom, Object object) {
    		if(object != null) {
    			context.put(nom, object);
    		}
    	}
    }
    
    private void processTemplateGeneration(Gen gen, List listeTemplateGeneration) throws ResourceNotFoundException, ParseErrorException, MethodInvocationException, Exception {
    	AssertHelper.assertNotNullArgument(listeTemplateGeneration, "liste des TemplateGeneration");
        TemplateGenerationMap templateGenerationMap = TemplateGenerationMap.Manager.getNewTemplateGenerationMap(listeTemplateGeneration);
        for(Iterator iterTemplateGeneration = listeTemplateGeneration.iterator(); iterTemplateGeneration.hasNext(); ) {
    		ITemplateGeneration templateGeneration = (ITemplateGeneration) iterTemplateGeneration.next();
    		
            VelocityContext context = new VelocityContext();
            VelocityUtils.putInContextIfNotNull(context, "templateGenerationMap", templateGenerationMap);
            VelocityUtils.putInContextIfNotNull(context, "SU", StringUtilsInstance.getInstance());
            VelocityUtils.putInContextIfNotNull(context, "StringUtils", StringUtilsInstance.getInstance());
            VelocityUtils.putInContextIfNotNull(context, "genStereotype", templateGeneration.getGenStereotype());
            VelocityUtils.putInContextIfNotNull(context, "genClasse", templateGeneration.getGenClasse());
            VelocityUtils.putInContextIfNotNull(context, "genTemplate", templateGeneration.getGenTemplate());
            VelocityUtils.putInContextIfNotNull(context, "nomPackage", templateGeneration.getNomPackage());
           	VelocityUtils.putInContextIfNotNull(context, "mapListeClasseParStereotype", templateGeneration.getMapListeClasseParStereotype());
            
            /* // Test :
            if( templateGeneration.getClasse() != null && templateGeneration.getClasse().getGenAssociations() != null ) {
            	for( Iterator iter = templateGeneration.getClasse().getGenAssociations().getListeGenAssociation().iterator(); iter.hasNext(); ) {
            		GenAssociation association = (GenAssociation) iter.next();
            		TemplateGeneration templateGenerationTest = templateGenerationMap.getByNomPackageAndNomClasse("bean_template",gen.getGenTemplates().getPackageJavaBase() + "." + association.getPackageJavaClasse(),association.getNomJavaClasse());
            		boolean est = true;
    			}
			}
			*/
            
            String nomFichierTemplate = templateGeneration.getNomFichierTemplate();
    		String nomRepertoireSortie = templateGeneration.getNomRepertoireSortie();
    		String nomFichierSortie = templateGeneration.getNomFichierSortie();

    		StringWriter w = new StringWriter();
            Velocity.mergeTemplate(nomFichierTemplate, "UTF-8", context, w );
            System.out.println("out = "+w);
            
            // Créer le nouveau fichier généré dans le répertoire temporaire de traitement
            File repSortie = new File("temp/"+nomRepertoireSortie);
            repSortie.mkdirs();
            File fileSortie = new File(nomFichierSortie);
            if( ! fileSortie.exists() )
            {
	            FileWriter file = new FileWriter(new File(nomFichierSortie));
	            Velocity.mergeTemplate(nomFichierTemplate, "UTF-8", context, file );
	            file.flush();
	            file.close();
            }
            else
            {
	            FileWriter file = new FileWriter(new File("temp/"+nomFichierSortie));
	            Velocity.mergeTemplate(nomFichierTemplate, "UTF-8", context, file );
	            file.flush();
	            file.close();
	            
	            // Table des modifications apportées dans les zones de modifications
	            Map mapZoneModification = new HashMap();
	            String codeZonePrecedent = null;
	            
	            // Ouvre l'ancien fichier déjà généré pour lecture
	            BufferedReader in = new BufferedReader(new FileReader(nomFichierSortie));
	            StringBuffer strBuffer = null;
	            String line = in.readLine();
	            while( line != null ) {
	            	int posZoneDebut = StringUtils.indexOf(line, "@zone-debut:");
	            	int posZoneFin = StringUtils.indexOf(line, "@zone-fin:");
	            	if( posZoneDebut >= 0) {
	            		int posDebutCodeZone = StringUtils.indexOf(line, '{', posZoneDebut) + 1;
	            		AssertHelper.assertBoolean(posDebutCodeZone >= 0,"le code de la zone de modifications n'est pas précédé d'une accolade.");
	            		int posFinCodeZone = StringUtils.indexOf(line, '}', posDebutCodeZone);
	            		AssertHelper.assertBoolean(posFinCodeZone >= 0,"le code de la zone de modifications n'est pas suivi d'une accolade.");
	            		AssertHelper.assertBoolean(codeZonePrecedent == null, "la zone de modifications précédente '"+codeZonePrecedent+"' n'est pas terminée par une balise de fin de zone");
	            		codeZonePrecedent = StringUtils.substring(line, posDebutCodeZone, posFinCodeZone);
	            		AssertHelper.assertDefined(codeZonePrecedent, "code de la zone de modification");
	            		strBuffer = new StringBuffer();
	            	}
	            	else
	            	if( posZoneFin >= 0 ) {
	            		int posDebutCodeZone = StringUtils.indexOf(line, '{', posZoneFin) + 1;
	            		AssertHelper.assertBoolean(posDebutCodeZone >= 0,"le code de la zone de modifications n'est pas précédé d'une accolade.");
	            		int posFinCodeZone = StringUtils.indexOf(line, '}', posDebutCodeZone);
	            		AssertHelper.assertBoolean(posFinCodeZone >= 0,"le code de la zone de modifications n'est pas suivi d'une accolade.");
	            		String codeZone = StringUtils.substring(line, posDebutCodeZone, posFinCodeZone);
	            		AssertHelper.assertDefined(codeZone, "code de la zone de modification");
	            		AssertHelper.assertBoolean(codeZonePrecedent != null, "aucune balise d'ouverture de zone de modifications '"+codeZone+"' n'a été définie");
	            		AssertHelper.assertBoolean(StringUtils.equalsIgnoreCase(codeZonePrecedent, codeZone), "le code de la zone de modification dans les balises de début et de fin de zone ne sont pas identiques");
	            		mapZoneModification.put(codeZone, strBuffer.toString());
	            		codeZonePrecedent = null;
	            	}
	            	else
	               	if( codeZonePrecedent != null)
	            	{
	               		strBuffer.append(line + "\n");
	            	}
	            	line = in.readLine();
	            }
	            in.close();
	            AssertHelper.assertDefined(codeZonePrecedent == null, "la dernière zone de modifications n'est pas terminée par une balise de fin");
	            
	            // Modification du fichier de sortie
	            BufferedWriter out = new BufferedWriter(new FileWriter(nomFichierSortie));
	            in = new BufferedReader(new FileReader("temp/"+nomFichierSortie));
	            line = in.readLine();
	            while( line != null ) {
	            	int posZoneDebut = StringUtils.indexOf(line, "@zone-debut:");
	            	int posZoneFin = StringUtils.indexOf(line, "@zone-fin:");
	            	if( posZoneDebut >= 0) {
	            		int posDebutCodeZone = StringUtils.indexOf(line, '{', posZoneDebut) + 1;
	            		AssertHelper.assertBoolean(posDebutCodeZone >= 0,"le code de la zone de modifications n'est pas précédé d'une accolade.");
	            		int posFinCodeZone = StringUtils.indexOf(line, '}', posDebutCodeZone);
	            		AssertHelper.assertBoolean(posFinCodeZone >= 0,"le code de la zone de modifications n'est pas suivi d'une accolade.");
	            		AssertHelper.assertBoolean(codeZonePrecedent == null, "la zone de modifications précédente '"+codeZonePrecedent+"' n'est pas terminée par une balise de fin de zone");
	            		codeZonePrecedent = StringUtils.substring(line, posDebutCodeZone, posFinCodeZone);
	            		AssertHelper.assertDefined(codeZonePrecedent, "code de la zone de modification");
	            	}
	            	else
	            	if( posZoneFin >= 0 ) {
	            		int posDebutCodeZone = StringUtils.indexOf(line, '{', posZoneFin) + 1;
	            		AssertHelper.assertBoolean(posDebutCodeZone >= 0,"le code de la zone de modifications n'est pas précédé d'une accolade.");
	            		int posFinCodeZone = StringUtils.indexOf(line, '}', posDebutCodeZone);
	            		AssertHelper.assertBoolean(posFinCodeZone >= 0,"le code de la zone de modifications n'est pas suivi d'une accolade.");
	            		String codeZone = StringUtils.substring(line, posDebutCodeZone, posFinCodeZone);
	            		AssertHelper.assertDefined(codeZone, "code de la zone de modification");
	            		AssertHelper.assertBoolean(codeZonePrecedent != null, "aucune balise d'ouverture de zone de modifications '"+codeZone+"' n'a été définie");
	            		AssertHelper.assertBoolean(StringUtils.equalsIgnoreCase(codeZonePrecedent, codeZone), "le code de la zone de modification dans les balises de début et de fin de zone ne sont pas identiques");
	            		codeZonePrecedent = null;
	            		String contenuZoneModification = (String) mapZoneModification.get(codeZone);
	            		if( contenuZoneModification != null ) {
	            			out.write(contenuZoneModification);
	            		}
	            	}
	            	else
	            	{
	           			AssertHelper.assertBoolean(codeZonePrecedent == null, "la zone de modifications définie dans le template ne doit pas contenir de lignes entre la zone de début et de fin de la zone '"+codeZonePrecedent+"'");
	            	}
	            	out.write(line);
	            	out.newLine();
	            	line = in.readLine();
	            }
	            out.close();
	            AssertHelper.assertDefined(codeZonePrecedent == null, "la dernière zone de modifications n'est pas terminée par une balise de fin");
            }
    	}
    	//deleteDirectory(new File("temp/"));
    }
    
	static private boolean deleteDirectory(File path) { 
		boolean resultat = true; 
		
        if( path.exists() ) { 
        	File[] files = path.listFiles(); 
        	for(int i=0; i<files.length; i++) { 
        		if(files[i].isDirectory()) { 
        	    	deleteDirectory(files[i]); 
        		} 
        		else { 
        	    	AssertHelper.assertBoolean(files[i].delete(), "l'effacement du fichier ne s'est pas correctement déroulé"); 
        		} 
        	} 
        } 
    	AssertHelper.assertBoolean(path.delete(), "l'effacement du répertoire ne s'est pas correctement déroulé"); 
        return( true ); 
	}
    
    /* Ancien code
    private void genererFichier(Template template, Classe classe) {
        String nomFichierTemplate = 
                    templateManager.getTemplates().getRepertoireEntree()
            + "/" + template.getNomFichierTemplate();
        log.debug("nomFichierTemplate = "+nomFichierTemplate);
        String nomRepertoireSortie =
                    templateManager.getTemplates().getRepertoireSortie()
            + "/" + classe.getJavaPackage().replaceAll("\\.", "/")
            + "/" + template.getNomSousRepertoireSortie();
        String nomFichierSortie = 
                    nomRepertoireSortie
            + "/" + template.getNomFichierSortie().replaceAll("XXX", classe.getJavaNomClasse());
        log.debug("nomFichierSortie = "+nomFichierSortie);
        String nomPackage =
                    templateManager.getTemplates().getPackageBase()
            + "." + classe.getJavaPackage()
            + "." + template.getNomSousPackage();
        log.debug("nomPackage = "+nomPackage);
        VelocityContext context = new VelocityContext();
        context.put("classe", classe);
        context.put("template", template);
        context.put("package", nomPackage);
        
        StringWriter w = new StringWriter();
        Velocity.mergeTemplate(nomFichierTemplate, "UTF-8", context, w );
        System.out.println("out = "+w);
        
        File repSortie = new File(nomRepertoireSortie);
        repSortie.mkdirs();
        FileWriter file = new FileWriter(new File(nomFichierSortie));
        Velocity.mergeTemplate(nomFichierTemplate, "UTF-8", context, file );
        file.flush();
        file.close();
    }
	*/

}
