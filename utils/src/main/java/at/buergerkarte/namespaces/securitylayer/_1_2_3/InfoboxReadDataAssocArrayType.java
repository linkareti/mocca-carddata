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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InfoboxReadDataAssocArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoboxReadDataAssocArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Key" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}BoxIdentifierType"/>
 *         &lt;/sequence>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Pair" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}InfoboxAssocArrayPairType"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoboxReadDataAssocArrayType", propOrder = {
    "key",
    "pair"
})
public class InfoboxReadDataAssocArrayType {

    @XmlElement(name = "Key")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected List<String> key;
    @XmlElement(name = "Pair")
    protected List<InfoboxAssocArrayPairType> pair;

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKey() {
        if (key == null) {
            key = new ArrayList<String>();
        }
        return this.key;
    }

    /**
     * Gets the value of the pair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoboxAssocArrayPairType }
     * 
     * 
     */
    public List<InfoboxAssocArrayPairType> getPair() {
        if (pair == null) {
            pair = new ArrayList<InfoboxAssocArrayPairType>();
        }
        return this.pair;
    }

}
