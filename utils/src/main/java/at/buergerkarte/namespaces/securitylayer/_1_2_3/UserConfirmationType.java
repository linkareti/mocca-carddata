//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.31 at 07:38:37 PM CET 
//


package at.buergerkarte.namespaces.securitylayer._1_2_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for UserConfirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserConfirmationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.buergerkarte.at/namespaces/securitylayer/1.2#>UserConfirmationSimpleType">
 *       &lt;attribute name="UserMayChange" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserConfirmationType", propOrder = {
    "value"
})
public class UserConfirmationType {

    @XmlValue
    protected UserConfirmationSimpleType value;
    @XmlAttribute(name = "UserMayChange", required = true)
    protected boolean userMayChange;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link UserConfirmationSimpleType }
     *     
     */
    public UserConfirmationSimpleType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserConfirmationSimpleType }
     *     
     */
    public void setValue(UserConfirmationSimpleType value) {
        this.value = value;
    }

    /**
     * Gets the value of the userMayChange property.
     * 
     */
    public boolean isUserMayChange() {
        return userMayChange;
    }

    /**
     * Sets the value of the userMayChange property.
     * 
     */
    public void setUserMayChange(boolean value) {
        this.userMayChange = value;
    }

}
