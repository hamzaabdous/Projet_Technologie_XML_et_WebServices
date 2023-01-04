<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    
    <xsl:template match="/">
        <html>
            <body>
                <h2>Releve : </h2>
                <ul>
                    <xsl:for-each select="releve">
                        <li>RIB : <xsl:value-of select="@RIB"/></li>
                        <li>Date Releve :<xsl:value-of select="dateReleve"/></li>
                        <li>Solde : <xsl:value-of select="solde"/></li>
                        <li>DateDebut :<xsl:value-of select="operations/@dateDebut"/></li>
                        <li>DateFin :<xsl:value-of select="operations/@dateFin"/></li>
                        <h4>Operations Q4:</h4>
                        <table border="1" width="80%">
                            <tr>
                                <th>Type</th>
                                <th>Montant</th>
                                <th>Date</th>
                                <th>Desciption</th>
                            </tr>
                            <xsl:for-each select="operations/operation">
                                <tr>
                                    <td><xsl:value-of select="@type"/></td>
                                    <td><xsl:value-of select="@montant"/></td>
                                    <td> <xsl:value-of select="@date"/></td>
                                    <td> <xsl:value-of select="@description"/></td>
                                    
                                </tr>
                                
                            </xsl:for-each>
                        </table>
                        <table border="1" width="80%">
                            <tr>
                                <th>Total CREDIT :<xsl:value-of select="count(operations/operation[@type='CREDIT'])"></xsl:value-of></th>
                                <th>Total DEBIT :<xsl:value-of select="count(operations/operation[@type='DEBIT'])"></xsl:value-of></th>
                              
                            </tr>
                            
                        </table>
                    
                        
                          
                    </xsl:for-each>
                </ul>
            </body>
        </html>
        
    </xsl:template>
    
</xsl:stylesheet>