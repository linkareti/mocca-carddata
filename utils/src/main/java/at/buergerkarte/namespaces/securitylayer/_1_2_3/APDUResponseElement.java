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
 * <p>Java class for APDUResponseElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APDUResponseElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="ATR" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}APDUATRType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResponseAPDU" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}ResponseAPDUType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APDUResponseElement", propOrder = {
    "atrAndResponseAPDU"
})
public class APDUResponseElement {

    @XmlElements({
        @XmlElement(name = "ResponseAPDU", type = ResponseAPDUType.class),
        @XmlElement(name = "ATR", type = APDUATRType.class)
    })
    protected List<Object> atrAndResponseAPDU;

    /**
     * Gets the value of the atrAndResponseAPDU property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atrAndResponseAPDU property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATRAndResponseAPDU().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseAPDUType }
     * {@link APDUATRType }
     * 
     * 
     */
    public List<Object> getATRAndResponseAPDU() {
        if (atrAndResponseAPDU == null) {
            atrAndResponseAPDU = new ArrayList<Object>();
        }
        return this.atrAndResponseAPDU;
    }

}
