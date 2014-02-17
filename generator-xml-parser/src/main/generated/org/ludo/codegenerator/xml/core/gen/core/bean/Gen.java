package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface Gen 
{
	
	/** Récupération de l'élément parent */
	
	/** Récupération des éléments fils */

    public GenTemplates getGenTemplates();
    
    public void setGenTemplates(GenTemplates genTemplates);
	

    public GenTemplateGroupes getGenTemplateGroupes();
    
    public void setGenTemplateGroupes(GenTemplateGroupes genTemplateGroupes);
	

    public GenStereotypes getGenStereotypes();
    
    public void setGenStereotypes(GenStereotypes genStereotypes);
	

    public GenClasses getGenClasses();
    
    public void setGenClasses(GenClasses genClasses);
	

    public GenGenerate getGenGenerate();
    
    public void setGenGenerate(GenGenerate genGenerate);
	
	
	/** Récupération des attributs de l'objet de base sans transtypage */
	
	
	/** Récupération des attributs de l'objet de base avec transtypage */
	
}
