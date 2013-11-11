/*
 * Crée le 4 oct. 08 par Ludovic Chaboud.
 *
 */
package org.ludo.umlgenerator.xml.core.xmlreader;

import org.apache.commons.lang.StringUtils;

/**
 * Description de la classe.
 *
 * @author Ludovic Chaboud
 * @date 4 oct. 08
 * @version $Revision$ $Date$
 *
 */
public class TypeXmiExporterManager
{

    public static TypeXmiExporter getTypeXmiExporter(final String exporter) {
        if (StringUtils.contains(exporter, "Enterprise Architect")) {
            return TypeXmiExporter.XMI_EXPORTER__ENTERPRISE_ARCHITECT;
        }
        else
        if (StringUtils.contains(exporter, "ArgoUML")) {
            return TypeXmiExporter.XMI_EXPORTER__ARGO_UML;
        }
        else {
            throw new IllegalStateException("Aucun type d'exportateur xmi trouvé pour l'exportateur : '"+exporter+"'");
        }
    }

}

