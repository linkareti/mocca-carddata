//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.24 at 05:42:21 PM MEZ 
//


package at.gv.e_government.reference.namespace.persondata._20020228_;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelcomNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelcomNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://reference.e-government.gv.at/namespace/persondata/20020228#}FormattedNumber"/>
 *         &lt;group ref="{http://reference.e-government.gv.at/namespace/persondata/20020228#}TelcomNumberGroup"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelcomNumberType", propOrder = {
    "formattedNumber",
    "internationalCountryCode",
    "nationalNumber",
    "areaCityCode",
    "subscriberNumber",
    "extension"
})
@XmlSeeAlso({
    MobileTelcomNumberType.class
})
public class TelcomNumberType {

    @XmlElement(name = "FormattedNumber")
    protected String formattedNumber;
    @XmlElement(name = "InternationalCountryCode")
    protected String internationalCountryCode;
    @XmlElement(name = "NationalNumber")
    protected String nationalNumber;
    @XmlElement(name = "AreaCityCode")
    protected String areaCityCode;
    @XmlElement(name = "SubscriberNumber")
    protected String subscriberNumber;
    @XmlElement(name = "Extension")
    protected String extension;

    /**
     * Gets the value of the formattedNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedNumber() {
        return formattedNumber;
    }

    /**
     * Sets the value of the formattedNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedNumber(String value) {
        this.formattedNumber = value;
    }

    /**
     * Gets the value of the internationalCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalCountryCode() {
        return internationalCountryCode;
    }

    /**
     * Sets the value of the internationalCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalCountryCode(String value) {
        this.internationalCountryCode = value;
    }

    /**
     * Gets the value of the nationalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalNumber() {
        return nationalNumber;
    }

    /**
     * Sets the value of the nationalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalNumber(String value) {
        this.nationalNumber = value;
    }

    /**
     * Gets the value of the areaCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCityCode() {
        return areaCityCode;
    }

    /**
     * Sets the value of the areaCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCityCode(String value) {
        this.areaCityCode = value;
    }

    /**
     * Gets the value of the subscriberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberNumber() {
        return subscriberNumber;
    }

    /**
     * Sets the value of the subscriberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberNumber(String value) {
        this.subscriberNumber = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

}
