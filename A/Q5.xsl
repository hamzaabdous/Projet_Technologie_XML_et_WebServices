<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    <xsl:template match="/">
        <html>
            <body>
            
                
                        <h4>Operations Q4:</h4>
                        <table border="1" width="80%">
                            <tr>
                                <th>Type</th>
                                <th>Montant</th>
                                <th>Date</th>
                                <th>Desciption</th>
                            </tr>
                            <xsl:for-each select="releve/operations/operation[@type='CREDIT']">
                                <tr>
                                    <td><xsl:value-of select="@type"/></td>
                                    <td><xsl:value-of select="@montant"/></td>
                                    <td> <xsl:value-of select="@date"/></td>
                                    <td> <xsl:value-of select="@description"/></td>
                                    
                                </tr>
                                
                            </xsl:for-each>
                        </table>
                        
                        
                    
             
            </body>
        </html>
        
    </xsl:template>
    
</xsl:stylesheet>