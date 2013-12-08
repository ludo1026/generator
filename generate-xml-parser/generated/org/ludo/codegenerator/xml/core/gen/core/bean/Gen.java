package org.ludo.codegenerator.xml.core.gen.core.bean;

import java.util.List;

public interface Gen 
{
	
	/** R�cup�ration de l'�l�ment parent */
	
	/** R�cup�ration des �l�ments fils */

    public GenTemplates getGenTemplates();
    
    public void setGenTemplates(GenTemplates genTemplates);
	

    public GenTemplateGroupes getGenTemplateGroupes();
    
    public void setGenTemplateGroupes(GenTemplateGroupes genTemplateGroupes);
	

    public GenStereotypes getGenStereotypes();
    
    public void setGenStereotypes(GenStereotypes genStereotypes);
	

    public GenClasses getGenClasses();
    
    public void setGenClasses(GenClasses genClasses);
	

    public GenGenererGroupe getGenGenererGroupe();
    
    public void setGenGenererGroupe(GenGenererGroupe genGenererGroupe);
	
	
	/** R�cup�ration des attributs de l'objet de base sans transtypage */
	
	
	/** R�cup�ration des attributs de l'objet de base avec transtypage */
	
}
