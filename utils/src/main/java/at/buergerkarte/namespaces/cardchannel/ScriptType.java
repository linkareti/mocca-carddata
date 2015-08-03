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



package at.buergerkarte.namespaces.cardchannel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains the script to be executed by the BKU
 * 
 * <p>Java class for ScriptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScriptType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="Reset" type="{}ResetType"/>
 *         &lt;element name="CommandAPDU" type="{}CommandAPDUType"/>
 *         &lt;element name="VerifyAPDU" type="{}VerifyAPDUType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScriptType", propOrder = {
    "resetOrCommandAPDUOrVerifyAPDU"
})
public class ScriptType {

    @XmlElements({
        @XmlElement(name = "Reset", type = ResetType.class),
        @XmlElement(name = "VerifyAPDU", type = VerifyAPDUType.class),
        @XmlElement(name = "CommandAPDU", type = CommandAPDUType.class)
    })
    protected List<Object> resetOrCommandAPDUOrVerifyAPDU;

    /**
     * Gets the value of the resetOrCommandAPDUOrVerifyAPDU property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resetOrCommandAPDUOrVerifyAPDU property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResetOrCommandAPDUOrVerifyAPDU().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResetType }
     * {@link VerifyAPDUType }
     * {@link CommandAPDUType }
     * 
     * 
     */
    public List<Object> getResetOrCommandAPDUOrVerifyAPDU() {
        if (resetOrCommandAPDUOrVerifyAPDU == null) {
            resetOrCommandAPDUOrVerifyAPDU = new ArrayList<Object>();
        }
        return this.resetOrCommandAPDUOrVerifyAPDU;
    }

}
