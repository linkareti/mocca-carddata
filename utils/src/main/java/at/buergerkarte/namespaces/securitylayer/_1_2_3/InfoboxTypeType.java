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
 * <p>Java class for InfoboxTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InfoboxTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BinaryFile"/>
 *     &lt;enumeration value="AssocArray"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InfoboxTypeType")
@XmlEnum
public enum InfoboxTypeType {

    @XmlEnumValue("BinaryFile")
    BINARY_FILE("BinaryFile"),
    @XmlEnumValue("AssocArray")
    ASSOC_ARRAY("AssocArray");
    private final String value;

    InfoboxTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InfoboxTypeType fromValue(String v) {
        for (InfoboxTypeType c: InfoboxTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
