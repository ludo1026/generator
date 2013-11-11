package org.ludo.umlgenerator.xml.core.xmlreader;

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
import org.ludo.umlgenerator.xml.utils.Noeud;
import org.ludo.umlgenerator.xml.utils.XMINoeud;
import org.ludo.umlgenerator.xml.utils.XmlUtils;
import org.ludo.utils.AssertHelper;
import org.ludo.utils.LoggerManager;

public class XMIXmlHandler {

	private static class XMIClasseEtElementClasse {
		public static class Manager {
			private Map mapXMIClasseEtElementClasse = new HashMap();
			public void addToMapXMIClasseEtElementClasse(IXMIClasse xmiClasse, Element elementClasse) {
				XMIClasseEtElementClasse xmiClasseEtElementClasse = new XMIClasseEtElementClasse(xmiClasse, elementClasse);
				mapXMIClasseEtElementClasse.put(
					xmiClasseEtElementClasse.getClasseGenId(),
					xmiClasseEtElementClasse);
			}
			public void addToMapXMIClasseEtElementClasse(XMIClasseEtElementClasse xmiClasseEtElementClasse) {
				mapXMIClasseEtElementClasse.put(
					xmiClasseEtElementClasse.getClasseGenId(),
					xmiClasseEtElementClasse);
			}
			public XMIClasseEtElementClasse getXMIClasseEtElementClasse(String classeGenId) {
				return (XMIClasseEtElementClasse) mapXMIClasseEtElementClasse.get(classeGenId);
			}
			public Iterator getIteratorXMIClasseEtElementClasse() {
				return mapXMIClasseEtElementClasse.values().iterator();
			}
		}
		private final String classeGenId;
		private final IXMIClasse xmiClasse;
		private final Element elementClasse;
		public XMIClasseEtElementClasse(IXMIClasse xmiClasse, Element elementClasse) {
			AssertHelper.assertDefined(xmiClasse,"objet XMI de la classe");
			this.xmiClasse = xmiClasse;
			AssertHelper.assertDefined(elementClasse,"élément XML de la classe");
			this.elementClasse = elementClasse;
			AssertHelper.assertDefined(xmiClasse.getGenId(),"genId de l'objet XMI de la classe");
			this.classeGenId = xmiClasse.getGenId();
		}
		public String getClasseGenId() {
			return classeGenId;
		}
		public IXMIClasse getXmiClasse() {
			return xmiClasse;
		}
		public Element getElementClasse() {
			return elementClasse;
		}
	}
	
	private XMIClasseEtElementClasse.Manager xmiClasseEtElementClasseManager = new XMIClasseEtElementClasse.Manager();
	
	private XMIClasseEtElementClasse.Manager getXMIClasseEtElementClasseManager() {
		return xmiClasseEtElementClasseManager;
	}
	
	private static Logger log = LoggerManager.getLogger(XMIXmlHandler.class);
	
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
	
	public XMIXmlHandler(Document document) {
		this.document = document;
	}
	
	public void afficherArborescence() {
		Element racine = document.getRootElement();
		if( racine == null ) {
			return;
		}
		XmlUtils.parcourir(racine);
	}
	
	private boolean AFFICHER_ARBORESCENCE = false;
	
	public IXMI getXMI() {
		if( AFFICHER_ARBORESCENCE ) {
			afficherArborescence();
			return null;
		}
		else {
			loadListeXMINoeud(this.document);
			
			loadXMI(this.document);
			
			return xmi;
		}
	}
	
	private List listeXMINoeud = new ArrayList();
	
	private void loadListeXMINoeud(Document document) {
		Element racine = document.getRootElement();
		AssertHelper.assertDefined(racine, "racine");
		listeXMINoeud = XmlUtils.getListeXMINoeud(racine);
	}
	
	private XMINoeud getXMINoeudByXmiId(String xmiId) {
		AssertHelper.assertDefined(xmiId, "xmiId");
		XMINoeud xmiNoeudTrouve = null;
		for(Iterator iterXMINoeud = listeXMINoeud.iterator(); iterXMINoeud.hasNext() && xmiNoeudTrouve == null; ) {
			XMINoeud xmiNoeud = (XMINoeud) iterXMINoeud.next();
			if( xmiId.equals(xmiNoeud.getXmiId()) ) {
				xmiNoeudTrouve = xmiNoeud;
			}
		}
		return xmiNoeudTrouve;
	}
	
	
	private IXMI xmi = new XMIBean();
	
	private void loadXMI(Document document) {
		Element racine = document.getRootElement();
		if( racine == null ) {
			return;
		}
		
		// Au début !
		xmi.setListeStereotype(
			getListeXMIStereotype(
				document
			)
		);
		
		xmi.setListeDatatype(
			getListeXMIDatatypeDansPackageDatatypeDuDocument(
				document
			)
		);

		xmi.setListePackageFils(
			getListeXMIPackageDansPackageSourceDuDocument(
				document
			)
		);
		
		defineListeXMIClasse();
		
		// En dernier !
		loadListeElementAssociation(
			document,
			xmi
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
	
	private List getListeXMIStereotype(Document document) {
		List listeXMIStereotype = new ArrayList();
		List listeElementStereotype = getListeElementStereotype(document);
		for(Iterator iterElementStereotype = listeElementStereotype.iterator(); iterElementStereotype.hasNext(); ) {
			Element elementStereotype = (Element) iterElementStereotype.next();
			String nom = elementStereotype.getAttributeValue("name");
			String xmiId = elementStereotype.getAttributeValue("xmi.id");
			listeXMIStereotype.add(
				new XMIStereotypeBean(
					nom,
					xmiId
				)
			);
		}
		return listeXMIStereotype;
	}
	
	private List getListeElementStereotype(Document document) {
		Element packageDefinition = getPackageDefinition(document);
		List listeElementStereotype = XmlUtils.getChildren(packageDefinition,NOEUD.STEREOTYPE);
		return listeElementStereotype;
	}
	
	private Element getPackageDefinition(Document document) {
		Element racine = document.getRootElement();
		List listeNoeud = new ArrayList();
		listeNoeud.add(new Noeud(NOEUD.CONTENT,null));
		listeNoeud.add(new Noeud(NOEUD.MODEL,null));
		listeNoeud.add(new Noeud(NOEUD.NAMESPACE_OWNED_ELEMENT,null));
		listeNoeud.add(new Noeud(NOEUD.PACKAGE,"definition"));
		listeNoeud.add(new Noeud(NOEUD.NAMESPACE_OWNED_ELEMENT,null));
		listeNoeud.add(new Noeud(NOEUD.PACKAGE,"stereotype"));
		listeNoeud.add(new Noeud(NOEUD.NAMESPACE_OWNED_ELEMENT,null));
		listeNoeud.add(new Noeud(NOEUD.PACKAGE,"Classe"));
		listeNoeud.add(new Noeud(NOEUD.NAMESPACE_OWNED_ELEMENT,null));
		return XmlUtils.acceder(racine,listeNoeud);
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
	
	private List getListeXMIDatatypeDansPackageDatatypeDuDocument(Document document) {
		Element elementPackageSource = getPackageDatatype(document);
		return getListeXMIDatatypeDansPackage(null,elementPackageSource,0);
	}
	
	private Element getPackageDatatype(Document document) {
		Element racine = document.getRootElement();
		List listeNoeud = new ArrayList();
		listeNoeud.add(new Noeud(NOEUD.CONTENT,null));
		listeNoeud.add(new Noeud(NOEUD.MODEL,null));
		listeNoeud.add(new Noeud(NOEUD.NAMESPACE_OWNED_ELEMENT,null));
		listeNoeud.add(new Noeud(NOEUD.PACKAGE,"definition"));
		listeNoeud.add(new Noeud(NOEUD.NAMESPACE_OWNED_ELEMENT,null));
		listeNoeud.add(new Noeud(NOEUD.PACKAGE,"datatype"));
		return XmlUtils.acceder(racine,listeNoeud);
	}
	
	private List getListeXMIDatatypeDansPackage(String packageParentNom, Element elementPackage, int niveauPackage) {
		AssertHelper.assertDefined(elementPackage, "l'élément package");
		AssertHelper.assertBoolean(NOEUD.PACKAGE.equals(elementPackage.getName()),"l'élément n'est pas un package");
		String packageNom;
		if( niveauPackage == 0 ) {
			packageNom = "";
		} else {
			packageNom = elementPackage.getAttributeValue("name");
			if( ! StringUtils.isBlank(packageParentNom) ) {
				packageNom = packageParentNom + "." + packageNom;
			}
		}
		List listeXMIDatatype = new ArrayList();
		List listeElementDatatype = getListeElementDatatypeDansPackage(elementPackage);
		for(Iterator iterElementDatatype = listeElementDatatype.iterator(); iterElementDatatype.hasNext(); ) {
			Element elementDatatype = (Element) iterElementDatatype.next();
			IXMIDatatype xmiDatatype = getXMIDatatypePourElementDatatype(packageNom, elementDatatype);
			listeXMIDatatype.add(xmiDatatype);
		}
		List listeElementClasse = getListeElementClasseDansPackage(elementPackage);
		for(Iterator iterElementClasse = listeElementClasse.iterator(); iterElementClasse.hasNext(); ) {
			Element elementClasse = (Element) iterElementClasse.next();
			IXMIDatatype xmiDatatype = getXMIDatatypePourElementClasse(packageNom, elementClasse);
			listeXMIDatatype.add(xmiDatatype);
		}
		List listeElementInterface = getListeElementInterfaceDansPackage(elementPackage);
		for(Iterator iterElementInterface = listeElementInterface.iterator(); iterElementInterface.hasNext(); ) {
			Element elementInterface = (Element) iterElementInterface.next();
			IXMIDatatype xmiDatatype = getXMIDatatypePourElementInterface(packageNom, elementInterface);
			listeXMIDatatype.add(xmiDatatype);
		}
		List listeXMIPackageFils = new ArrayList();
		// parcourt de la liste des sous-packages
		List listeElementPackageFils = getListeElementPackageFils(elementPackage);
		for(Iterator iterElementPackageFils = listeElementPackageFils.iterator(); iterElementPackageFils.hasNext(); ) {
			Element elementPackageFils = (Element) iterElementPackageFils.next();
			listeXMIDatatype.addAll(getListeXMIDatatypeDansPackage(packageNom, elementPackageFils, niveauPackage + 1));
		}
		return listeXMIDatatype;
	}
	
	private List getListeElementClasseDansPackage(Element element) {
		List listeElementContenuPackage = XmlUtils.getChildren(element, NOEUD.NAMESPACE_OWNED_ELEMENT);
		AssertHelper.assertNotNull(listeElementContenuPackage, "liste d'élément namespaceOwnedElement dans l'élément package");
		if(listeElementContenuPackage.isEmpty()) {
			return new ArrayList();
		}
		AssertHelper.assertBoolean(listeElementContenuPackage.size() == 1, "il y a plus d'un namespaceOwnedElement dans l'élément package");
		Element elementContenuPackage = (Element) listeElementContenuPackage.get(0);
		List listeElementClasse = XmlUtils.getChildren(elementContenuPackage, NOEUD.CLASS);
		listeElementClasse.addAll( XmlUtils.getChildren(elementContenuPackage, NOEUD.ASSOCIATIONCLASS) );
		return listeElementClasse;
	}
	
	private IXMIDatatype getXMIDatatypePourElementClasse(String packageNom, Element elementClasse) {
		AssertHelper.assertDefined(elementClasse, "l'élément classe");
		AssertHelper.assertBoolean(NOEUD.CLASS.equals(elementClasse.getName()),"l'élément n'est pas une classe");
		String classeNom = elementClasse.getAttributeValue("name");
		if( ! StringUtils.isBlank(packageNom) ) {
			classeNom = packageNom + "." + classeNom;
		}
		String xmiId = elementClasse.getAttributeValue("xmi.id");
		IXMIDatatype xmiDatatype = new XMIDatatypeBean(
			classeNom,
			xmiId
		);
		return xmiDatatype;
	}
	
	private List getListeElementInterfaceDansPackage(Element element) {
		List listeElementContenuPackage = XmlUtils.getChildren(element, NOEUD.NAMESPACE_OWNED_ELEMENT);
		AssertHelper.assertNotNull(listeElementContenuPackage, "liste d'élément namespaceOwnedElement dans l'élément package");
		if(listeElementContenuPackage.isEmpty()) {
			return new ArrayList();
		}
		AssertHelper.assertBoolean(listeElementContenuPackage.size() == 1, "il y a plus d'un namespaceOwnedElement dans l'élément package");
		Element elementContenuPackage = (Element) listeElementContenuPackage.get(0);
		return XmlUtils.getChildren(elementContenuPackage, NOEUD.INTERFACE);
	}
	
	private IXMIDatatype getXMIDatatypePourElementInterface(String packageNom, Element elementInterface) {
		AssertHelper.assertDefined(elementInterface, "l'élément interface");
		AssertHelper.assertBoolean(NOEUD.INTERFACE.equals(elementInterface.getName()),"l'élément n'est pas une interface");
		String interfaceNom = elementInterface.getAttributeValue("name");
		if( ! StringUtils.isBlank(packageNom) ) {
			interfaceNom = packageNom + "." + interfaceNom;
		}
		String xmiId = elementInterface.getAttributeValue("xmi.id");
		IXMIDatatype xmiDatatype = new XMIDatatypeBean(
			interfaceNom,
			xmiId
		);
		return xmiDatatype;
	}
	
	private List getListeElementDatatypeDansPackage(Element element) {
		List listeElementContenuPackage = XmlUtils.getChildren(element, NOEUD.NAMESPACE_OWNED_ELEMENT);
		AssertHelper.assertNotNull(listeElementContenuPackage, "liste d'élément namespaceOwnedElement dans l'élément package");
		if(listeElementContenuPackage.isEmpty()) {
			return new ArrayList();
		}
		AssertHelper.assertBoolean(listeElementContenuPackage.size() == 1, "il y a plus d'un namespaceOwnedElement dans l'élément package");
		Element elementContenuPackage = (Element) listeElementContenuPackage.get(0);
		return XmlUtils.getChildren(elementContenuPackage, NOEUD.DATATYPE);
	}
	
	private IXMIDatatype getXMIDatatypePourElementDatatype(String packageNom, Element elementDatatype) {
		AssertHelper.assertDefined(elementDatatype, "l'élément datatype");
		AssertHelper.assertBoolean(NOEUD.DATATYPE.equals(elementDatatype.getName()),"l'élément n'est pas un datatype");
		String datatypeNom = elementDatatype.getAttributeValue("name");
		String xmiId = elementDatatype.getAttributeValue("xmi.id");
		IXMIDatatype xmiDatatype = new XMIDatatypeBean(
			datatypeNom,
			xmiId
		);
		return xmiDatatype;
	}
	
	/**
	 * Récupération des packages et classes du répertoire source
	 */
	
	private List getListeXMIPackageDansPackageSourceDuDocument(Document document) {
		Element elementPackageSource = getPackageSource(document);
		return getListeXMIPackageDansPackage(null,elementPackageSource);
	}
	
	private Element getPackageSource(Document document) {
		Element racine = document.getRootElement();
		List listeNoeud = new ArrayList();
		listeNoeud.add(new Noeud(NOEUD.CONTENT,null));
		listeNoeud.add(new Noeud(NOEUD.MODEL,null));
		listeNoeud.add(new Noeud(NOEUD.NAMESPACE_OWNED_ELEMENT,null));
		listeNoeud.add(new Noeud(NOEUD.PACKAGE,"src"));
		return XmlUtils.acceder(racine,listeNoeud);
	}
	
	/**
	 * @return la liste des xmiPackage fils de l'élément package fourni
	 * @param package package parent (null si paclage racine = 1er appel de cette méthode)
	 * @param elementPackage noeud du package 
	 */
	private List getListeXMIPackageDansPackage(IXMIPackage packageParent, Element elementPackage) {
		AssertHelper.assertDefined(elementPackage, "l'élément package");
		AssertHelper.assertBoolean(NOEUD.PACKAGE.equals(elementPackage.getName()),"l'élément n'est pas un package");
		List listeXMIPackageFils = new ArrayList();
		// parcourt de la liste des sous-packages
		List listeElementPackageFils = getListeElementPackageFils(elementPackage);
		for(Iterator iterElementPackageFils = listeElementPackageFils.iterator(); iterElementPackageFils.hasNext(); ) {
			Element elementPackageFils = (Element) iterElementPackageFils.next();
			IXMIPackage xmiPackageFils = getXMIPackage(packageParent, elementPackageFils);
			listeXMIPackageFils.add(xmiPackageFils);
		}
		return listeXMIPackageFils;
	}
	
	private List getListeElementPackageFils(Element element) {
		List listeElementContenuPackage = XmlUtils.getChildren(element, NOEUD.NAMESPACE_OWNED_ELEMENT);
		AssertHelper.assertNotNull(listeElementContenuPackage, "liste d'élément namespaceOwnedElement dans l'élément package");
		if(listeElementContenuPackage.isEmpty()) {
			return new ArrayList();
		}
		AssertHelper.assertBoolean(listeElementContenuPackage.size() == 1, "il y a plus d'un namespaceOwnedElement dans l'élément package");
		Element elementContenuPackage = (Element) listeElementContenuPackage.get(0);
		return XmlUtils.getChildren(elementContenuPackage, NOEUD.PACKAGE);
	}
	
	private IXMIPackage getXMIPackage(IXMIPackage packageParent, Element elementPackage) {
		AssertHelper.assertDefined(elementPackage, "l'élément package");
		AssertHelper.assertBoolean(NOEUD.PACKAGE.equals(elementPackage.getName()),"l'élément n'est pas un package");
		String packageNom = elementPackage.getAttributeValue("name");
		String xmiId = elementPackage.getAttributeValue("xmi.id");
		IXMIPackage xmiPackage = new XMIPackageBean(
			packageNom,
			xmiId,
			packageParent
		);
		List listeXMIClasse = getListeXMIClasseDansPackage(xmiPackage, elementPackage);
		xmiPackage.setListeClasse(listeXMIClasse);
		List listeXMIPackage = getListeXMIPackageDansPackage(xmiPackage,elementPackage);
		xmiPackage.setListePackageFils(listeXMIPackage);
		return xmiPackage;
	}
	
	private List getListeXMIClasseDansPackage(IXMIPackage packageParent, Element elementPackage) {
		List listeXMIClasse = new ArrayList();
		List listeElementClasse = getListeElementClasseDansPackage(elementPackage);
		for(Iterator iterElementClasse = listeElementClasse.iterator(); iterElementClasse.hasNext(); ) {
			Element elementClasse = (Element) iterElementClasse.next();
			IXMIClasse classe = getXMIClasse(packageParent, elementClasse);
			listeXMIClasse.add(classe);
		}
		return listeXMIClasse;
	}
	
	private IXMIClasse getXMIClasse(IXMIPackage packageParent, Element elementClasse) {
		AssertHelper.assertDefined(elementClasse, "l'élément classe");
		AssertHelper.assertBoolean(NOEUD.CLASS.equals(elementClasse.getName()) || NOEUD.ASSOCIATIONCLASS.equals(elementClasse.getName()),"l'élément n'est pas une classe");
		String classeNom = elementClasse.getAttributeValue("name");
		String xmiId = elementClasse.getAttributeValue("xmi.id");
		IXMIClasse xmiClasse = new XMIClasseBean(
			classeNom,
			xmiId,
			packageParent
		);
		getXMIClasseEtElementClasseManager()
			.addToMapXMIClasseEtElementClasse(xmiClasse, elementClasse);
		return xmiClasse;
	}
	
	private List getListeXMIAssociationClasseDansPackage(IXMIPackage packageParent, Element elementPackage) {
		List listeXMIClasse = new ArrayList();
		List listeElementClasse = getListeElementClasseDansPackage(elementPackage);
		for(Iterator iterElementClasse = listeElementClasse.iterator(); iterElementClasse.hasNext(); ) {
			Element elementClasse = (Element) iterElementClasse.next();
			IXMIClasse classe = getXMIClasse(packageParent, elementClasse);
			listeXMIClasse.add(classe);
		}
		return listeXMIClasse;
	}
	
	private void defineListeXMIClasse() {
		for( Iterator iterXMIClasseEtElementClasse = getXMIClasseEtElementClasseManager().getIteratorXMIClasseEtElementClasse(); iterXMIClasseEtElementClasse.hasNext(); ) {
			XMIClasseEtElementClasse xmiClasseEtElementClasse = (XMIClasseEtElementClasse) iterXMIClasseEtElementClasse.next();
			defineXMIClasse(xmiClasseEtElementClasse.getXmiClasse(), xmiClasseEtElementClasse.getElementClasse());
		}
	}
		
	private IXMIClasse defineXMIClasse(IXMIClasse xmiClasse, Element elementClasse) {
		xmiClasse
			.setListeStereotype(
				getListeXMIStereotypePourClasse(elementClasse)
			);
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

	
	private List getListeXMIStereotypePourClasse(Element elementClasse) {
		List listeXMIStereotype = new ArrayList();
		List listeElementStereotypePourClasse = getListeElementStereotypePourClasse(elementClasse);
		for(Iterator iterElementStereotypePourClasse = listeElementStereotypePourClasse.iterator(); iterElementStereotypePourClasse.hasNext(); ) {
			Element elementStereotypePourClasse = (Element) iterElementStereotypePourClasse.next();
			String stereotypeXmiId = elementStereotypePourClasse.getAttributeValue("xmi.idref");
			AssertHelper.assertDefined(stereotypeXmiId, "xmiIdRef du stéréotype");
			IXMIStereotype xmiStereotype = getXMIStereotypeByXmiId(stereotypeXmiId);
			AssertHelper.assertDefined(xmiStereotype, "stéréotype de xmiIdRef = '"+stereotypeXmiId+"'");
			listeXMIStereotype.add(xmiStereotype);
		}
		return listeXMIStereotype;
	}
	
	private List getListeElementStereotypePourClasse(Element element) {
		List listeElementStereotypePourClasse = XmlUtils.getChildren(element, NOEUD.MODEL_ELEMENT_STEREOTYPE);
		if( listeElementStereotypePourClasse == null || listeElementStereotypePourClasse.isEmpty() ) {
			return new ArrayList();
		}
		AssertHelper.assertDefined(listeElementStereotypePourClasse, "liste d'élément modelElementStereotype dans l'élément package");
		AssertHelper.assertBoolean(listeElementStereotypePourClasse.size() == 1, "il y a plus d'un modelElementStereotype dans l'élément package");
		Element elementStereotypePourClasse = (Element) listeElementStereotypePourClasse.get(0);
		return XmlUtils.getChildren(elementStereotypePourClasse, NOEUD.STEREOTYPE);
	}
	
	private IXMIStereotype getXMIStereotypeByXmiId(String xmiId) {
		return this.xmi.getStereotypeByXmiId(xmiId);
	}
	
	
	
	private List getListeXMIAttributPourClasse(Element elementClasse, IXMIClasse xmiClasse) {
		List listeXMIAttribut = new ArrayList();
		List listeElementAttributPourClasse = getListeElementAttributPourClasse(elementClasse);
		for(Iterator iterElementAttributPourClasse = listeElementAttributPourClasse.iterator(); iterElementAttributPourClasse.hasNext(); ) {
			Element elementAttributPourClasse = (Element) iterElementAttributPourClasse.next();
			String attributXmiId = elementAttributPourClasse.getAttributeValue("xmi.id");
			AssertHelper.assertDefined(attributXmiId, "xmiIdRef de l'attribut");
			IXMIAttribut xmiAttribut = getXMIAttribut(elementAttributPourClasse, xmiClasse);
			AssertHelper.assertDefined(xmiAttribut, "attribut de xmiIdRef = '"+attributXmiId+"'");
			listeXMIAttribut.add(xmiAttribut);
		}
		return listeXMIAttribut;
	}
	
	private List getListeElementAttributPourClasse(Element element) {
		List listeElementAttributPourClasse = XmlUtils.getChildren(element, NOEUD.CLASSIFIER_FEATURE);
		if( listeElementAttributPourClasse == null || listeElementAttributPourClasse.isEmpty() ) {
			return new ArrayList();
		}
		AssertHelper.assertDefined(listeElementAttributPourClasse, "liste d'élément modelElementAttribut dans l'élément package");
		AssertHelper.assertBoolean(listeElementAttributPourClasse.size() == 1, "il y a plus d'un modelElementAttribut dans l'élément package");
		Element elementAttributPourClasse = (Element) listeElementAttributPourClasse.get(0);
		return XmlUtils.getChildren(elementAttributPourClasse, NOEUD.ATTRIBUTE);
	}
	
	private IXMIAttribut getXMIAttribut(Element elementAttribut, IXMIClasse xmiClasse) {
		AssertHelper.assertDefined(elementAttribut, "l'élément attribut");
		AssertHelper.assertBoolean(NOEUD.ATTRIBUTE.equals(elementAttribut.getName()),"l'élément n'est pas un attribut");
		String attributNom = elementAttribut.getAttributeValue("name");
		String xmiId = elementAttribut.getAttributeValue("xmi.id");
		IXMIType xmiType = getXMITypePourAttribut(elementAttribut);
		IXMIMultiplicity xmiMultiplicity = getXMIMultiplicityPourAttribut(elementAttribut);
		IXMIAttribut xmiAttribut = new XMIAttributBean(
				attributNom,
				xmiId,
				xmiType,
				xmiMultiplicity,
				xmiClasse
			);
		return xmiAttribut;
	}
	
	private IXMIType getXMITypePourAttribut(Element elementAttribut) {
		List listeElementDatatype = getListeElementDatatypePourAttribut(elementAttribut);
		return getXMITypePourListeElementDatatype(listeElementDatatype);
	}
	
	private List getListeElementDatatypePourAttribut(Element elementAttribut) {
		List listeElementDatatype = XmlUtils.getChildren(elementAttribut, NOEUD.STRUCTURAL_FEATURE_TYPE);
		AssertHelper.assertDefined(listeElementDatatype, "liste d'élément datatype");
		AssertHelper.assertBoolean(listeElementDatatype.size() == 1, "il y a plus d'un élément datatype");
		Element elementDatatype = (Element) listeElementDatatype.get(0);
		return XmlUtils.getChildren(elementDatatype);
	}
	
	private IXMIType getXMITypePourListeElementDatatype(List listeElementDatatype) {
		Iterator iterElementDatatype = listeElementDatatype.iterator();
		AssertHelper.assertBoolean(iterElementDatatype.hasNext(),"il n'y a pas d'élément datatype");
		Element elementDatatype = (Element) iterElementDatatype.next();
		String xmiIdRef = elementDatatype.getAttributeValue("xmi.idref");
		AssertHelper.assertDefined(xmiIdRef, "xmiIdRef du datatype");
		IXMIType xmiType;
		// recherche du XMIDatatype associé au datatype de l'attribut
		xmiType = IXMIClasse.Manager.getXMIClasseFromMapByXmiId(xmiIdRef);
		if( xmiType == null ) {
			xmiType = IXMIDatatype.Manager.getXMIDatatypeFromMapByXmiId(xmiIdRef);
		}
		AssertHelper.assertDefined(xmiType, "le type associé au xmiIdRef du datatype");
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
	private List getListeXMIOperationPourClasse(Element elementClasse, IXMIClasse xmiClasse) {
		List listeXMIOperation = new ArrayList();
		List listeElementOperationPourClasse = getListeElementOperationPourClasse(elementClasse);
		for(Iterator iterElementOperationPourClasse = listeElementOperationPourClasse.iterator(); iterElementOperationPourClasse.hasNext(); ) {
			Element elementOperationPourClasse = (Element) iterElementOperationPourClasse.next();
			String operationXmiId = elementOperationPourClasse.getAttributeValue("xmi.id");
			AssertHelper.assertDefined(operationXmiId, "xmiIdRef de l'operation");
			IXMIOperation xmiOperation = getXMIOperation(elementOperationPourClasse, xmiClasse);
			AssertHelper.assertDefined(xmiOperation, "operation de xmiIdRef = '"+operationXmiId+"'");
			listeXMIOperation.add(xmiOperation);
		}
		return listeXMIOperation;
	}
	
	private List getListeElementOperationPourClasse(Element element) {
		List listeElementOperationPourClasse = XmlUtils.getChildren(element, NOEUD.CLASSIFIER_FEATURE);
		if( listeElementOperationPourClasse == null || listeElementOperationPourClasse.isEmpty() ) {
			return new ArrayList();
		}
		AssertHelper.assertDefined(listeElementOperationPourClasse, "liste d'élément modelElementOperation dans l'élément package");
		AssertHelper.assertBoolean(listeElementOperationPourClasse.size() == 1, "il y a plus d'un modelElementOperation dans l'élément package");
		Element elementOperationPourClasse = (Element) listeElementOperationPourClasse.get(0);
		return XmlUtils.getChildren(elementOperationPourClasse, NOEUD.OPERATION);
	}
	
	private IXMIOperation getXMIOperation(Element elementOperation, IXMIClasse xmiClasse) {
		AssertHelper.assertDefined(elementOperation, "l'élément operation");
		AssertHelper.assertBoolean(NOEUD.OPERATION.equals(elementOperation.getName()),"l'élément n'est pas un operation");
		String operationNom = elementOperation.getAttributeValue("name");
		String xmiId = elementOperation.getAttributeValue("xmi.id");
		IXMIOperation xmiOperation = new XMIOperationBean(
				operationNom,
				xmiId,
				xmiClasse
			);
		List listeXMIParametrePourOperation = getListeXMIParametrePourOperation(elementOperation, xmiOperation);
		IXMIParametre xmiParametreRetour = null;
		for(Iterator iterXMIParametrePourOperation = listeXMIParametrePourOperation.iterator(); iterXMIParametrePourOperation.hasNext(); ) {
			IXMIParametre xmiParametrePourOperation = (IXMIParametre) iterXMIParametrePourOperation.next();
			if( "return".equals(xmiParametrePourOperation.getNom()) ) {
				xmiParametreRetour = xmiParametrePourOperation;
			}
		}
		AssertHelper.assertDefined(xmiParametreRetour, "le paramètre retour de l'opération");
		listeXMIParametrePourOperation.remove(xmiParametreRetour);
		AssertHelper.assertDefined(xmiParametreRetour, "le xmiId du datatype du paramètre retour de l'opération");
		xmiOperation.setParametreRetour(xmiParametreRetour);

		xmiOperation.setListeParametre(listeXMIParametrePourOperation);
		return xmiOperation;
	}
	
	private List getListeXMIParametrePourOperation(Element elementOperation, IXMIOperation xmiOperation) {
		List listeElementParametrePourOperation = getListeElementParametrePourOperation(elementOperation);
		Iterator iterElementParametrePourOperation = listeElementParametrePourOperation.iterator();
		AssertHelper.assertBoolean(iterElementParametrePourOperation.hasNext(),"il n'y a pas d'élément paramètre pour l'opération");
		List listeXMIParametre = new ArrayList();
		while( iterElementParametrePourOperation.hasNext() ) {
			Element elementParametre = (Element) iterElementParametrePourOperation.next();
			IXMIParametre xmiParametre = getXMIParametre(elementParametre, xmiOperation);
			listeXMIParametre.add(xmiParametre);
		}
		return listeXMIParametre;
	}
	
	private List getListeElementParametrePourOperation(Element elementOperation) {
		List listeElementBehavorialFeatureParameterPourOperation = XmlUtils.getChildren(elementOperation, NOEUD.BEHAVORIAL_FEATURE_PARAMETER);
		AssertHelper.assertDefined(listeElementBehavorialFeatureParameterPourOperation, "liste d'éléments behavorialFeatureParameter dans l'élément opération");
		AssertHelper.assertBoolean(listeElementBehavorialFeatureParameterPourOperation.size() == 1, "il y a plus d'un behavorialFeatureParameter dans l'élément opération");
		Element elementBehavorialFeatureParameterPourOperation = (Element) listeElementBehavorialFeatureParameterPourOperation.get(0);
		return XmlUtils.getChildren(elementBehavorialFeatureParameterPourOperation,NOEUD.PARAMETER);
	}
	
	private IXMIParametre getXMIParametre(Element elementParametre, IXMIOperation xmiOperation) {
		String nom = elementParametre.getAttributeValue("name");
		AssertHelper.assertDefined(nom, "nom du paramètre");
		String xmiId = elementParametre.getAttributeValue("xmi.id");
		AssertHelper.assertDefined(xmiId, "xmiId du paramètre");
		// type du paramètre
		IXMIType xmiType = getXMITypePourParametre(elementParametre);
		IXMIParametre parametre = new XMIParametreBean(
				nom,
				xmiId,
				xmiType,
				xmiOperation
			);
		AssertHelper.assertDefined(parametre, "le noeud associé au xmiIdRef du datatype de l'opération");
		return parametre;
	}
	
	private IXMIType getXMITypePourParametre(Element elementParametre) {
		List listeElementDatatype = getListeElementDatatypePourParametre(elementParametre);
		return getXMITypePourListeElementDatatype(listeElementDatatype);
	}
	
	private List getListeElementDatatypePourParametre(Element elementParametre) {
		List listeElementDatatype = XmlUtils.getChildren(elementParametre, NOEUD.PARAMETER_TYPE);
		AssertHelper.assertDefined(listeElementDatatype, "liste d'élément datatype");
		AssertHelper.assertBoolean(listeElementDatatype.size() == 1, "il y a plus d'un élément datatype");
		Element elementDatatype = (Element) listeElementDatatype.get(0);
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
	
	private void loadListeElementAssociation(Document document, IXMI xmi) {
		List listeElementAssociation = XmlUtils.getListeElementByNomNoeud(document.getRootElement(),NOEUD.ASSOCIATION);
		for( Iterator iterAssociation = listeElementAssociation.iterator(); iterAssociation.hasNext(); ) {
			Element elementAssociation = (Element) iterAssociation.next();
			IXMIAssociation xmiAssociation = getXMIAssociation(elementAssociation);
			xmi.addAssociation(xmiAssociation);
		}
	}
	
	private IXMIAssociation getXMIAssociation(Element elementAssociation) {
		String xmiId = elementAssociation.getAttributeValue("xmi.id");
		AssertHelper.assertDefined(xmiId, "xmiId de l'élément association");
		List listeElementAssociationConnection = XmlUtils.getChildren(elementAssociation,NOEUD.ASSOCIATION_CONNECTION);
		AssertHelper.assertDefined(listeElementAssociationConnection, "liste des éléments ASSOCIATION_CONNECTION du noeud ASSOCIATION.");
		AssertHelper.assertBoolean(listeElementAssociationConnection.size() == 1, "Le nombre d'éléments ASSOCIATION_CONNECTION du noeud ASSOCIATION est différent de 1.");
		Element elementAssociationConnection = (Element) listeElementAssociationConnection.get(0);
		AssertHelper.assertDefined(listeElementAssociationConnection, "liste des éléments ASSOCIATION_CONNECTION du noeud ASSOCIATION.");
		List listeElementAssociationEnd = XmlUtils.getChildren(elementAssociationConnection,NOEUD.ASSOCIATIONEND);
		AssertHelper.assertDefined(listeElementAssociationEnd, "liste des éléments ASSOCIATIONEND du noeud ASSOCIATION_CONNECTION.");
		AssertHelper.assertBoolean(listeElementAssociationEnd.size() == 2, "Le nombre d'éléments ASSOCIATIONEND du noeud ASSOCIATION_CONNECTION est différent de 2.");
		IXMIAssociation xmiAssociation =
			new XMIAssociationBean(
				xmiId
			);
		List listeXMIAssociationEnd = new ArrayList();
		for(Iterator iterElementAssociationEnd = listeElementAssociationEnd.iterator(); iterElementAssociationEnd.hasNext(); ) {
			Element elementAssociationEnd = (Element) iterElementAssociationEnd.next();
			AssertHelper.assertDefined(elementAssociationEnd, "élément ASSOCIATIONEND du noeud ASSOCIATION_CONNECTION");
			IXMIAssociationEnd xmiAssociationEnd = getXMIAssociationEnd(xmiAssociation, elementAssociationEnd);
			AssertHelper.assertDefined(xmiAssociationEnd,"élément de l'association");
			xmiAssociation.addXMIAssociationEnd(xmiAssociationEnd);
		}
		for(Iterator iterXMIAssociationEnd = xmiAssociation.getListeXMIAssociationEnd().iterator(); iterXMIAssociationEnd.hasNext(); ) {
			IXMIAssociationEnd xmiAssociationEnd = (IXMIAssociationEnd) iterXMIAssociationEnd.next();
			IXMIClasse classeDeXMIAssociationEnd = xmiAssociationEnd.getXMIClasseRef();
			String xmiIdRef = xmiAssociationEnd.getXMIIdRef();
			for(Iterator iterXMIAssociationEndNotEqualToXMIIdRef = xmiAssociation.getListeXMIAssociationEndByNotEqualToXMIIdRef(xmiIdRef).iterator(); iterXMIAssociationEndNotEqualToXMIIdRef.hasNext(); ) {
				IXMIAssociationEnd xmiAssociationEndNotEqualToXMIIdRef = (IXMIAssociationEnd) iterXMIAssociationEndNotEqualToXMIIdRef.next();
				classeDeXMIAssociationEnd.addAssociationEnd(xmiAssociationEndNotEqualToXMIIdRef);
			}
		}
		return xmiAssociation;
	}
	
	private IXMIAssociationEnd getXMIAssociationEnd(IXMIAssociation xmiAssociation, Element elementAssociationEnd) {
		AssertHelper.assertDefined(xmiAssociation, "xmiAssociation");
		
		List listeElementAssociationEndParticipant = XmlUtils.getChildren(elementAssociationEnd,NOEUD.ASSOCIATIONEND_PARTICIPANT);
		AssertHelper.assertDefined(listeElementAssociationEndParticipant, "liste des éléments ASSOCIATIONEND_PARTICIPANT du noeud ASSOCIATION.");
		AssertHelper.assertBoolean(listeElementAssociationEndParticipant.size() == 1, "Le nombre d'éléments ASSOCIATIONEND_PARTICIPANT du noeud ASSOCIATION est différent de 1.");
		Element elementAssociationEndParticipant = (Element) listeElementAssociationEndParticipant.get(0);
		AssertHelper.assertDefined(listeElementAssociationEndParticipant, "liste des éléments ASSOCIATIONEND_PARTICIPANT du noeud ASSOCIATION.");
		
		List listeElementChildrenDeAssociationEndParticipant = XmlUtils.getChildren(elementAssociationEndParticipant);
		AssertHelper.assertDefined(listeElementChildrenDeAssociationEndParticipant, "liste d'élément participant du noeud ASSOCIATIONEND_PARTICIPANT");
		AssertHelper.assertBoolean(listeElementChildrenDeAssociationEndParticipant.size() == 1, "il y a plus d'un participant du noeud ASSOCIATIONEND_PARTICIPANT");
		Element elementChildrenDeAssociationEndParticipant = (Element) listeElementChildrenDeAssociationEndParticipant.get(0);
		AssertHelper.assertDefined(elementChildrenDeAssociationEndParticipant, "l'élément participant du noeud ASSOCIATIONEND_PARTICIPANT");
		
		String xmiIdRef = elementChildrenDeAssociationEndParticipant.getAttributeValue("xmi.idref");
		AssertHelper.assertDefined(xmiIdRef, "xmiIdRef de l'élément participant du noeud ASSOCIATIONEND_PARTICIPANT");
		// recherche du XMINoeud associé au datatype de l'attribut
		//XMINoeud xmiNoeudParticipant = getXMINoeudByXmiId(xmiIdRef);
		//AssertHelper.assertDefined(xmiNoeudParticipant, "le noeud associé au xmiIdRef de l'élément participant du noeud ASSOCIATIONEND_PARTICIPANT");
		
		
		String nomChampDeAssociation = elementAssociationEnd.getAttributeValue("name");
		String typeAggregation = elementAssociationEnd.getAttributeValue("aggregation");
		
		IXMIClasse xmiClasseRef = XMIClasseBean.Manager.getXMIClasseFromMapByXmiId(xmiIdRef);
		AssertHelper.assertDefined(xmiClasseRef, "l'objet xmiClasse référencé par l'association");
		
		IXMIMultiplicity xmiMultiplicity = getXMIMultiplicityPourAssociationEnd(elementAssociationEnd);
		
		IXMIAssociationEnd xmiAssociationEnd = 
			new XMIAssociationEndBean(
				nomChampDeAssociation,
				xmiIdRef,
				xmiClasseRef,
				xmiMultiplicity,
				xmiAssociation
			);
		
		return xmiAssociationEnd;
	}
	
	private IXMIMultiplicity getXMIMultiplicityPourAttribut(Element elementAttribut) {
		AssertHelper.assertDefined(elementAttribut, "elementAttribut");
		
		List listeElementStructuralMultiplicity = XmlUtils.getChildren(elementAttribut, NOEUD.STRUCTURAL_FEATURE_MULTIPLICITY);
		AssertHelper.assertDefined(listeElementStructuralMultiplicity, "liste des éléments STRUCTURALFEATURE_MULTIPLICITY du noeud ASSOCIATION.");
		AssertHelper.assertBoolean(listeElementStructuralMultiplicity.size() == 1, "Le nombre d'éléments STRUCTURALFEATURE_MULTIPLICITY du noeud ASSOCIATION est différent de 1.");
		Element elementStructuralMultiplicity = (Element) listeElementStructuralMultiplicity.get(0);
		AssertHelper.assertDefined(elementStructuralMultiplicity, "élément STRUCTURALFEATURE_MULTIPLICITY du noeud ASSOCIATION.");
		
		return getXMIMultiplicityPourElementAssociationOuStructuralMultiplicity(elementStructuralMultiplicity);
	}
	
	private IXMIMultiplicity getXMIMultiplicityPourAssociationEnd(Element elementAssociationEnd) {
		AssertHelper.assertDefined(elementAssociationEnd, "elementAssociationEnd");
		
		List listeElementAssociationMultiplicity = XmlUtils.getChildren(elementAssociationEnd, NOEUD.ASSOCIATIONEND_MULTIPLICITY);
		AssertHelper.assertDefined(listeElementAssociationMultiplicity, "liste des éléments ASSOCIATIONEND_MULTIPLICITY du noeud ASSOCIATION.");
		AssertHelper.assertBoolean(listeElementAssociationMultiplicity.size() == 1, "Le nombre d'éléments ASSOCIATIONEND_MULTIPLICITY du noeud ASSOCIATION est différent de 1.");
		Element elementAssociationMultiplicity = (Element) listeElementAssociationMultiplicity.get(0);
		AssertHelper.assertDefined(elementAssociationMultiplicity, "élément ASSOCIATIONEND_MULTIPLICITY du noeud ASSOCIATION.");
		
		return getXMIMultiplicityPourElementAssociationOuStructuralMultiplicity(elementAssociationMultiplicity);
	}
	
	private IXMIMultiplicity getXMIMultiplicityPourElementAssociationOuStructuralMultiplicity(Element elementAssociationOuStructuralMultiplicity) {
		List listeElementMultiplicity = XmlUtils.getChildren(elementAssociationOuStructuralMultiplicity,NOEUD.MULTIPLICITY);
		AssertHelper.assertDefined(listeElementMultiplicity, "liste des éléments MULTIPLICITY du noeud ASSOCIATION.");
		AssertHelper.assertBoolean(listeElementMultiplicity.size() == 1, "Le nombre d'éléments MULTIPLICITY du noeud ASSOCIATION est différent de 1.");
		Element elementMultiplicity = (Element) listeElementMultiplicity.get(0);
		AssertHelper.assertDefined(listeElementMultiplicity, "liste des éléments MULTIPLICITY du noeud ASSOCIATION.");

		List listeElementMultiplicity_Range = XmlUtils.getChildren(elementMultiplicity,NOEUD.MULTIPLICITY_RANGE);
		AssertHelper.assertDefined(listeElementMultiplicity_Range, "liste des éléments MULTIPLICITY_RANGE du noeud MULTIPLICITY.");
		AssertHelper.assertBoolean(listeElementMultiplicity_Range.size() == 1, "Le nombre d'éléments MULTIPLICITY_RANGE du noeud MULTIPLICITY est différent de 1.");
		Element elementMultiplicity_Range = (Element) listeElementMultiplicity_Range.get(0);
		AssertHelper.assertDefined(listeElementMultiplicity_Range, "liste des éléments MULTIPLICITY_RANGE du noeud MULTIPLICITY.");

		List listeElementMultiplicityRange = XmlUtils.getChildren(elementMultiplicity_Range,NOEUD.MULTIPLICITYRANGE);
		AssertHelper.assertDefined(listeElementMultiplicityRange, "liste des éléments MULTIPLICITYRANGE du noeud MULTIPLICITY_RANGE.");
		AssertHelper.assertBoolean(listeElementMultiplicityRange.size() == 1, "Le nombre d'éléments MULTIPLICITYRANGE du noeud MULTIPLICITY_RANGE est différent de 1.");
		Element elementMultiplicityRange = (Element) listeElementMultiplicityRange.get(0);
		AssertHelper.assertDefined(listeElementMultiplicityRange, "liste des éléments MULTIPLICITYRANGE du noeud MULTIPLICITY_RANGE.");
		
		String nombreMinimum = elementMultiplicityRange.getAttributeValue("lower");
		String nombreMaximum = elementMultiplicityRange.getAttributeValue("upper");
		
		IXMIMultiplicity xmiMultiplicity = 
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
	
	private void loadListeElementGeneralisation(Document document, IXMI xmi) {
		List listeElementGeneralisation = XmlUtils.getListeElementByNomNoeud(document.getRootElement(),NOEUD.GENERELIZATION);
		for( Iterator iterGeneralisation = listeElementGeneralisation.iterator(); iterGeneralisation.hasNext(); ) {
			Element elementGeneralisation = (Element) iterGeneralisation.next();
			IXMGeneralisation xmGeneralisation = getXMGeneralisation(elementGeneralisation);
			xmi.addGeneralisation(xmGeneralisation);
			defineParentToEnfant(xmGeneralisation);
		}
	}
	
	private IXMGeneralisation getXMGeneralisation(Element elementGeneralisation) {
		Element elementGeneralisationParent = getElementGeneralisationParentPourGeneralisation(elementGeneralisation);
		IXMIType xmiTypeParent = getXMITypePourGeneralisationParent(elementGeneralisationParent);
		Element elementGeneralisationEnfant = getElementGeneralisationEnfantPourGeneralisation(elementGeneralisation);
		IXMIType xmiTypeEnfant = getXMITypePourGeneralisationEnfant(elementGeneralisationEnfant);
		AssertHelper.assertDefined(xmiTypeParent, "objet xmiType de l'élément Parent GENERALIZATION_PARENT du noeud GENERALIZATION.");
		AssertHelper.assertDefined(xmiTypeEnfant, "objet xmiType de l'élément Enfant GENERALIZATION_ENFANT du noeud GENERALIZATION.");
		IXMGeneralisation xmGeneralisation =
			new XMGeneralisationBean(
				xmiTypeParent,
				xmiTypeEnfant
			);
		return xmGeneralisation;
	}
	
	private Element getElementGeneralisationParentPourGeneralisation(Element elementGeneralisation) {
		List listeElementGeneralisationParent = XmlUtils.getChildren(elementGeneralisation, NOEUD.GENERELIZATION_PARENT);
		AssertHelper.assertDefined(listeElementGeneralisationParent, "liste d'élément Generalisation Parent");
		AssertHelper.assertBoolean(listeElementGeneralisationParent.size() == 1, "il y a plus d'un élément Generalisation Parent");
		return (Element) listeElementGeneralisationParent.get(0);
	}
	
	private Element getElementGeneralisationEnfantPourGeneralisation(Element elementGeneralisation) {
		List listeElementGeneralisationEnfant = XmlUtils.getChildren(elementGeneralisation, NOEUD.GENERELIZATION_CHILD);
		AssertHelper.assertDefined(listeElementGeneralisationEnfant, "liste d'élément Generalisation Enfant");
		AssertHelper.assertBoolean(listeElementGeneralisationEnfant.size() == 1, "il y a plus d'un élément Generalisation Enfant");
		return (Element) listeElementGeneralisationEnfant.get(0);
	}
	
	private IXMIType getXMITypePourGeneralisationParent(Element elementGeneralisationParent) {
		List listeElementDatatype = getListeElementDatatypePourGeneralisationParent(elementGeneralisationParent);
		return getXMITypePourListeElementDatatype(listeElementDatatype);
	}
	
	private List getListeElementDatatypePourGeneralisationParent(Element elementGeneralisationParent) {
		List listeElementDatatype = XmlUtils.getChildren(elementGeneralisationParent, NOEUD.GENERELIZATION_PARENT);
		AssertHelper.assertDefined(listeElementDatatype, "liste d'élément datatype");
		AssertHelper.assertBoolean(listeElementDatatype.size() == 1, "il y a plus d'un élément datatype");
		Element elementDatatype = (Element) listeElementDatatype.get(0);
		return XmlUtils.getChildren(elementDatatype);
	}
	
	private IXMIType getXMITypePourGeneralisationEnfant(Element elementGeneralisationEnfant) {
		List listeElementDatatype = getListeElementDatatypePourGeneralisationEnfant(elementGeneralisationEnfant);
		return getXMITypePourListeElementDatatype(listeElementDatatype);
	}
	
	private List getListeElementDatatypePourGeneralisationEnfant(Element elementGeneralisationEnfant) {
		List listeElementDatatype = XmlUtils.getChildren(elementGeneralisationEnfant, NOEUD.GENERELIZATION_CHILD);
		AssertHelper.assertDefined(listeElementDatatype, "liste d'élément datatype");
		AssertHelper.assertBoolean(listeElementDatatype.size() == 1, "il y a plus d'un élément datatype");
		Element elementDatatype = (Element) listeElementDatatype.get(0);
		return XmlUtils.getChildren(elementDatatype);
	}
	
	private void defineParentToEnfant(IXMGeneralisation generalisation) {
		AssertHelper.assertDefined(generalisation.getXmiTypeParent(), "le type du Parent");
		AssertHelper.assertDefined(generalisation.getXmiTypeEnfant(), "le type de l'Enfant");
		/** On ne gère que les classes pour le moment pour la généralisation */
		if( ( generalisation.getXmiTypeParent() instanceof IXMIClasse )
		 && ( generalisation.getXmiTypeEnfant() instanceof IXMIClasse ) ) {
			IXMIClasse classeParent = (IXMIClasse) generalisation.getXmiTypeParent();
			IXMIClasse classeEnfant = (IXMIClasse) generalisation.getXmiTypeEnfant();
			classeEnfant.addClasseParent(classeParent);
		}
	}
	
}
