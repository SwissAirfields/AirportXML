//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.10 at 05:00:27 PM CEST 
//


package generatedXmlClasses;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctAirportGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctAirportGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="groupID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="parentGroupID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="groupIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctAirportGroup")
public class CtAirportGroup {

    @XmlAttribute(name = "displayName")
    protected String displayName;
    @XmlAttribute(name = "groupID", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger groupID;
    @XmlAttribute(name = "parentGroupID")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parentGroupID;
    @XmlAttribute(name = "groupIndex")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger groupIndex;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroupID(BigInteger value) {
        this.groupID = value;
    }

    /**
     * Gets the value of the parentGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentGroupID() {
        return parentGroupID;
    }

    /**
     * Sets the value of the parentGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentGroupID(BigInteger value) {
        this.parentGroupID = value;
    }

    /**
     * Gets the value of the groupIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroupIndex() {
        return groupIndex;
    }

    /**
     * Sets the value of the groupIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroupIndex(BigInteger value) {
        this.groupIndex = value;
    }

}
