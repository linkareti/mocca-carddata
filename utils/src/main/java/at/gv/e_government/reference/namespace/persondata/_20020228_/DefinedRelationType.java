//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.24 at 05:42:21 PM MEZ 
//


package at.gv.e_government.reference.namespace.persondata._20020228_;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DefinedRelationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DefinedRelationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="family:Parent"/>
 *     &lt;enumeration value="family:Child"/>
 *     &lt;enumeration value="family:Sibling"/>
 *     &lt;enumeration value="family:Grandparent"/>
 *     &lt;enumeration value="family:Grandchild"/>
 *     &lt;enumeration value="family:Spouse"/>
 *     &lt;enumeration value="function:LegalGuardian"/>
 *     &lt;enumeration value="function:IsGuardedBy"/>
 *     &lt;enumeration value="function:Cohabitant"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DefinedRelationType")
@XmlEnum
public enum DefinedRelationType {

    @XmlEnumValue("family:Parent")
    FAMILY_PARENT("family:Parent"),
    @XmlEnumValue("family:Child")
    FAMILY_CHILD("family:Child"),
    @XmlEnumValue("family:Sibling")
    FAMILY_SIBLING("family:Sibling"),
    @XmlEnumValue("family:Grandparent")
    FAMILY_GRANDPARENT("family:Grandparent"),
    @XmlEnumValue("family:Grandchild")
    FAMILY_GRANDCHILD("family:Grandchild"),
    @XmlEnumValue("family:Spouse")
    FAMILY_SPOUSE("family:Spouse"),
    @XmlEnumValue("function:LegalGuardian")
    FUNCTION_LEGAL_GUARDIAN("function:LegalGuardian"),
    @XmlEnumValue("function:IsGuardedBy")
    FUNCTION_IS_GUARDED_BY("function:IsGuardedBy"),
    @XmlEnumValue("function:Cohabitant")
    FUNCTION_COHABITANT("function:Cohabitant");
    private final String value;

    DefinedRelationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DefinedRelationType fromValue(String v) {
        for (DefinedRelationType c: DefinedRelationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
