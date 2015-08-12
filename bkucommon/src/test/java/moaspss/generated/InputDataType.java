/*
 * Copyright 2011 by Graz University of Technology, Austria
 * MOCCA has been developed by the E-Government Innovation Center EGIZ, a joint
 * initiative of the Federal Chancellery Austria and Graz University of Technology.
 *
 * Licensed under the EUPL, Version 1.1 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * http://www.osor.eu/eupl/
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 *
 * This product combines work with different licenses. See the "NOTICE" text
 * file for details on the various modules and licenses.
 * The "NOTICE" text file is part of the distribution. Any derivative works
 * that you distribute must include a readable copy of the "NOTICE" text file.
 */



package moaspss.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InputDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://reference.e-government.gv.at/namespace/moa/20020822#}ContentExLocRefBaseType">
 *       &lt;attribute name="PartOf" default="SignedInfo">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="SignedInfo"/>
 *             &lt;enumeration value="XMLDSIGManifest"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ReferringSigReference" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputDataType")
public class InputDataType
    extends ContentExLocRefBaseType
{

    @XmlAttribute(name = "PartOf")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String partOf;
    @XmlAttribute(name = "ReferringSigReference")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger referringSigReference;

    /**
     * Gets the value of the partOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartOf() {
        if (partOf == null) {
            return "SignedInfo";
        } else {
            return partOf;
        }
    }

    /**
     * Sets the value of the partOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartOf(String value) {
        this.partOf = value;
    }

    /**
     * Gets the value of the referringSigReference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReferringSigReference() {
        return referringSigReference;
    }

    /**
     * Sets the value of the referringSigReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReferringSigReference(BigInteger value) {
        this.referringSigReference = value;
    }

}
