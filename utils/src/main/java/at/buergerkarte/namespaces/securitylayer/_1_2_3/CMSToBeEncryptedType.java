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


/**
 * <p>Java class for CMSToBeEncryptedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMSToBeEncryptedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetaInfo" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}MetaInfoType"/>
 *         &lt;element name="Content" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}Base64OptRefContentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMSToBeEncryptedType", propOrder = {
    "metaInfo",
    "content"
})
public class CMSToBeEncryptedType {

    @XmlElement(name = "MetaInfo", required = true)
    protected MetaInfoType metaInfo;
    @XmlElement(name = "Content", required = true)
    protected Base64OptRefContentType content;

    /**
     * Gets the value of the metaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MetaInfoType }
     *     
     */
    public MetaInfoType getMetaInfo() {
        return metaInfo;
    }

    /**
     * Sets the value of the metaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaInfoType }
     *     
     */
    public void setMetaInfo(MetaInfoType value) {
        this.metaInfo = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Base64OptRefContentType }
     *     
     */
    public Base64OptRefContentType getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64OptRefContentType }
     *     
     */
    public void setContent(Base64OptRefContentType value) {
        this.content = value;
    }

}
