//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.31 at 07:38:37 PM CET 
//


package at.buergerkarte.namespaces.securitylayer._1_2_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScriptElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScriptElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="Reset" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}ResetType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CommandAPDU" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}CommandAPDUType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScriptElement", propOrder = {
    "resetAndCommandAPDU"
})
public class ScriptElement {

    @XmlElements({
        @XmlElement(name = "Reset", type = ResetType.class),
        @XmlElement(name = "CommandAPDU", type = CommandAPDUType.class)
    })
    protected List<Object> resetAndCommandAPDU;

    /**
     * Gets the value of the resetAndCommandAPDU property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resetAndCommandAPDU property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResetAndCommandAPDU().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResetType }
     * {@link CommandAPDUType }
     * 
     * 
     */
    public List<Object> getResetAndCommandAPDU() {
        if (resetAndCommandAPDU == null) {
            resetAndCommandAPDU = new ArrayList<Object>();
        }
        return this.resetAndCommandAPDU;
    }

}
