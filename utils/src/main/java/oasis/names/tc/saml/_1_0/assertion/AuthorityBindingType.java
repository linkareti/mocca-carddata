//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.24 at 05:41:17 PM MEZ 
//


package oasis.names.tc.saml._1_0.assertion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for AuthorityBindingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorityBindingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AuthorityKind" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="Location" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Binding" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityBindingType")
public class AuthorityBindingType {

    @XmlAttribute(name = "AuthorityKind", required = true)
    protected QName authorityKind;
    @XmlAttribute(name = "Location", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String location;
    @XmlAttribute(name = "Binding", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String binding;

    /**
     * Gets the value of the authorityKind property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getAuthorityKind() {
        return authorityKind;
    }

    /**
     * Sets the value of the authorityKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setAuthorityKind(QName value) {
        this.authorityKind = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the binding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinding() {
        return binding;
    }

    /**
     * Sets the value of the binding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinding(String value) {
        this.binding = value;
    }

}
