//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.31 at 07:38:37 PM CET 
//


package at.buergerkarte.namespaces.securitylayer._1_2_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.w3._2000._09.xmldsig_.KeyInfoType;


/**
 * <p>Java class for VerifyCMSSignatureResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifyCMSSignatureResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="SignerInfo" type="{http://www.w3.org/2000/09/xmldsig#}KeyInfoType"/>
 *         &lt;element name="SignatureCheck" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}CheckResultType"/>
 *         &lt;element name="CertificateCheck" type="{http://www.buergerkarte.at/namespaces/securitylayer/1.2#}CheckResultType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyCMSSignatureResponseType", propOrder = {
    "signerInfoAndSignatureCheckAndCertificateCheck"
})
public class VerifyCMSSignatureResponseType {

    @XmlElementRefs({
        @XmlElementRef(name = "SignatureCheck", namespace = "http://www.buergerkarte.at/namespaces/securitylayer/1.2#", type = JAXBElement.class),
        @XmlElementRef(name = "CertificateCheck", namespace = "http://www.buergerkarte.at/namespaces/securitylayer/1.2#", type = JAXBElement.class),
        @XmlElementRef(name = "SignerInfo", namespace = "http://www.buergerkarte.at/namespaces/securitylayer/1.2#", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> signerInfoAndSignatureCheckAndCertificateCheck;

    /**
     * Gets the value of the signerInfoAndSignatureCheckAndCertificateCheck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signerInfoAndSignatureCheckAndCertificateCheck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignerInfoAndSignatureCheckAndCertificateCheck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CheckResultType }{@code >}
     * {@link JAXBElement }{@code <}{@link KeyInfoType }{@code >}
     * {@link JAXBElement }{@code <}{@link CheckResultType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getSignerInfoAndSignatureCheckAndCertificateCheck() {
        if (signerInfoAndSignatureCheckAndCertificateCheck == null) {
            signerInfoAndSignatureCheckAndCertificateCheck = new ArrayList<JAXBElement<?>>();
        }
        return this.signerInfoAndSignatureCheckAndCertificateCheck;
    }

}
