//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.31 at 07:38:37 PM CET 
//


package at.buergerkarte.namespaces.securitylayer._1_2_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InfoboxUpdateRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoboxUpdateRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InfoboxIdentifier" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}BoxIdentifierType"/>
 *         &lt;choice>
 *           &lt;element name="BinaryFileParameters" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}Base64XMLContentType"/>
 *           &lt;element name="AssocArrayParameters" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}InfoboxUpdateParamsAssocArrayType"/>
 *         &lt;/choice>
 *         &lt;element name="BoxSpecificParameters" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}AnyChildrenType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoboxUpdateRequestType", propOrder = {
    "infoboxIdentifier",
    "binaryFileParameters",
    "assocArrayParameters",
    "boxSpecificParameters"
})
public class InfoboxUpdateRequestType {

    @XmlElement(name = "InfoboxIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String infoboxIdentifier;
    @XmlElement(name = "BinaryFileParameters")
    protected Base64XMLContentType binaryFileParameters;
    @XmlElement(name = "AssocArrayParameters")
    protected InfoboxUpdateParamsAssocArrayType assocArrayParameters;
    @XmlElement(name = "BoxSpecificParameters")
    protected AnyChildrenType boxSpecificParameters;

    /**
     * Gets the value of the infoboxIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoboxIdentifier() {
        return infoboxIdentifier;
    }

    /**
     * Sets the value of the infoboxIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoboxIdentifier(String value) {
        this.infoboxIdentifier = value;
    }

    /**
     * Gets the value of the binaryFileParameters property.
     * 
     * @return
     *     possible object is
     *     {@link Base64XMLContentType }
     *     
     */
    public Base64XMLContentType getBinaryFileParameters() {
        return binaryFileParameters;
    }

    /**
     * Sets the value of the binaryFileParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64XMLContentType }
     *     
     */
    public void setBinaryFileParameters(Base64XMLContentType value) {
        this.binaryFileParameters = value;
    }

    /**
     * Gets the value of the assocArrayParameters property.
     * 
     * @return
     *     possible object is
     *     {@link InfoboxUpdateParamsAssocArrayType }
     *     
     */
    public InfoboxUpdateParamsAssocArrayType getAssocArrayParameters() {
        return assocArrayParameters;
    }

    /**
     * Sets the value of the assocArrayParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoboxUpdateParamsAssocArrayType }
     *     
     */
    public void setAssocArrayParameters(InfoboxUpdateParamsAssocArrayType value) {
        this.assocArrayParameters = value;
    }

    /**
     * Gets the value of the boxSpecificParameters property.
     * 
     * @return
     *     possible object is
     *     {@link AnyChildrenType }
     *     
     */
    public AnyChildrenType getBoxSpecificParameters() {
        return boxSpecificParameters;
    }

    /**
     * Sets the value of the boxSpecificParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyChildrenType }
     *     
     */
    public void setBoxSpecificParameters(AnyChildrenType value) {
        this.boxSpecificParameters = value;
    }

}
