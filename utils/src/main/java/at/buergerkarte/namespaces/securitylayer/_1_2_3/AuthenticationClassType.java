//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.31 at 07:38:37 PM CET 
//


package at.buergerkarte.namespaces.securitylayer._1_2_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationClassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="anonym"/>
 *     &lt;enumeration value="pseudoanonym"/>
 *     &lt;enumeration value="certified"/>
 *     &lt;enumeration value="certifiedGovAgency"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationClassType")
@XmlEnum
public enum AuthenticationClassType {

    @XmlEnumValue("anonym")
    ANONYM("anonym"),
    @XmlEnumValue("pseudoanonym")
    PSEUDOANONYM("pseudoanonym"),
    @XmlEnumValue("certified")
    CERTIFIED("certified"),
    @XmlEnumValue("certifiedGovAgency")
    CERTIFIED_GOV_AGENCY("certifiedGovAgency");
    private final String value;

    AuthenticationClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthenticationClassType fromValue(String v) {
        for (AuthenticationClassType c: AuthenticationClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
