//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.05 at 10:27:20 PM CEST 
//


package generatedXmlClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stBankShearEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stBankShearEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="bank" type="{}stRestrictedRotation" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stBankShearEntry")
public class StBankShearEntry {

    @XmlAttribute(name = "bank")
    protected Double bank;

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBank(Double value) {
        this.bank = value;
    }

}
