package org.ludo.umlgenerator.xml.core.xmlreader.ea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.ludo.umlgenerator.xml.core.bean.IXMI;
import org.ludo.umlgenerator.xml.core.bean.IXMIAssociation;
import org.ludo.umlgenerator.xml.core.bean.IXMIAssociationEnd;
import org.ludo.umlgenerator.xml.core.bean.IXMIAttribut;
import org.ludo.umlgenerator.xml.core.bean.IXMIClasse;
import org.ludo.umlgenerator.xml.core.bean.IXMIDatatype;
import org.ludo.umlgenerator.xml.core.bean.IXMGeneralisation;
import org.ludo.umlgenerator.xml.core.bean.IXMIMultiplicity;
import org.ludo.umlgenerator.xml.core.bean.IXMIOperation;
import org.ludo.umlgenerator.xml.core.bean.IXMIPackage;
import org.ludo.umlgenerator.xml.core.bean.IXMIParametre;
import org.ludo.umlgenerator.xml.core.bean.IXMIStereotype;
import org.ludo.umlgenerator.xml.core.bean.IXMITag;
import org.ludo.umlgenerator.xml.core.bean.IXMITaggedValue;
import org.ludo.umlgenerator.xml.core.bean.IXMIType;
import org.ludo.umlgenerator.xml.core.bean.impl.XMIAssociationBean;
import org.ludo.umlgenerator.xml.core.bean.impl.XMIAssociationEndBean;
import org.ludo.umlgenerator.xml.core.bean.impl.XMIAttributBean;
import org.ludo.umlgenerator.xml.core.bean.impl.XMIBean;
import org.ludo.umlgenerator.xml.core.bean.impl.XMIClasseBean;
import org.ludo.umlgenerator.xml.core.bean.impl.XMIDatatypeBean;
import org.ludo.umlgenerator.xml.core.bean.impl.XMGeneralisationBean;
import org.ludo.umlgenerator.xml.core.bean.impl.XMIMultiplicityBean;
import org.ludo.umlgenerator.xml.core.bean.impl.XMIOperationBean;
import org.ludo.umlgenerator.xml.core.bean.impl.XMIPackageBean;
import org.ludo.umlgenerator.xml.core.bean.impl.XMIParametreBean;
import org.ludo.umlgenerator.xml.core.bean.impl.XMIStereotypeBean;
import org.ludo.umlgenerator.xml.core.bean.impl.XMITagBean;
import org.ludo.umlgenerator.xml.core.bean.impl.XMITaggedValueBean;
import org.ludo.umlgenerator.xml.utils.Noeud;
import org.ludo.umlgenerator.xml.utils.XMINoeud;
import org.ludo.umlgenerator.xml.utils.XmlUtils;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.LoggerManager;

public class XMIXmlEAHandler {

	private static class XMIClasseEtElementClasse {
		public static class Manager {
			private Map mapXMIClasseEtElementClasse = new HashMap();
			public void addToMapXMIClasseEtElementClasse(final IXMIClasse xmiClasse, final Element elementClasse) {
				final XMIClasseEtElementClasse xmiClasseEtElementClasse = new XMIClasseEtElementClasse(xmiClasse, elementClasse);
				this.mapXMIClasseEtElementClasse.put(
					xmiClasseEtElementClasse.getClasseGenId(),
					xmiClasseEtElementClasse);
			}
			public void addToMapXMIClasseEtElementClasse(final XMIClasseEtElementClasse xmiClasseEtElementClasse) {
				this.mapXMIClasseEtElementClasse.put(
					xmiClasseEtElementClasse.getClasseGenId(),
					xmiClasseEtElementClasse);
			}
			public XMIClasseEtElementClasse getXMIClasseEtElementClasse(final String classeGenId) {
				return (XMIClasseEtElementClasse) this.mapXMIClasseEtElementClasse.get(classeGenId);
			}
			public Iterator getIteratorXMIClasseEtElementClasse() {
				return this.mapXMIClasseEtElementClasse.values().iterator();
			}
		}
		private final String classeGenId;
		private final IXMIClasse xmiClasse;
		private final Element elementClasse;
		public XMIClasseEtElementClasse(final IXMIClasse xmiClasse, final Element elementClasse) {
			AssertHelper.assertDefined(xmiClasse,"objet XMI de la classe");
			this.xmiClasse = xmiClasse;
			AssertHelper.assertDefined(elementClasse,"élément XML de la classe");
			this.elementClasse = elementClasse;
			AssertHelper.assertDefined(xmiClasse.getGenId(),"genId de l'objet XMI de la classe");
			this.classeGenId = xmiClasse.getGenId();
		}
		public String getClasseGenId() {
			return this.classeGenId;
		}
		public IXMIClasse getXmiClasse() {
			return this.xmiClasse;
		}
		public Element getElementClasse() {
			return this.elementClasse;
		}
	}

	private XMIClasseEtElementClasse.Manager xmiClasseEtElementClasseManager = new XMIClasseEtElementClasse.Manager();

	private XMIClasseEtElementClasse.Manager getXMIClasseEtElementClasseManager() {
		return this.xmiClasseEtElementClasseManager;
	}

    /**
     * Mémorisation des classes.
     */
    private Map<String, IXMIClasse> tableXMIClasse = new HashMap<String, IXMIClasse>();

    private Map<String, IXMIClasse> getTableXMIClasse() {
        return this.tableXMIClasse;
    }

	/**
	 * Mémorisation des stéréotypes.
	 */
	private Map<String, IXMIStereotype> tableXMIStereotype = new HashMap<String, IXMIStereotype>();

    /**
     * Mémorisation des tags.
     */
    private Map<String, IXMITag> tableTag = new HashMap<String, IXMITag>();


	private static Logger log = LoggerManager.getLogger(XMIXmlEAHandler.class);

	private static interface NOEUD {
		public final String HEADER = "XMI.header";
		public final String CONTENT = "XMI.content";
		public final String MODEL = "Model";
		public final String NAMESPACE_OWNED_ELEMENT = "Namespace.ownedElement";
		public final String CLASS = "Class";
		public final String ASSOCIATIONCLASS = "AssociationClass";
		public final String INTERFACE = "Interface";
		public final String DATATYPE = "DataType";
		public final String MODEL_ELEMENT_STEREOTYPE = "ModelElement.stereotype";
		public final String STEREOTYPE = "Stereotype";
		public final String MODEL_ELEMENT_TAGGED_VALUE = "ModelElement.taggedValue";
        public final String TAGGED_VALUE = "TaggedValue";
		public final String CLASSIFIER_FEATURE = "Classifier.feature";
		public final String ATTRIBUTE = "Attribute";
		public final String OPERATION = "Operation";
		public final String PACKAGE = "Package";
		public final String DATA_TYPE = "DataType";
		public final String BEHAVORIAL_FEATURE_PARAMETER = "BehavioralFeature.parameter";
		public final String PARAMETER = "Parameter";
		public final String PARAMETER_TYPE = "Parameter.type";
		public final String STRUCTURAL_FEATURE_MULTIPLICITY = "StructuralFeature.multiplicity";
		public final String STRUCTURAL_FEATURE_TYPE = "StructuralFeature.type";
		public final String MULTIPLICITY = "Multiplicity";
		public final String MULTIPLICITY_RANGE = "Multiplicity.range";
		public final String MULTIPLICITYRANGE = "MultiplicityRange";
		public final String GENERELIZATION = "Generalization";
		public final String GENERELIZATION_CHILD = "Generalization.child";
		public final String GENERELIZATION_PARENT = "Generalization.parent";
		// Associations
/*
                <UML:Association xmi.id = '-64--88-1-2--6e0fa98b:11a07ed39bc:-8000:000000000000086F'
                  name = '' isSpecification = 'false' isRoot = 'false' isLeaf = 'false' isAbstract = 'false'>
                  <UML:Association.connection>
                    <UML:AssociationEnd xmi.id = '-64--88-1-2--6e0fa98b:11a07ed39bc:-8000:0000000000000870'
                      name = 'joueurID' visibility = 'public' isSpecification = 'false' isNavigable = 'true'
                      ordering = 'unordered' aggregation = 'none' targetScope = 'instance' changeability = 'changeable'>
                      <UML:AssociationEnd.multiplicity>
                        <UML:Multiplicity xmi.id = '-64--88-1-2--6e0fa98b:11a07ed39bc:-8000:0000000000000871'>
                          <UML:Multiplicity.range>
                            <UML:MultiplicityRange xmi.id = '-64--88-1-2--6e0fa98b:11a07ed39bc:-8000:0000000000000872'
                              lower = '1' upper = '1'/>
                          </UML:Multiplicity.range>
                        </UML:Multiplicity>
                      </UML:AssociationEnd.multiplicity>
                      <UML:AssociationEnd.participant>
                        <UML:Class xmi.idref = '-64--88-1-2--6e0fa98b:11a07ed39bc:-8000:00000000000007F8'/>
                      </UML:AssociationEnd.participant>
                    </UML:AssociationEnd>
                    <UML:AssociationEnd xmi.id = '-64--88-1-2--6e0fa98b:11a07ed39bc:-8000:0000000000000873'
                      name = 'persoID' visibility = 'public' isSpecification = 'false' isNavigable = 'true'
                      ordering = 'unordered' aggregation = 'none' targetScope = 'instance' changeability = 'changeable'>
                      <UML:AssociationEnd.multiplicity>
                        <UML:Multiplicity xmi.id = '-64--88-1-2--6e0fa98b:11a07ed39bc:-8000:00000000000008A9'>
                          <UML:Multiplicity.range>
                            <UML:MultiplicityRange xmi.id = '-64--88-1-2--6e0fa98b:11a07ed39bc:-8000:00000000000008A8'
                              lower = '1' upper = '1'/>
                          </UML:Multiplicity.range>
                        </UML:Multiplicity>
                      </UML:AssociationEnd.multiplicity>
                      <UML:AssociationEnd.participant>
                        <UML:Class xmi.idref = '-64--88-1-2--6e0fa98b:11a07ed39bc:-8000:0000000000000850'/>
                      </UML:AssociationEnd.participant>
                    </UML:AssociationEnd>
                  </UML:Association.connection>
                </UML:Association>
 */
		public final String ASSOCIATION = "Association";
		public final String ASSOCIATION_CONNECTION = "Association.connection";
		public final String ASSOCIATIONEND = "AssociationEnd";
		public final String ASSOCIATIONEND_MULTIPLICITY = "AssociationEnd.multiplicity";
		//public final String MULTIPLICITY = "Multiplicity";
		//public final String MULTIPLICITY_RANGE = "Multiplicity.range";
		//public final String MULTIPLICITYRANGE = "MultiplicityRange";
		public final String ASSOCIATIONEND_PARTICIPANT = "AssociationEnd.participant";
		//public final String  = "Class";

	}

	private final Document document;

	public XMIXmlEAHandler(final Document document) {
		this.document = document;
	}

	public void afficherArborescence() {
		final Element racine = this.document.getRootElement();
		if( racine == null ) {
			return;
		}
		XmlUtils.parcourir(racine);
	}

	private boolean AFFICHER_ARBORESCENCE = false;

	public IXMI getXMI() {
		if( this.AFFICHER_ARBORESCENCE ) {
			afficherArborescence();
			return null;
		}
		else {
			loadListeXMINoeud(this.document);

			loadXMI(this.document);

			return this.xmi;
		}
	}

	private List listeXMINoeud = new ArrayList();

	private void loadListeXMINoeud(final Document document) {
		final Element racine = document.getRootElement();
		AssertHelper.assertDefined(racine, "racine");
		this.listeXMINoeud = XmlUtils.getListeXMINoeud(racine);
	}

	private XMINoeud getXMINoeudByXmiId(final String xmiId) {
		AssertHelper.assertDefined(xmiId, "xmiId");
		XMINoeud xmiNoeudTrouve = null;
		for(final Iterator iterXMINoeud = this.listeXMINoeud.iterator(); iterXMINoeud.hasNext() && (xmiNoeudTrouve == null); ) {
			final XMINoeud xmiNoeud = (XMINoeud) iterXMINoeud.next();
			if( xmiId.equals(xmiNoeud.getXmiId()) ) {
				xmiNoeudTrouve = xmiNoeud;
			}
		}
		return xmiNoeudTrouve;
	}


	private IXMI xmi = new XMIBean();

	private void loadXMI(final Document document) {
		final Element racine = document.getRootElement();
		if( racine == null ) {
			return;
		}

		// Au début !
		this.xmi.setListeDatatype(
		    getListeXMIDatatypeDansDocument(
				document
			)
		);

		this.xmi.setListePackageFils(
			getListeXMIPackageDansPackageSourceDuDocument(
				document
			)
		);

		defineListeXMIClasse();

		// En dernier !
		loadListeElementAssociation(
			document,
			this.xmi
		);

		definirTaggedValueDansDocument(
		    document
		);

        this.xmi.setListeStereotype(
            getListeXMIStereotype()
        );

        this.xmi.setListeTag(
                getListeXMITag()
            );

		return;
	}

	/*
	 *
	 * Méthodes utilitaires
	 *
	 */
	/*
	private void parcourir(Element element) {
		parcourir(element,1);
	}

	private void parcourir(Element element, int niveau) {
		if( element == null ) {
			return;
		}
		int i=0;
		StringBuffer strAffich = new StringBuffer("");
		while(i<niveau-1) {
			strAffich.append(" | ");
			i++;
		}
		if(i<niveau) {
			strAffich.append(" + ");
		}
		strAffich.append(element.getName());
		if( element.getAttributeValue("name") != null ) {
			strAffich.append(" -|- [NAME:'"+element.getAttributeValue("name")+"']");
		}
		log.debug(strAffich.toString());
		List listeChildren = getChildren(element);
		for(Iterator iterChildren = listeChildren.iterator(); iterChildren.hasNext(); ) {
			Element children = (Element) iterChildren.next();
			parcourir(children,niveau+1);
		}

	}

	private List getChildren(Element element) {
		List listeElementFils = new ArrayList();
		List listeChildren = element.getChildren();
		for(Iterator iterChildren = listeChildren.iterator(); iterChildren.hasNext(); ) {
			Element elementFils = (Element) iterChildren.next();
			listeElementFils.add(elementFils);
		}
		return listeElementFils;
	}

	private List getChildren(Element element, String nomNoeud) {
		AssertHelper.assertDefined(nomNoeud, "nom du noeud");
		List listeElementFils = new ArrayList();
		List listeChildren = element.getChildren();
		for(Iterator iterChildren = listeChildren.iterator(); iterChildren.hasNext(); ) {
			Element elementFils = (Element) iterChildren.next();
			if( nomNoeud.equals(elementFils.getName()) ) {
				listeElementFils.add(elementFils);
			}
		}
		return listeElementFils;
	}

	private static Noeud getNoeudFromElement(Element element) {
		Noeud noeud =
			new Noeud(
				element.getName(),
				element.getAttributeValue("name")
			);
		return noeud;
	}

	private Element acceder(Element element, List listeNoeud) {
		XmlUtils.
	}
	*/
	/*
	 *
	 * Méthodes de lecture du fichier XML
	 *
	 */

	/**
	 * Récupération des stéréotypes
	 */

	private List getListeXMIStereotype() {
		final List listeXMIStereotype = new ArrayList();
		for(final Iterator iterNomStereotype = this.tableXMIStereotype.keySet().iterator(); iterNomStereotype.hasNext(); ) {
			final String nomStereotype = (String) iterNomStereotype.next();
			final String xmiId = "0";
			listeXMIStereotype.add(
				new XMIStereotypeBean(
					nomStereotype,
					xmiId
				)
			);
		}
		return listeXMIStereotype;
	}

	/**
	 * Crée si non existant dans la table ou récupère depuis la table le stéréotype
	 * correspondant au nom.
	 * @param stereotypeNom Nom du stéréotype à créer ou à récupérer
	 * @return Stéréotype.
	 */
	private IXMIStereotype getXMIStereotype(final String stereotypeNom) {
	    IXMIStereotype xmiStereotype = this.tableXMIStereotype.get(stereotypeNom);
	    if (xmiStereotype == null) {
	        xmiStereotype =
                new XMIStereotypeBean(
                        stereotypeNom,
                        "0"
                    );
	        this.tableXMIStereotype
	            .put(
	                stereotypeNom,
	                xmiStereotype
	            );
	    }
	    AssertHelper.assertNotNull(xmiStereotype, "xmiStereotype");
	    return xmiStereotype;
	}

    /**
     * Récupération des tags
     */

    private List getListeXMITag() {
        final List listeXMITag = new ArrayList();
        for(final Iterator iterNomTag = this.tableTag.keySet().iterator(); iterNomTag.hasNext(); ) {
            final String nomTag = (String) iterNomTag.next();
            final String xmiId = "0";
            listeXMITag.add(
                new XMITagBean(
                    nomTag,
                    xmiId
                )
            );
        }
        return listeXMITag;
    }

    /**
     * Crée si non existant dans la table ou récupère depuis la table le tag
     * correspondant au nom.
     * @param tagNom Nom du tag à créer ou à récupérer
     * @return Stéréotype.
     */
    private IXMITag getXMITag(final String tagNom) {
        IXMITag xmiTag = this.tableTag.get(tagNom);
        if (xmiTag == null) {
            xmiTag =
                new XMITagBean(
                        tagNom,
                        "0"
                    );
            this.tableTag
                .put(
                    tagNom,
                    xmiTag
                );
        }
        AssertHelper.assertNotNull(xmiTag, "xmiTag");
        return xmiTag;
    }

	/**
	 * Récupération des datatypes
	 */
	/*
	private List getListeXMIDatatype(Document document) {
		List listeXMIDatatype = new ArrayList();
		List listeElementDatatype = getListeElementDatatype(document);
		for(Iterator iterElementDatatype = listeElementDatatype.iterator(); iterElementDatatype.hasNext(); ) {
			Element elementDatatype = (Element) iterElementDatatype.next();
			String nom = elementDatatype.getAttributeValue("name");
			String xmiId = elementDatatype.getAttributeValue("xmi.id");
			listeXMIDatatype.add(
				new XMIDatatypeBean(
					nom,
					xmiId
				)
			);
		}
		return listeXMIDatatype;
	}

	private List getListeElementDatatype(Document document) {
		Element packageDefinition = getPackageDefinition(document);
		List listeElementDatatype = XmlUtils.getChildren(packageDefinition,NOEUD.STEREOTYPE);
		return listeElementDatatype;
	}

	private Element getPackageDefinition(Document document) {
		Element racine = document.getRootElement();
		List listeNoeud = new ArrayList();
		listeNoeud.add(new Noeud(NOEUD.CONTENT,null));
		listeNoeud.add(new Noeud(NOEUD.MODEL,null));
		listeNoeud.add(new Noeud(NOEUD.NAMESPACE_OWNED_ELEMENT,null));
		listeNoeud.add(new Noeud(NOEUD.PACKAGE,"definition"));
		listeNoeud.add(new Noeud(NOEUD.NAMESPACE_OWNED_ELEMENT,null));
		listeNoeud.add(new Noeud(NOEUD.PACKAGE,"datatype"));
		listeNoeud.add(new Noeud(NOEUD.NAMESPACE_OWNED_ELEMENT,null));
		return XmlUtils.acceder(racine,listeNoeud);
	}
	*/
	/**
	 * Récupération des packages et classes du répertoire datatype
	 */

    private List getListeXMIDatatypeDansDocument(final Document document) {
		final Element elementModel = getModel(document);
		return getListeXMIDatatypeDansPackage(null,elementModel,0);
	}

    private Element getContent(final Document document) {
        final Element racine = document.getRootElement();
        final List listeNoeud = new ArrayList();
        listeNoeud.add(new Noeud(NOEUD.CONTENT,null));
        return XmlUtils.acceder(racine,listeNoeud);
    }

	private Element getModel(final Document document) {
		final Element racine = document.getRootElement();
		final List listeNoeud = new ArrayList();
		listeNoeud.add(new Noeud(NOEUD.CONTENT,null));
		listeNoeud.add(new Noeud(NOEUD.MODEL,null));
		return XmlUtils.acceder(racine,listeNoeud);
	}

	private List getListeXMIDatatypeDansPackage(final String packageParentNom, final Element elementPackage, final int niveauPackage) {
		AssertHelper.assertDefined(elementPackage, "l'élément package");
		AssertHelper.assertBoolean(NOEUD.MODEL.equals(elementPackage.getName())||NOEUD.PACKAGE.equals(elementPackage.getName()),"l'élément n'est ni un model ni un package");
		String packageNom;
		if( niveauPackage == 0 ) {
			packageNom = "";
		} else {
			packageNom = elementPackage.getAttributeValue("name");
			if( ! StringUtils.isBlank(packageParentNom) ) {
				packageNom = packageParentNom + "." + packageNom;
			}
		}
		final List listeXMIDatatype = new ArrayList();
		final List listeElementDatatype = getListeElementDatatypeDansPackage(elementPackage);
		for(final Iterator iterElementDatatype = listeElementDatatype.iterator(); iterElementDatatype.hasNext(); ) {
			final Element elementDatatype = (Element) iterElementDatatype.next();
			final IXMIDatatype xmiDatatype = getXMIDatatypePourElementDatatype(packageNom, elementDatatype);
			listeXMIDatatype.add(xmiDatatype);
		}
		final List listeElementClasse = getListeElementClasseDansPackage(elementPackage);
		for(final Iterator iterElementClasse = listeElementClasse.iterator(); iterElementClasse.hasNext(); ) {
			final Element elementClasse = (Element) iterElementClasse.next();
			final IXMIDatatype xmiDatatype = getXMIDatatypePourElementClasse(packageNom, elementClasse);
			listeXMIDatatype.add(xmiDatatype);
		}
		final List listeElementInterface = getListeElementInterfaceDansPackage(elementPackage);
		for(final Iterator iterElementInterface = listeElementInterface.iterator(); iterElementInterface.hasNext(); ) {
			final Element elementInterface = (Element) iterElementInterface.next();
			final IXMIDatatype xmiDatatype = getXMIDatatypePourElementInterface(packageNom, elementInterface);
			listeXMIDatatype.add(xmiDatatype);
		}
		final List listeXMIPackageFils = new ArrayList();
		// parcourt de la liste des sous-packages
		final List listeElementPackageFils = getListeElementPackageFils(elementPackage);
		for(final Iterator iterElementPackageFils = listeElementPackageFils.iterator(); iterElementPackageFils.hasNext(); ) {
			final Element elementPackageFils = (Element) iterElementPackageFils.next();
			listeXMIDatatype.addAll(getListeXMIDatatypeDansPackage(packageNom, elementPackageFils, niveauPackage + 1));
		}
		return listeXMIDatatype;
	}

	private List getListeElementClasseDansPackage(final Element element) {
		final List listeElementContenuPackage = XmlUtils.getChildren(element, NOEUD.NAMESPACE_OWNED_ELEMENT);
		AssertHelper.assertNotNull(listeElementContenuPackage, "liste d'élément namespaceOwnedElement dans l'élément package");
		if(listeElementContenuPackage.isEmpty()) {
			return new ArrayList();
		}
		AssertHelper.assertBoolean(listeElementContenuPackage.size() == 1, "il y a plus d'un namespaceOwnedElement dans l'élément package");
		final Element elementContenuPackage = (Element) listeElementContenuPackage.get(0);
		final List listeElementClasse = XmlUtils.getChildren(elementContenuPackage, NOEUD.CLASS);
		listeElementClasse.addAll( XmlUtils.getChildren(elementContenuPackage, NOEUD.ASSOCIATIONCLASS) );
		return listeElementClasse;
	}

	private IXMIDatatype getXMIDatatypePourElementClasse(final String packageNom, final Element elementClasse) {
		AssertHelper.assertDefined(elementClasse, "l'élément classe");
		AssertHelper.assertBoolean(NOEUD.CLASS.equals(elementClasse.getName()),"l'élément n'est pas une classe");
		String classeNom = elementClasse.getAttributeValue("name");
		if( ! StringUtils.isBlank(packageNom) ) {
			classeNom = packageNom + "." + classeNom;
		}
		final String xmiId = elementClasse.getAttributeValue("xmi.id");
		final IXMIDatatype xmiDatatype = new XMIDatatypeBean(
			classeNom,
			xmiId
		);
		return xmiDatatype;
	}

	private List getListeElementInterfaceDansPackage(final Element element) {
		final List listeElementContenuPackage = XmlUtils.getChildren(element, NOEUD.NAMESPACE_OWNED_ELEMENT);
		AssertHelper.assertNotNull(listeElementContenuPackage, "liste d'élément namespaceOwnedElement dans l'élément package");
		if(listeElementContenuPackage.isEmpty()) {
			return new ArrayList();
		}
		AssertHelper.assertBoolean(listeElementContenuPackage.size() == 1, "il y a plus d'un namespaceOwnedElement dans l'élément package");
		final Element elementContenuPackage = (Element) listeElementContenuPackage.get(0);
		return XmlUtils.getChildren(elementContenuPackage, NOEUD.INTERFACE);
	}

	private IXMIDatatype getXMIDatatypePourElementInterface(final String packageNom, final Element elementInterface) {
		AssertHelper.assertDefined(elementInterface, "l'élément interface");
		AssertHelper.assertBoolean(NOEUD.INTERFACE.equals(elementInterface.getName()),"l'élément n'est pas une interface");
		String interfaceNom = elementInterface.getAttributeValue("name");
		if( ! StringUtils.isBlank(packageNom) ) {
			interfaceNom = packageNom + "." + interfaceNom;
		}
		final String xmiId = elementInterface.getAttributeValue("xmi.id");
		final IXMIDatatype xmiDatatype = new XMIDatatypeBean(
			interfaceNom,
			xmiId
		);
		return xmiDatatype;
	}

	private List getListeElementDatatypeDansPackage(final Element element) {
		final List listeElementContenuPackage = XmlUtils.getChildren(element, NOEUD.NAMESPACE_OWNED_ELEMENT);
		AssertHelper.assertNotNull(listeElementContenuPackage, "liste d'élément namespaceOwnedElement dans l'élément package");
		if(listeElementContenuPackage.isEmpty()) {
			return new ArrayList();
		}
		AssertHelper.assertBoolean(listeElementContenuPackage.size() == 1, "il y a plus d'un namespaceOwnedElement dans l'élément package");
		final Element elementContenuPackage = (Element) listeElementContenuPackage.get(0);
		return XmlUtils.getChildren(elementContenuPackage, NOEUD.DATATYPE);
	}

	private IXMIDatatype getXMIDatatypePourElementDatatype(final String packageNom, final Element elementDatatype) {
		AssertHelper.assertDefined(elementDatatype, "l'élément datatype");
		AssertHelper.assertBoolean(NOEUD.DATATYPE.equals(elementDatatype.getName()),"l'élément n'est pas un datatype");
		final String datatypeNom = elementDatatype.getAttributeValue("name");
		final String xmiId = elementDatatype.getAttributeValue("xmi.id");
		final IXMIDatatype xmiDatatype = new XMIDatatypeBean(
			datatypeNom,
			xmiId
		);
		return xmiDatatype;
	}

	/**
	 * Récupération des packages et classes du répertoire source
	 */

	private List getListeXMIPackageDansPackageSourceDuDocument(final Document document) {
		final Element elementPackageSource = getPackageSource(document);
		return getListeXMIPackageDansPackage(null,elementPackageSource);
	}

	private Element getPackageSource(final Document document) {
		final Element racine = document.getRootElement();
		final List listeNoeud = new ArrayList();
		listeNoeud.add(new Noeud(NOEUD.CONTENT,null));
		listeNoeud.add(new Noeud(NOEUD.MODEL,null));
        listeNoeud.add(new Noeud(NOEUD.NAMESPACE_OWNED_ELEMENT,null));
        listeNoeud.add(new Noeud(NOEUD.PACKAGE,"projet"));
		listeNoeud.add(new Noeud(NOEUD.NAMESPACE_OWNED_ELEMENT,null));
		listeNoeud.add(new Noeud(NOEUD.PACKAGE,"src"));
		return XmlUtils.acceder(racine,listeNoeud);
	}

	/**
	 * @return la liste des xmiPackage fils de l'élément package fourni
	 * @param package package parent (null si paclage racine = 1er appel de cette méthode)
	 * @param elementPackage noeud du package
	 */
	private List getListeXMIPackageDansPackage(final IXMIPackage packageParent, final Element elementPackage) {
		AssertHelper.assertDefined(elementPackage, "l'élément package");
		AssertHelper.assertBoolean(NOEUD.PACKAGE.equals(elementPackage.getName()),"l'élément n'est pas un package");
		final List listeXMIPackageFils = new ArrayList();
		// parcourt de la liste des sous-packages
		final List listeElementPackageFils = getListeElementPackageFils(elementPackage);
		for(final Iterator iterElementPackageFils = listeElementPackageFils.iterator(); iterElementPackageFils.hasNext(); ) {
			final Element elementPackageFils = (Element) iterElementPackageFils.next();
			final IXMIPackage xmiPackageFils = getXMIPackage(packageParent, elementPackageFils);
			listeXMIPackageFils.add(xmiPackageFils);
		}
		return listeXMIPackageFils;
	}

	private List getListeElementPackageFils(final Element element) {
		final List listeElementContenuPackage = XmlUtils.getChildren(element, NOEUD.NAMESPACE_OWNED_ELEMENT);
		AssertHelper.assertNotNull(listeElementContenuPackage, "liste d'élément namespaceOwnedElement dans l'élément package");
		if(listeElementContenuPackage.isEmpty()) {
			return new ArrayList();
		}
		AssertHelper.assertBoolean(listeElementContenuPackage.size() == 1, "il y a plus d'un namespaceOwnedElement dans l'élément package");
		final Element elementContenuPackage = (Element) listeElementContenuPackage.get(0);
		return XmlUtils.getChildren(elementContenuPackage, NOEUD.PACKAGE);
	}

	private IXMIPackage getXMIPackage(final IXMIPackage packageParent, final Element elementPackage) {
		AssertHelper.assertDefined(elementPackage, "l'élément package");
		AssertHelper.assertBoolean(NOEUD.PACKAGE.equals(elementPackage.getName()),"l'élément n'est pas un package");
		final String packageNom = elementPackage.getAttributeValue("name");
		final String xmiId = elementPackage.getAttributeValue("xmi.id");
		final IXMIPackage xmiPackage = new XMIPackageBean(
			packageNom,
			xmiId,
			packageParent
		);
		final List listeXMIClasse = getListeXMIClasseDansPackage(xmiPackage, elementPackage);
		xmiPackage.setListeClasse(listeXMIClasse);
		final List listeXMIPackage = getListeXMIPackageDansPackage(xmiPackage,elementPackage);
		xmiPackage.setListePackageFils(listeXMIPackage);
		return xmiPackage;
	}

	private List getListeXMIClasseDansPackage(final IXMIPackage packageParent, final Element elementPackage) {
		final List listeXMIClasse = new ArrayList();
		final List listeElementClasse = getListeElementClasseDansPackage(elementPackage);
		for(final Iterator iterElementClasse = listeElementClasse.iterator(); iterElementClasse.hasNext(); ) {
			final Element elementClasse = (Element) iterElementClasse.next();
			final IXMIClasse classe = getXMIClasse(packageParent, elementClasse);
			listeXMIClasse.add(classe);
		}
		return listeXMIClasse;
	}

	private IXMIClasse getXMIClasse(final IXMIPackage packageParent, final Element elementClasse) {
		AssertHelper.assertDefined(elementClasse, "l'élément classe");
		AssertHelper.assertBoolean(NOEUD.CLASS.equals(elementClasse.getName()) || NOEUD.ASSOCIATIONCLASS.equals(elementClasse.getName()),"l'élément n'est pas une classe");
		final String classeNom = elementClasse.getAttributeValue("name");
		final String xmiId = elementClasse.getAttributeValue("xmi.id");
		final IXMIClasse xmiClasse = new XMIClasseBean(
			classeNom,
			xmiId,
			packageParent
		);
		getXMIClasseEtElementClasseManager()
			.addToMapXMIClasseEtElementClasse(xmiClasse, elementClasse);
        getTableXMIClasse()
            .put(xmiClasse.getXmiId(), xmiClasse);
		return xmiClasse;
	}

	private List getListeXMIAssociationClasseDansPackage(final IXMIPackage packageParent, final Element elementPackage) {
		final List listeXMIClasse = new ArrayList();
		final List listeElementClasse = getListeElementClasseDansPackage(elementPackage);
		for(final Iterator iterElementClasse = listeElementClasse.iterator(); iterElementClasse.hasNext(); ) {
			final Element elementClasse = (Element) iterElementClasse.next();
			final IXMIClasse classe = getXMIClasse(packageParent, elementClasse);
			listeXMIClasse.add(classe);
		}
		return listeXMIClasse;
	}

	private void defineListeXMIClasse() {
		for( final Iterator iterXMIClasseEtElementClasse = getXMIClasseEtElementClasseManager().getIteratorXMIClasseEtElementClasse(); iterXMIClasseEtElementClasse.hasNext(); ) {
			final XMIClasseEtElementClasse xmiClasseEtElementClasse = (XMIClasseEtElementClasse) iterXMIClasseEtElementClasse.next();
			defineXMIClasse(xmiClasseEtElementClasse.getXmiClasse(), xmiClasseEtElementClasse.getElementClasse());
		}
	}

	private IXMIClasse defineXMIClasse(final IXMIClasse xmiClasse, final Element elementClasse) {
		xmiClasse
			.setListeStereotype(
				getListeXMIStereotypePourClasse(elementClasse)
			);
		/*
        xmiClasse
            .setListeTaggedValue(
                getListeXMITaggedValuePourClasse(elementClasse)
            );
        */
		xmiClasse
			.setListeAttribut(
				getListeXMIAttributPourClasse(elementClasse, xmiClasse)
			);
		xmiClasse
			.setListeOperation(
				getListeXMIOperationPourClasse(elementClasse, xmiClasse)
			);
		return xmiClasse;
	}


	private List getListeXMIStereotypePourClasse(final Element elementClasse) {
		final List listeXMIStereotype = new ArrayList();
		final List listeElementStereotypePourClasse = getListeElementStereotypePourClasse(elementClasse);
		for(final Iterator iterElementStereotypePourClasse = listeElementStereotypePourClasse.iterator(); iterElementStereotypePourClasse.hasNext(); ) {
			final Element elementStereotypePourClasse = (Element) iterElementStereotypePourClasse.next();
			final String stereotypeNom = elementStereotypePourClasse.getAttributeValue("name");
			AssertHelper.assertDefined(stereotypeNom, "nom du stéréotype");
			final IXMIStereotype xmiStereotype = getXMIStereotype(stereotypeNom);
			AssertHelper.assertDefined(xmiStereotype, "nom du stéréotype = '"+stereotypeNom+"'");
			listeXMIStereotype.add(xmiStereotype);
		}
		return listeXMIStereotype;
	}

	private List getListeElementStereotypePourClasse(final Element element) {
		final List listeElementStereotypePourClasse = XmlUtils.getChildren(element, NOEUD.MODEL_ELEMENT_STEREOTYPE);
		if( (listeElementStereotypePourClasse == null) || listeElementStereotypePourClasse.isEmpty() ) {
			return new ArrayList();
		}
		AssertHelper.assertDefined(listeElementStereotypePourClasse, "liste d'élément modelElementStereotype dans l'élément package");
		AssertHelper.assertBoolean(listeElementStereotypePourClasse.size() == 1, "il y a plus d'un modelElementStereotype dans l'élément package");
		final Element elementStereotypePourClasse = (Element) listeElementStereotypePourClasse.get(0);
		return XmlUtils.getChildren(elementStereotypePourClasse, NOEUD.STEREOTYPE);
	}


    private List getListeXMITaggedValuePourClasse(final Element elementClasse) {
        final List listeXMITaggedValue = new ArrayList();
        final List listeElementTaggedValuePourClasse = getListeElementTaggedValuePourClasse(elementClasse);
        for(final Iterator iterElementTaggedValuePourClasse = listeElementTaggedValuePourClasse.iterator(); iterElementTaggedValuePourClasse.hasNext(); ) {
            final Element elementTaggedValuePourClasse = (Element) iterElementTaggedValuePourClasse.next();
            final String valeur = elementTaggedValuePourClasse.getAttributeValue("value");
            final String tagNom = elementTaggedValuePourClasse.getAttributeValue("tag");
            AssertHelper.assertDefined(tagNom, "nom du tag");
            final IXMITag xmiTag = getXMITag(tagNom);
            AssertHelper.assertDefined(xmiTag, "nom du tag = '"+tagNom+"'");
            final IXMITaggedValue xmiTaggedValue =
                new XMITaggedValueBean(valeur, "0", xmiTag);
            listeXMITaggedValue.add(xmiTaggedValue);
        }
        return listeXMITaggedValue;
    }

    private List getListeElementTaggedValuePourClasse(final Element element) {
        final List listeElementTaggedValuePourClasse = XmlUtils.getChildren(element, NOEUD.MODEL_ELEMENT_TAGGED_VALUE);
        if( (listeElementTaggedValuePourClasse == null) || listeElementTaggedValuePourClasse.isEmpty() ) {
            return new ArrayList();
        }
        AssertHelper.assertDefined(listeElementTaggedValuePourClasse, "liste d'élément modelElementTaggedValue dans l'élément package");
        AssertHelper.assertBoolean(listeElementTaggedValuePourClasse.size() == 1, "il y a plus d'un modelElementTaggedValue dans l'élément package");
        final Element elementTaggedValuePourClasse = (Element) listeElementTaggedValuePourClasse.get(0);
        return XmlUtils.getChildren(elementTaggedValuePourClasse, NOEUD.TAGGED_VALUE);
    }



	private List getListeXMIAttributPourClasse(final Element elementClasse, final IXMIClasse xmiClasse) {
		final List listeXMIAttribut = new ArrayList();
		final List listeElementAttributPourClasse = getListeElementAttributPourClasse(elementClasse);
		for(final Iterator iterElementAttributPourClasse = listeElementAttributPourClasse.iterator(); iterElementAttributPourClasse.hasNext(); ) {
			final Element elementAttributPourClasse = (Element) iterElementAttributPourClasse.next();
			final String attributXmiId = elementAttributPourClasse.getAttributeValue("name");
			AssertHelper.assertDefined(attributXmiId, "xmiIdRef de l'attribut");
			final IXMIAttribut xmiAttribut = getXMIAttribut(elementAttributPourClasse, xmiClasse);
			AssertHelper.assertDefined(xmiAttribut, "attribut de xmiIdRef = '"+attributXmiId+"'");
			listeXMIAttribut.add(xmiAttribut);
		}
		return listeXMIAttribut;
	}

	private List getListeElementAttributPourClasse(final Element element) {
		final List listeElementAttributPourClasse = XmlUtils.getChildren(element, NOEUD.CLASSIFIER_FEATURE);
		if( (listeElementAttributPourClasse == null) || listeElementAttributPourClasse.isEmpty() ) {
			return new ArrayList();
		}
		AssertHelper.assertDefined(listeElementAttributPourClasse, "liste d'élément modelElementAttribut dans l'élément package");
		AssertHelper.assertBoolean(listeElementAttributPourClasse.size() == 1, "il y a plus d'un modelElementAttribut dans l'élément package");
		final Element elementAttributPourClasse = (Element) listeElementAttributPourClasse.get(0);
		return XmlUtils.getChildren(elementAttributPourClasse, NOEUD.ATTRIBUTE);
	}

	private IXMIAttribut getXMIAttribut(final Element elementAttribut, final IXMIClasse xmiClasse) {
		AssertHelper.assertDefined(elementAttribut, "l'élément attribut");
		AssertHelper.assertBoolean(NOEUD.ATTRIBUTE.equals(elementAttribut.getName()),"l'élément n'est pas un attribut");
		final String attributNom = elementAttribut.getAttributeValue("name");
		final String xmiId = attributNom; // elementAttribut.getAttributeValue("xmi.id");
		final IXMIType xmiType = getXMITypePourAttribut(elementAttribut);
		final IXMIMultiplicity xmiMultiplicity = getXMIMultiplicityPourAttribut(elementAttribut);
		final IXMIAttribut xmiAttribut = new XMIAttributBean(
				attributNom,
				xmiId,
				xmiType,
				xmiMultiplicity,
				xmiClasse
			);
        xmiAttribut
            .setListeStereotype(
                    getListeXMIStereotypePourAttribut(elementAttribut)
            );
        xmiAttribut
            .setListeTaggedValue(
                    getListeXMITaggedValuePourAttribut(elementAttribut)
            );
		return xmiAttribut;
	}

	private IXMIType getXMITypePourAttribut(final Element elementAttribut) {
		final List listeElementDatatype = getListeElementDatatypePourAttribut(elementAttribut);
		return getXMITypePourListeElementDatatype(listeElementDatatype);
	}

	private List getListeElementDatatypePourAttribut(final Element elementAttribut) {
		final List listeElementDatatype = XmlUtils.getChildren(elementAttribut, NOEUD.STRUCTURAL_FEATURE_TYPE);
		AssertHelper.assertDefined(listeElementDatatype, "liste d'élément datatype");
		AssertHelper.assertBoolean(listeElementDatatype.size() == 1, "il y a plus d'un élément datatype");
		final Element elementDatatype = (Element) listeElementDatatype.get(0);
		return XmlUtils.getChildren(elementDatatype);
	}

	private IXMIType getXMITypePourListeElementDatatype(final List listeElementDatatype) {
		final Iterator iterElementDatatype = listeElementDatatype.iterator();
		AssertHelper.assertBoolean(iterElementDatatype.hasNext(),"il n'y a pas d'élément datatype");
		final Element elementDatatype = (Element) iterElementDatatype.next();
		final String xmiIdRef = elementDatatype.getAttributeValue("xmi.idref");
		AssertHelper.assertDefined(xmiIdRef, "xmiIdRef du datatype");
		IXMIType xmiType;
		// recherche du XMIDatatype associé au datatype de l'attribut
		xmiType = IXMIClasse.Manager.getXMIClasseFromMapByXmiId(xmiIdRef);
		if( xmiType == null ) {
			xmiType = IXMIDatatype.Manager.getXMIDatatypeFromMapByXmiId(xmiIdRef);
		}
		AssertHelper.assertDefined(xmiType, "le type associé au xmiIdRef du datatype (xmiIdRef='"+xmiIdRef+"')");
		return xmiType;
	}
	/*
	private XMINoeud getXMINoeudDeDatatypePourAttribut(Element element) {
		List listeElementDatatypePourAttribut = getListeElementDatatypePourAttribut(element);
		Iterator iterElementDatatypePourAttribut = listeElementDatatypePourAttribut.iterator();
		AssertHelper.assertBoolean(iterElementDatatypePourAttribut.hasNext(),"il n'y a pas d'élément datatype pour l'attribut");
		Element elementDatatype = (Element) iterElementDatatypePourAttribut.next();
		String xmiIdRef = elementDatatype.getAttributeValue("xmi.idref");
		AssertHelper.assertDefined(xmiIdRef, "xmiIdRef du datatype de l'attribut");
		// recherche du XMINoeud associé au datatype de l'attribut
		XMINoeud xmiNoeud = getXMINoeudByXmiId(xmiIdRef);
		AssertHelper.assertDefined(xmiNoeud, "le noeud associé au xmiIdRef du datatype de l'attribut");
		return xmiNoeud;
	}

	private List getListeElementDatatypePourAttribut(Element element) {
		List listeElementDatatypePourAttribut = XmlUtils.getChildren(element, NOEUD.STRUCTURAL_FEATURE_TYPE);
		AssertHelper.assertDefined(listeElementDatatypePourAttribut, "liste d'élément modelElementAttribut dans l'élément package");
		AssertHelper.assertBoolean(listeElementDatatypePourAttribut.size() == 1, "il y a plus d'un modelElementAttribut dans l'élément package");
		Element elementDatatypePourAttribut = (Element) listeElementDatatypePourAttribut.get(0);
		return XmlUtils.getChildren(elementDatatypePourAttribut);
	}
	*/


    private List getListeXMIStereotypePourAttribut(final Element elementAttribut) {
        final List listeXMIStereotype = new ArrayList();
        final List listeElementStereotypePourAttribut = getListeElementStereotypePourAttribut(elementAttribut);
        for(final Iterator iterElementStereotypePourAttribut = listeElementStereotypePourAttribut.iterator(); iterElementStereotypePourAttribut.hasNext(); ) {
            final Element elementStereotypePourAttribut = (Element) iterElementStereotypePourAttribut.next();
            final String stereotypeNom = elementStereotypePourAttribut.getAttributeValue("name");
            AssertHelper.assertDefined(stereotypeNom, "nom du stéréotype");
            final IXMIStereotype xmiStereotype = getXMIStereotype(stereotypeNom);
            AssertHelper.assertDefined(xmiStereotype, "nom du stéréotype = '"+stereotypeNom+"'");
            listeXMIStereotype.add(xmiStereotype);
        }
        return listeXMIStereotype;
    }

    private List getListeElementStereotypePourAttribut(final Element element) {
        final List listeElementStereotypePourAttribut = XmlUtils.getChildren(element, NOEUD.MODEL_ELEMENT_STEREOTYPE);
        if( (listeElementStereotypePourAttribut == null) || listeElementStereotypePourAttribut.isEmpty() ) {
            return new ArrayList();
        }
        AssertHelper.assertDefined(listeElementStereotypePourAttribut, "liste d'élément modelElementStereotype dans l'élément package");
        AssertHelper.assertBoolean(listeElementStereotypePourAttribut.size() == 1, "il y a plus d'un modelElementStereotype dans l'élément package");
        final Element elementStereotypePourAttribut = (Element) listeElementStereotypePourAttribut.get(0);
        return XmlUtils.getChildren(elementStereotypePourAttribut, NOEUD.STEREOTYPE);
    }


    private List getListeXMITaggedValuePourAttribut(final Element elementAttribut) {
        final List listeXMITaggedValue = new ArrayList();
        final List listeElementTaggedValuePourAttribut = getListeElementTaggedValuePourAttribut(elementAttribut);
        for(final Iterator iterElementTaggedValuePourAttribut = listeElementTaggedValuePourAttribut.iterator(); iterElementTaggedValuePourAttribut.hasNext(); ) {
            final Element elementTaggedValuePourAttribut = (Element) iterElementTaggedValuePourAttribut.next();
            final String valeur = elementTaggedValuePourAttribut.getAttributeValue("value");
            final String tagNom = elementTaggedValuePourAttribut.getAttributeValue("tag");
            AssertHelper.assertDefined(tagNom, "nom du tag");
            final IXMITag xmiTag = getXMITag(tagNom);
            AssertHelper.assertDefined(xmiTag, "nom du tag = '"+tagNom+"'");
            final IXMITaggedValue xmiTaggedValue =
                new XMITaggedValueBean(valeur, "0", xmiTag);
            listeXMITaggedValue.add(xmiTaggedValue);
        }
        return listeXMITaggedValue;
    }

    private List getListeElementTaggedValuePourAttribut(final Element element) {
        final List listeElementTaggedValuePourAttribut = XmlUtils.getChildren(element, NOEUD.MODEL_ELEMENT_TAGGED_VALUE);
        if( (listeElementTaggedValuePourAttribut == null) || listeElementTaggedValuePourAttribut.isEmpty() ) {
            return new ArrayList();
        }
        AssertHelper.assertDefined(listeElementTaggedValuePourAttribut, "liste d'élément modelElementTaggedValue dans l'élément package");
        AssertHelper.assertBoolean(listeElementTaggedValuePourAttribut.size() == 1, "il y a plus d'un modelElementTaggedValue dans l'élément package");
        final Element elementTaggedValuePourAttribut = (Element) listeElementTaggedValuePourAttribut.get(0);
        return XmlUtils.getChildren(elementTaggedValuePourAttribut, NOEUD.TAGGED_VALUE);
    }



	private List getListeXMIOperationPourClasse(final Element elementClasse, final IXMIClasse xmiClasse) {
		final List listeXMIOperation = new ArrayList();
		final List listeElementOperationPourClasse = getListeElementOperationPourClasse(elementClasse);
		for(final Iterator iterElementOperationPourClasse = listeElementOperationPourClasse.iterator(); iterElementOperationPourClasse.hasNext(); ) {
			final Element elementOperationPourClasse = (Element) iterElementOperationPourClasse.next();
			final String operationXmiId = elementOperationPourClasse.getAttributeValue("name");
			AssertHelper.assertDefined(operationXmiId, "xmiIdRef de l'operation");
			final IXMIOperation xmiOperation = getXMIOperation(elementOperationPourClasse, xmiClasse);
			AssertHelper.assertDefined(xmiOperation, "operation de xmiIdRef = '"+operationXmiId+"'");
			listeXMIOperation.add(xmiOperation);
		}
		return listeXMIOperation;
	}

	private List getListeElementOperationPourClasse(final Element element) {
		final List listeElementOperationPourClasse = XmlUtils.getChildren(element, NOEUD.CLASSIFIER_FEATURE);
		if( (listeElementOperationPourClasse == null) || listeElementOperationPourClasse.isEmpty() ) {
			return new ArrayList();
		}
		AssertHelper.assertDefined(listeElementOperationPourClasse, "liste d'élément modelElementOperation dans l'élément package");
		AssertHelper.assertBoolean(listeElementOperationPourClasse.size() == 1, "il y a plus d'un modelElementOperation dans l'élément package");
		final Element elementOperationPourClasse = (Element) listeElementOperationPourClasse.get(0);
		return XmlUtils.getChildren(elementOperationPourClasse, NOEUD.OPERATION);
	}

	private IXMIOperation getXMIOperation(final Element elementOperation, final IXMIClasse xmiClasse) {
		AssertHelper.assertDefined(elementOperation, "l'élément operation");
		AssertHelper.assertBoolean(NOEUD.OPERATION.equals(elementOperation.getName()),"l'élément n'est pas un operation");
		final String operationNom = elementOperation.getAttributeValue("name");
		final String xmiId = operationNom; // elementOperation.getAttributeValue("xmi.id");
		final IXMIOperation xmiOperation = new XMIOperationBean(
				operationNom,
				xmiId,
				xmiClasse
			);
		final List listeXMIParametrePourOperation = getListeXMIParametrePourOperation(elementOperation, xmiOperation);
		IXMIParametre xmiParametreRetour = null;
		for(final Iterator iterXMIParametrePourOperation = listeXMIParametrePourOperation.iterator(); iterXMIParametrePourOperation.hasNext(); ) {
			final IXMIParametre xmiParametrePourOperation = (IXMIParametre) iterXMIParametrePourOperation.next();
			if( "return".equals(xmiParametrePourOperation.getNom()) ) {
				xmiParametreRetour = xmiParametrePourOperation;
			}
		}
		AssertHelper.assertDefined(xmiParametreRetour, "le paramètre retour de l'opération");
		listeXMIParametrePourOperation.remove(xmiParametreRetour);
		AssertHelper.assertDefined(xmiParametreRetour, "le xmiId du datatype du paramètre retour de l'opération");
		xmiOperation.setParametreRetour(xmiParametreRetour);

		xmiOperation.setListeParametre(listeXMIParametrePourOperation);
        xmiOperation
            .setListeStereotype(
                    getListeXMIStereotypePourOperation(elementOperation)
            );
        xmiOperation
            .setListeTaggedValue(
                    getListeXMITaggedValuePourOperation(elementOperation)
            );
		return xmiOperation;
	}

	private List getListeXMIParametrePourOperation(final Element elementOperation, final IXMIOperation xmiOperation) {
		final List listeElementParametrePourOperation = getListeElementParametrePourOperation(elementOperation);
		final Iterator iterElementParametrePourOperation = listeElementParametrePourOperation.iterator();
		AssertHelper.assertBoolean(iterElementParametrePourOperation.hasNext(),"il n'y a pas d'élément paramètre pour l'opération");
		final List listeXMIParametre = new ArrayList();
		while( iterElementParametrePourOperation.hasNext() ) {
			final Element elementParametre = (Element) iterElementParametrePourOperation.next();
			final IXMIParametre xmiParametre = getXMIParametre(elementParametre, xmiOperation);
			listeXMIParametre.add(xmiParametre);
		}
		return listeXMIParametre;
	}

	private List getListeElementParametrePourOperation(final Element elementOperation) {
		final List listeElementBehavorialFeatureParameterPourOperation = XmlUtils.getChildren(elementOperation, NOEUD.BEHAVORIAL_FEATURE_PARAMETER);
		AssertHelper.assertDefined(listeElementBehavorialFeatureParameterPourOperation, "liste d'éléments behavorialFeatureParameter dans l'élément opération");
		AssertHelper.assertBoolean(listeElementBehavorialFeatureParameterPourOperation.size() == 1, "il y a plus d'un behavorialFeatureParameter dans l'élément opération");
		final Element elementBehavorialFeatureParameterPourOperation = (Element) listeElementBehavorialFeatureParameterPourOperation.get(0);
		return XmlUtils.getChildren(elementBehavorialFeatureParameterPourOperation,NOEUD.PARAMETER);
	}

	private IXMIParametre getXMIParametre(final Element elementParametre, final IXMIOperation xmiOperation) {
		String nom = elementParametre.getAttributeValue("name");
        final String kind = elementParametre.getAttributeValue("kind");
        if (StringUtils.isBlank(nom)) {
            nom = kind;
        }
		AssertHelper.assertDefined(nom, "nom du paramètre");
		final String xmiId = nom; // elementParametre.getAttributeValue("xmi.id");
		AssertHelper.assertDefined(xmiId, "xmiId du paramètre");
		// type du paramètre
		final IXMIType xmiType = getXMITypePourParametre(elementParametre);
		final IXMIParametre parametre = new XMIParametreBean(
				nom,
				xmiId,
				xmiType,
				xmiOperation
			);
		AssertHelper.assertDefined(parametre, "le noeud associé au xmiIdRef du datatype de l'opération");
		return parametre;
	}

	private IXMIType getXMITypePourParametre(final Element elementParametre) {
		final List listeElementDatatype = getListeElementDatatypePourParametre(elementParametre);
		return getXMITypePourListeElementDatatype(listeElementDatatype);
	}

	private List getListeElementDatatypePourParametre(final Element elementParametre) {
		final List listeElementDatatype = XmlUtils.getChildren(elementParametre, NOEUD.PARAMETER_TYPE);
		AssertHelper.assertDefined(listeElementDatatype, "liste d'élément datatype");
		AssertHelper.assertBoolean(listeElementDatatype.size() == 1, "il y a plus d'un élément datatype");
		final Element elementDatatype = (Element) listeElementDatatype.get(0);
		return XmlUtils.getChildren(elementDatatype);
	}
/*
	private XMINoeud getXMINoeudDeDatatypePourParametre(Element elementParametre) {
		List listeElementDatatypePourParametre = getListeElementDatatypePourParametre(elementParametre);
		Iterator iterElementDatatypePourParametre = listeElementDatatypePourParametre.iterator();
		AssertHelper.assertBoolean(iterElementDatatypePourParametre.hasNext(),"il n'y a pas d'élément datatype pour le paramètre");
		Element elementDatatype = (Element) iterElementDatatypePourParametre.next();
		String xmiIdRef = elementDatatype.getAttributeValue("xmi.idref");
		AssertHelper.assertDefined(xmiIdRef, "xmiIdRef du datatype du paramètre");
		// recherche du XMINoeud associé au datatype de l'attribut
		XMINoeud xmiNoeud = getXMINoeudByXmiId(xmiIdRef);
		AssertHelper.assertDefined(xmiNoeud, "le noeud associé au xmiIdRef du datatype du paramètre");
		return xmiNoeud;
	}

	private List getListeElementDatatypePourParametre(Element elementParametre) {
		List listeElementDatatypePourParametre = XmlUtils.getChildren(elementParametre, NOEUD.PARAMETER_TYPE);
		AssertHelper.assertDefined(listeElementDatatypePourParametre, "liste d'élément parametre.Type dans l'élément parametre");
		AssertHelper.assertBoolean(listeElementDatatypePourParametre.size() == 1, "il y a plus d'un parametre.Type dans l'élément parametre");
		Element elementDatatypePourParametre = (Element) listeElementDatatypePourParametre.get(0);
		return XmlUtils.getChildren(elementDatatypePourParametre);
	}
*/


    private List getListeXMIStereotypePourOperation(final Element elementOperation) {
        final List listeXMIStereotype = new ArrayList();
        final List listeElementStereotypePourOperation = getListeElementStereotypePourOperation(elementOperation);
        for(final Iterator iterElementStereotypePourOperation = listeElementStereotypePourOperation.iterator(); iterElementStereotypePourOperation.hasNext(); ) {
            final Element elementStereotypePourOperation = (Element) iterElementStereotypePourOperation.next();
            final String stereotypeNom = elementStereotypePourOperation.getAttributeValue("name");
            AssertHelper.assertDefined(stereotypeNom, "nom du stéréotype");
            final IXMIStereotype xmiStereotype = getXMIStereotype(stereotypeNom);
            AssertHelper.assertDefined(xmiStereotype, "nom du stéréotype = '"+stereotypeNom+"'");
            listeXMIStereotype.add(xmiStereotype);
        }
        return listeXMIStereotype;
    }

    private List getListeElementStereotypePourOperation(final Element element) {
        final List listeElementStereotypePourOperation = XmlUtils.getChildren(element, NOEUD.MODEL_ELEMENT_STEREOTYPE);
        if( (listeElementStereotypePourOperation == null) || listeElementStereotypePourOperation.isEmpty() ) {
            return new ArrayList();
        }
        AssertHelper.assertDefined(listeElementStereotypePourOperation, "liste d'élément modelElementStereotype dans l'élément package");
        AssertHelper.assertBoolean(listeElementStereotypePourOperation.size() == 1, "il y a plus d'un modelElementStereotype dans l'élément package");
        final Element elementStereotypePourOperation = (Element) listeElementStereotypePourOperation.get(0);
        return XmlUtils.getChildren(elementStereotypePourOperation, NOEUD.STEREOTYPE);
    }


    private List getListeXMITaggedValuePourOperation(final Element elementOperation) {
        final List listeXMITaggedValue = new ArrayList();
        final List listeElementTaggedValuePourOperation = getListeElementTaggedValuePourOperation(elementOperation);
        for(final Iterator iterElementTaggedValuePourOperation = listeElementTaggedValuePourOperation.iterator(); iterElementTaggedValuePourOperation.hasNext(); ) {
            final Element elementTaggedValuePourOperation = (Element) iterElementTaggedValuePourOperation.next();
            final String valeur = elementTaggedValuePourOperation.getAttributeValue("value");
            final String tagNom = elementTaggedValuePourOperation.getAttributeValue("tag");
            AssertHelper.assertDefined(tagNom, "nom du tag");
            final IXMITag xmiTag = getXMITag(tagNom);
            AssertHelper.assertDefined(xmiTag, "nom du tag = '"+tagNom+"'");
            final IXMITaggedValue xmiTaggedValue =
                new XMITaggedValueBean(valeur, "0", xmiTag);
            listeXMITaggedValue.add(xmiTaggedValue);
        }
        return listeXMITaggedValue;
    }

    private List getListeElementTaggedValuePourOperation(final Element element) {
        final List listeElementTaggedValuePourOperation = XmlUtils.getChildren(element, NOEUD.MODEL_ELEMENT_TAGGED_VALUE);
        if( (listeElementTaggedValuePourOperation == null) || listeElementTaggedValuePourOperation.isEmpty() ) {
            return new ArrayList();
        }
        AssertHelper.assertDefined(listeElementTaggedValuePourOperation, "liste d'élément modelElementTaggedValue dans l'élément package");
        AssertHelper.assertBoolean(listeElementTaggedValuePourOperation.size() == 1, "il y a plus d'un modelElementTaggedValue dans l'élément package");
        final Element elementTaggedValuePourOperation = (Element) listeElementTaggedValuePourOperation.get(0);
        return XmlUtils.getChildren(elementTaggedValuePourOperation, NOEUD.TAGGED_VALUE);
    }




	/**************************************
	 * Gestion des associations
	 **************************************/
	/* A SUPPRIMER
	private List listeElementAssociation = new ArrayList();
	private Map mapElementAssociationByParticipantXmiIdRef = new HashMap();

	private void loadListeAndMapElementAssociation(Document document) {
		Element racine = document.getRootElement();
		AssertHelper.assertDefined(racine, "racine");
		listeElementAssociation = XmlUtils.getListeElementByNomNoeud(racine,NOEUD.ASSOCIATION);
		getListeElementAssociation
	}
	*/

	/* Lecture des associations du xmi */

	private void loadListeElementAssociation(final Document document, final IXMI xmi) {
		final List listeElementAssociation = XmlUtils.getListeElementByNomNoeud(document.getRootElement(),NOEUD.ASSOCIATION);
		for( final Iterator iterAssociation = listeElementAssociation.iterator(); iterAssociation.hasNext(); ) {
			final Element elementAssociation = (Element) iterAssociation.next();
			final IXMIAssociation xmiAssociation = getXMIAssociation(elementAssociation);
			xmi.addAssociation(xmiAssociation);
		}
	}

	private IXMIAssociation getXMIAssociation(final Element elementAssociation) {
		final String xmiId = elementAssociation.getAttributeValue("xmi.id");
		AssertHelper.assertDefined(xmiId, "xmiId de l'élément association");
		final List listeElementAssociationConnection = XmlUtils.getChildren(elementAssociation,NOEUD.ASSOCIATION_CONNECTION);
		AssertHelper.assertDefined(listeElementAssociationConnection, "liste des éléments ASSOCIATION_CONNECTION du noeud ASSOCIATION.");
		AssertHelper.assertBoolean(listeElementAssociationConnection.size() == 1, "Le nombre d'éléments ASSOCIATION_CONNECTION du noeud ASSOCIATION est différent de 1.");
		final Element elementAssociationConnection = (Element) listeElementAssociationConnection.get(0);
		AssertHelper.assertDefined(listeElementAssociationConnection, "liste des éléments ASSOCIATION_CONNECTION du noeud ASSOCIATION.");
		final List listeElementAssociationEnd = XmlUtils.getChildren(elementAssociationConnection,NOEUD.ASSOCIATIONEND);
		AssertHelper.assertDefined(listeElementAssociationEnd, "liste des éléments ASSOCIATIONEND du noeud ASSOCIATION_CONNECTION.");
		AssertHelper.assertBoolean(listeElementAssociationEnd.size() == 2, "Le nombre d'éléments ASSOCIATIONEND du noeud ASSOCIATION_CONNECTION est différent de 2.");
		final IXMIAssociation xmiAssociation =
			new XMIAssociationBean(
				xmiId
			);
		final List listeXMIAssociationEnd = new ArrayList();
		for(final Iterator iterElementAssociationEnd = listeElementAssociationEnd.iterator(); iterElementAssociationEnd.hasNext(); ) {
			final Element elementAssociationEnd = (Element) iterElementAssociationEnd.next();
			AssertHelper.assertDefined(elementAssociationEnd, "élément ASSOCIATIONEND du noeud ASSOCIATION_CONNECTION");
			final IXMIAssociationEnd xmiAssociationEnd = getXMIAssociationEnd(xmiAssociation, elementAssociationEnd);
			AssertHelper.assertDefined(xmiAssociationEnd,"élément de l'association");
			xmiAssociation.addXMIAssociationEnd(xmiAssociationEnd);
		}
		for(final Iterator iterXMIAssociationEnd = xmiAssociation.getListeXMIAssociationEnd().iterator(); iterXMIAssociationEnd.hasNext(); ) {
			final IXMIAssociationEnd xmiAssociationEnd = (IXMIAssociationEnd) iterXMIAssociationEnd.next();
			final IXMIClasse classeDeXMIAssociationEnd = xmiAssociationEnd.getXMIClasseRef();
			final String xmiIdRef = xmiAssociationEnd.getXMIIdRef();
			for(final Iterator iterXMIAssociationEndNotEqualToXMIIdRef = xmiAssociation.getListeXMIAssociationEndByNotEqualToXMIIdRef(xmiIdRef).iterator(); iterXMIAssociationEndNotEqualToXMIIdRef.hasNext(); ) {
				final IXMIAssociationEnd xmiAssociationEndNotEqualToXMIIdRef = (IXMIAssociationEnd) iterXMIAssociationEndNotEqualToXMIIdRef.next();
				classeDeXMIAssociationEnd.addAssociationEnd(xmiAssociationEndNotEqualToXMIIdRef);
			}
		}
		return xmiAssociation;
	}

	private IXMIAssociationEnd getXMIAssociationEnd(final IXMIAssociation xmiAssociation, final Element elementAssociationEnd) {
		AssertHelper.assertDefined(xmiAssociation, "xmiAssociation");
/*
		final List listeElementAssociationEndParticipant = XmlUtils.getChildren(elementAssociationEnd,NOEUD.ASSOCIATIONEND_PARTICIPANT);
		AssertHelper.assertDefined(listeElementAssociationEndParticipant, "liste des éléments ASSOCIATIONEND_PARTICIPANT du noeud ASSOCIATION.");
		AssertHelper.assertBoolean(listeElementAssociationEndParticipant.size() == 1, "Le nombre d'éléments ASSOCIATIONEND_PARTICIPANT du noeud ASSOCIATION est différent de 1.");
		final Element elementAssociationEndParticipant = (Element) listeElementAssociationEndParticipant.get(0);
		AssertHelper.assertDefined(listeElementAssociationEndParticipant, "liste des éléments ASSOCIATIONEND_PARTICIPANT du noeud ASSOCIATION.");

		final List listeElementChildrenDeAssociationEndParticipant = XmlUtils.getChildren(elementAssociationEndParticipant);
		AssertHelper.assertDefined(listeElementChildrenDeAssociationEndParticipant, "liste d'élément participant du noeud ASSOCIATIONEND_PARTICIPANT");
		AssertHelper.assertBoolean(listeElementChildrenDeAssociationEndParticipant.size() == 1, "il y a plus d'un participant du noeud ASSOCIATIONEND_PARTICIPANT");
		final Element elementChildrenDeAssociationEndParticipant = (Element) listeElementChildrenDeAssociationEndParticipant.get(0);
		AssertHelper.assertDefined(elementChildrenDeAssociationEndParticipant, "l'élément participant du noeud ASSOCIATIONEND_PARTICIPANT");
*/
		final String xmiIdRef = elementAssociationEnd.getAttributeValue("type");
		AssertHelper.assertDefined(xmiIdRef, "xmiIdRef de l'élément participant du noeud ASSOCIATIONEND_PARTICIPANT");
		// recherche du XMINoeud associé au datatype de l'attribut
		//XMINoeud xmiNoeudParticipant = getXMINoeudByXmiId(xmiIdRef);
		//AssertHelper.assertDefined(xmiNoeudParticipant, "le noeud associé au xmiIdRef de l'élément participant du noeud ASSOCIATIONEND_PARTICIPANT");


		final String nomChampDeAssociation = elementAssociationEnd.getAttributeValue("name");
		final String typeAggregation = elementAssociationEnd.getAttributeValue("aggregation");

		final IXMIClasse xmiClasseRef = XMIClasseBean.Manager.getXMIClasseFromMapByXmiId(xmiIdRef);
		AssertHelper.assertDefined(xmiClasseRef, "l'objet xmiClasse (xmiIdRef='"+xmiIdRef+"') référencé par l'association (xmiAssociation.xmiId='"+xmiAssociation.getXmiId()+"')");

		final IXMIMultiplicity xmiMultiplicity = getXMIMultiplicityPourAssociationEnd(elementAssociationEnd);

		final IXMIAssociationEnd xmiAssociationEnd =
			new XMIAssociationEndBean(
				nomChampDeAssociation,
				xmiIdRef,
				xmiClasseRef,
				xmiMultiplicity,
				xmiAssociation
			);

		return xmiAssociationEnd;
	}

	private IXMIMultiplicity getXMIMultiplicityPourAttribut(final Element elementAttribut) {
		AssertHelper.assertDefined(elementAttribut, "elementAttribut");

		final List listeElementStructuralMultiplicity = XmlUtils.getChildren(elementAttribut, NOEUD.STRUCTURAL_FEATURE_MULTIPLICITY);
		IXMIMultiplicity xmiMultiplicity = null;
		if ((listeElementStructuralMultiplicity == null) || listeElementStructuralMultiplicity.isEmpty()) {
		    xmiMultiplicity =
	            new XMIMultiplicityBean(
	                "1",
	                "1"
	            );

		}
		else
		{
    		AssertHelper.assertBoolean(listeElementStructuralMultiplicity.size() == 1, "Le nombre d'éléments STRUCTURALFEATURE_MULTIPLICITY du noeud ASSOCIATION est différent de 1.");
    		final Element elementStructuralMultiplicity = (Element) listeElementStructuralMultiplicity.get(0);
    		AssertHelper.assertDefined(elementStructuralMultiplicity, "élément STRUCTURALFEATURE_MULTIPLICITY du noeud ASSOCIATION.");

    		xmiMultiplicity = getXMIMultiplicityPourElementAssociationOuStructuralMultiplicity(elementStructuralMultiplicity);
		}
		AssertHelper.assertNotNull(xmiMultiplicity, "xmiMultiplicity");
        return xmiMultiplicity;
	}

	private IXMIMultiplicity getXMIMultiplicityPourAssociationEnd(final Element elementAssociationEnd) {
		AssertHelper.assertDefined(elementAssociationEnd, "elementAssociationEnd");

		final List listeElementAssociationMultiplicity = XmlUtils.getChildren(elementAssociationEnd, NOEUD.ASSOCIATIONEND_MULTIPLICITY);
        IXMIMultiplicity xmiMultiplicity = null;
		if ((listeElementAssociationMultiplicity == null) || listeElementAssociationMultiplicity.isEmpty())
		{
	        xmiMultiplicity =
	            new XMIMultiplicityBean(
	                "1",
	                "1"
	            );
		}
		else
		{
    		AssertHelper.assertBoolean(listeElementAssociationMultiplicity.size() == 1, "Le nombre d'éléments ASSOCIATIONEND_MULTIPLICITY du noeud ASSOCIATION est différent de 1.");
    		final Element elementAssociationMultiplicity = (Element) listeElementAssociationMultiplicity.get(0);
    		AssertHelper.assertDefined(elementAssociationMultiplicity, "élément ASSOCIATIONEND_MULTIPLICITY du noeud ASSOCIATION.");
    		xmiMultiplicity = getXMIMultiplicityPourElementAssociationOuStructuralMultiplicity(elementAssociationMultiplicity);
		}
		AssertHelper.assertNotNull(xmiMultiplicity, "xmiMultiplicity");
        return xmiMultiplicity;
	}

	private IXMIMultiplicity getXMIMultiplicityPourElementAssociationOuStructuralMultiplicity(final Element elementAssociationOuStructuralMultiplicity) {
		final List listeElementMultiplicity = XmlUtils.getChildren(elementAssociationOuStructuralMultiplicity,NOEUD.MULTIPLICITY);
		AssertHelper.assertDefined(listeElementMultiplicity, "liste des éléments MULTIPLICITY du noeud ASSOCIATION.");
		AssertHelper.assertBoolean(listeElementMultiplicity.size() == 1, "Le nombre d'éléments MULTIPLICITY du noeud ASSOCIATION est différent de 1.");
		final Element elementMultiplicity = (Element) listeElementMultiplicity.get(0);
		AssertHelper.assertDefined(listeElementMultiplicity, "liste des éléments MULTIPLICITY du noeud ASSOCIATION.");

		final List listeElementMultiplicity_Range = XmlUtils.getChildren(elementMultiplicity,NOEUD.MULTIPLICITY_RANGE);
		AssertHelper.assertDefined(listeElementMultiplicity_Range, "liste des éléments MULTIPLICITY_RANGE du noeud MULTIPLICITY.");
		AssertHelper.assertBoolean(listeElementMultiplicity_Range.size() == 1, "Le nombre d'éléments MULTIPLICITY_RANGE du noeud MULTIPLICITY est différent de 1.");
		final Element elementMultiplicity_Range = (Element) listeElementMultiplicity_Range.get(0);
		AssertHelper.assertDefined(listeElementMultiplicity_Range, "liste des éléments MULTIPLICITY_RANGE du noeud MULTIPLICITY.");

		final List listeElementMultiplicityRange = XmlUtils.getChildren(elementMultiplicity_Range,NOEUD.MULTIPLICITYRANGE);
		AssertHelper.assertDefined(listeElementMultiplicityRange, "liste des éléments MULTIPLICITYRANGE du noeud MULTIPLICITY_RANGE.");
		AssertHelper.assertBoolean(listeElementMultiplicityRange.size() == 1, "Le nombre d'éléments MULTIPLICITYRANGE du noeud MULTIPLICITY_RANGE est différent de 1.");
		final Element elementMultiplicityRange = (Element) listeElementMultiplicityRange.get(0);
		AssertHelper.assertDefined(listeElementMultiplicityRange, "liste des éléments MULTIPLICITYRANGE du noeud MULTIPLICITY_RANGE.");

		final String nombreMinimum = elementMultiplicityRange.getAttributeValue("lower");
		final String nombreMaximum = elementMultiplicityRange.getAttributeValue("upper");

		final IXMIMultiplicity xmiMultiplicity =
			new XMIMultiplicityBean(
				nombreMinimum,
				nombreMaximum
			);

		return xmiMultiplicity;
	}

	/* Table liant les associations par objets classes */
	/* A SUPPRIMER
	private Map getMapXMIAsociationParXMINoeud(List listeXMIAssociation) {
		Map mapXMIAssociationParXMINoeud = new HashMap();
		for(Iterator iterXMIAssociation = listeXMIAssociation.iterator(); iterXMIAssociation.hasNext(); ) {
			IXMIAssociation xmiAssociation = (IXMIAssociation) iterXMIAssociation.next();
			addXMIAssociationToMapXMIAsociationParXMINoeud(mapXMIAssociationParXMINoeud, xmiAssociation);
		}
		return mapXMIAssociationParXMINoeud;
	}

	private void addXMIAssociationToMapXMIAsociationParXMINoeud(Map mapXMIAssociationParXMINoeud, IXMIAssociation xmiAssociation) {
		AssertHelper.assertNotNullArgument(xmiAssociation, "l'objet xmiAssociation", "getMapXMIAsociationParXMINoeud");
		List listeXMIAssociationEnd = xmiAssociation.getListeXMIAssociationEnd();
		AssertHelper.assertDefined(listeXMIAssociationEnd, "liste des XMIAssociationEnd");
		AssertHelper.assertBoolean(listeXMIAssociationEnd.size()>0, "liste des XMIAssociationEnd est vide");
		for(Iterator iterListeXMIAssociationEnd = listeXMIAssociationEnd.iterator(); iterListeXMIAssociationEnd.hasNext(); ) {
			IXMIAssociationEnd xmiAssociationEnd = (IXMIAssociationEnd) iterListeXMIAssociationEnd.next();
			XMINoeud xmiNoeud = xmiAssociationEnd.getXMINoeud();
			// ajouterDansTableDesAssociationsClassésParXmiId(xmiNoeud, xmiAssociation);
			List listeXMIAssociationPourXMINoeud = null;
			if( mapXMIAssociationParXMINoeud.containsKey(xmiNoeud.getXmiIdRef()) ) {
				listeXMIAssociationPourXMINoeud = (List) mapXMIAssociationParXMINoeud.get(xmiNoeud.getXmiIdRef());
			} else {
				listeXMIAssociationPourXMINoeud = new ArrayList();
			}
			listeXMIAssociationPourXMINoeud.add(xmiAssociation);
			mapXMIAssociationParXMINoeud.put(xmiNoeud.getXmiIdRef(),xmiAssociation);
		}
	}
	*/

	/* Lecture des packages et classes pour
	 * l'Ajout des attributs aux classes décrivant les associations vers les autres objets */

	//private void parcourirEtAjouterAssociationAttribut(IXMIPackage package, Map )




	/**************************************
	 * Gestion des generalisations
	 **************************************/
	/* A SUPPRIMER
	private List listeElementGeneralisation = new ArrayList();
	private Map mapElementGeneralisationByParticipantXmiIdRef = new HashMap();

	private void loadListeAndMapElementGeneralisation(Document document) {
		Element racine = document.getRootElement();
		AssertHelper.assertDefined(racine, "racine");
		listeElementGeneralisation = XmlUtils.getListeElementByNomNoeud(racine,NOEUD.ASSOCIATION);
		getListeElementGeneralisation
	}
	*/

	/* Lecture des generalisations du xmi */

	private void loadListeElementGeneralisation(final Document document, final IXMI xmi) {
		final List listeElementGeneralisation = XmlUtils.getListeElementByNomNoeud(document.getRootElement(),NOEUD.GENERELIZATION);
		for( final Iterator iterGeneralisation = listeElementGeneralisation.iterator(); iterGeneralisation.hasNext(); ) {
			final Element elementGeneralisation = (Element) iterGeneralisation.next();
			final IXMGeneralisation xmGeneralisation = getXMGeneralisation(elementGeneralisation);
			xmi.addGeneralisation(xmGeneralisation);
			defineParentToEnfant(xmGeneralisation);
		}
	}

	private IXMGeneralisation getXMGeneralisation(final Element elementGeneralisation) {
		final Element elementGeneralisationParent = getElementGeneralisationParentPourGeneralisation(elementGeneralisation);
		final IXMIType xmiTypeParent = getXMITypePourGeneralisationParent(elementGeneralisationParent);
		final Element elementGeneralisationEnfant = getElementGeneralisationEnfantPourGeneralisation(elementGeneralisation);
		final IXMIType xmiTypeEnfant = getXMITypePourGeneralisationEnfant(elementGeneralisationEnfant);
		AssertHelper.assertDefined(xmiTypeParent, "objet xmiType de l'élément Parent GENERALIZATION_PARENT du noeud GENERALIZATION.");
		AssertHelper.assertDefined(xmiTypeEnfant, "objet xmiType de l'élément Enfant GENERALIZATION_ENFANT du noeud GENERALIZATION.");
		final IXMGeneralisation xmGeneralisation =
			new XMGeneralisationBean(
				xmiTypeParent,
				xmiTypeEnfant
			);
		return xmGeneralisation;
	}

	private Element getElementGeneralisationParentPourGeneralisation(final Element elementGeneralisation) {
		final List listeElementGeneralisationParent = XmlUtils.getChildren(elementGeneralisation, NOEUD.GENERELIZATION_PARENT);
		AssertHelper.assertDefined(listeElementGeneralisationParent, "liste d'élément Generalisation Parent");
		AssertHelper.assertBoolean(listeElementGeneralisationParent.size() == 1, "il y a plus d'un élément Generalisation Parent");
		return (Element) listeElementGeneralisationParent.get(0);
	}

	private Element getElementGeneralisationEnfantPourGeneralisation(final Element elementGeneralisation) {
		final List listeElementGeneralisationEnfant = XmlUtils.getChildren(elementGeneralisation, NOEUD.GENERELIZATION_CHILD);
		AssertHelper.assertDefined(listeElementGeneralisationEnfant, "liste d'élément Generalisation Enfant");
		AssertHelper.assertBoolean(listeElementGeneralisationEnfant.size() == 1, "il y a plus d'un élément Generalisation Enfant");
		return (Element) listeElementGeneralisationEnfant.get(0);
	}

	private IXMIType getXMITypePourGeneralisationParent(final Element elementGeneralisationParent) {
		final List listeElementDatatype = getListeElementDatatypePourGeneralisationParent(elementGeneralisationParent);
		return getXMITypePourListeElementDatatype(listeElementDatatype);
	}

	private List getListeElementDatatypePourGeneralisationParent(final Element elementGeneralisationParent) {
		final List listeElementDatatype = XmlUtils.getChildren(elementGeneralisationParent, NOEUD.GENERELIZATION_PARENT);
		AssertHelper.assertDefined(listeElementDatatype, "liste d'élément datatype");
		AssertHelper.assertBoolean(listeElementDatatype.size() == 1, "il y a plus d'un élément datatype");
		final Element elementDatatype = (Element) listeElementDatatype.get(0);
		return XmlUtils.getChildren(elementDatatype);
	}

	private IXMIType getXMITypePourGeneralisationEnfant(final Element elementGeneralisationEnfant) {
		final List listeElementDatatype = getListeElementDatatypePourGeneralisationEnfant(elementGeneralisationEnfant);
		return getXMITypePourListeElementDatatype(listeElementDatatype);
	}

	private List getListeElementDatatypePourGeneralisationEnfant(final Element elementGeneralisationEnfant) {
		final List listeElementDatatype = XmlUtils.getChildren(elementGeneralisationEnfant, NOEUD.GENERELIZATION_CHILD);
		AssertHelper.assertDefined(listeElementDatatype, "liste d'élément datatype");
		AssertHelper.assertBoolean(listeElementDatatype.size() == 1, "il y a plus d'un élément datatype");
		final Element elementDatatype = (Element) listeElementDatatype.get(0);
		return XmlUtils.getChildren(elementDatatype);
	}

	private void defineParentToEnfant(final IXMGeneralisation generalisation) {
		AssertHelper.assertDefined(generalisation.getXmiTypeParent(), "le type du Parent");
		AssertHelper.assertDefined(generalisation.getXmiTypeEnfant(), "le type de l'Enfant");
		/** On ne gère que les classes pour le moment pour la généralisation */
		if( ( generalisation.getXmiTypeParent() instanceof IXMIClasse )
		 && ( generalisation.getXmiTypeEnfant() instanceof IXMIClasse ) ) {
			final IXMIClasse classeParent = (IXMIClasse) generalisation.getXmiTypeParent();
			final IXMIClasse classeEnfant = (IXMIClasse) generalisation.getXmiTypeEnfant();
			classeEnfant.addClasseParent(classeParent);
		}
	}

	/**
	 * Reprise des taggedValue dispersé dans le XMI.
	 */

    private void definirTaggedValueDansDocument(final Document document) {
        final Element elementContent = getContent(document);
        definirTaggedValueDansContent(elementContent);
    }

    private void definirTaggedValueDansContent(final Element elementContent) {
        AssertHelper.assertDefined(elementContent, "l'élément content");
        AssertHelper.assertBoolean(NOEUD.CONTENT.equals(elementContent.getName()),"l'élément n'est pas un content");
        final List listeXMITaggedValue = new ArrayList();
        final List listeElementTaggedValue = getListeElementTaggedValueDansContent(elementContent);
        for(final Iterator iterElementTaggedValue = listeElementTaggedValue.iterator(); iterElementTaggedValue.hasNext(); ) {
            final Element elementTaggedValue = (Element) iterElementTaggedValue.next();
            final String tagNom = elementTaggedValue.getAttributeValue("tag");
            final String tagXmiId = elementTaggedValue.getAttributeValue("xmi.id");
            final String tagValue = elementTaggedValue.getAttributeValue("value");
            final String modelElement = elementTaggedValue.getAttributeValue("modelElement");
            final IXMITag tag = this.getXMITag(tagNom);
            final IXMITaggedValue taggedValue = new XMITaggedValueBean(
                    tagValue,
                    tagXmiId,
                    tag
                );
            final IXMIClasse classe = getTableXMIClasse().get(modelElement);
            classe.addTaggedValue(taggedValue);
        }
        return ;
    }

    private List getListeElementTaggedValueDansContent(final Element elementContent) {
        final List listeElementTaggedValue = XmlUtils.getChildren(elementContent, NOEUD.TAGGED_VALUE);
        return listeElementTaggedValue;
    }

}
