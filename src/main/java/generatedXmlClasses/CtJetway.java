//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.10 at 05:00:27 PM CEST 
//


package generatedXmlClasses;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctJetway complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctJetway">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SceneryObject" type="{}ctSceneryObject" maxOccurs="2"/>
 *       &lt;/sequence>
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentGroupID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="groupIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="gateName" use="required" type="{}stParkingName" />
 *       &lt;attribute name="parkingNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="suffix" type="{}stParkingSuffix" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctJetway", propOrder = {
    "sceneryObject"
})
public class CtJetway {

    @XmlElement(name = "SceneryObject", required = true)
    protected List<CtSceneryObject> sceneryObject;
    @XmlAttribute(name = "displayName")
    protected String displayName;
    @XmlAttribute(name = "parentGroupID")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parentGroupID;
    @XmlAttribute(name = "groupIndex")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger groupIndex;
    @XmlAttribute(name = "gateName", required = true)
    protected StParkingName gateName;
    @XmlAttribute(name = "parkingNumber", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parkingNumber;
    @XmlAttribute(name = "suffix")
    protected StParkingSuffix suffix;

    /**
     * Gets the value of the sceneryObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sceneryObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSceneryObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtSceneryObject }
     * 
     * 
     */
    public List<CtSceneryObject> getSceneryObject() {
        if (sceneryObject == null) {
            sceneryObject = new ArrayList<CtSceneryObject>();
        }
        return this.sceneryObject;
    }

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

    /**
     * Gets the value of the gateName property.
     * 
     * @return
     *     possible object is
     *     {@link StParkingName }
     *     
     */
    public StParkingName getGateName() {
        return gateName;
    }

    /**
     * Sets the value of the gateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link StParkingName }
     *     
     */
    public void setGateName(StParkingName value) {
        this.gateName = value;
    }

    /**
     * Gets the value of the parkingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParkingNumber() {
        return parkingNumber;
    }

    /**
     * Sets the value of the parkingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParkingNumber(BigInteger value) {
        this.parkingNumber = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link StParkingSuffix }
     *     
     */
    public StParkingSuffix getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link StParkingSuffix }
     *     
     */
    public void setSuffix(StParkingSuffix value) {
        this.suffix = value;
    }

}
