//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.10 at 05:00:27 PM CEST 
//


package generatedXmlClasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctExtrusionBridge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctExtrusionBridge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AltitudeSampleLocationList" type="{}ctAltitudeSampleLocationList"/>
 *         &lt;element name="PolylinePointList" type="{}ctPolylinePointList"/>
 *         &lt;element name="PolylineObjectPlacementList" type="{}ctPolylineObjectPlacementList" minOccurs="0"/>
 *         &lt;element name="BankShearList" type="{}ctBankShearList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="probability" type="{}stNonNegativeDouble" />
 *       &lt;attribute name="suppressPlatform" type="{}stBool" />
 *       &lt;attribute name="instanceId" type="{}stGuid" />
 *       &lt;attribute name="imageComplexity" type="{}stComplexity" />
 *       &lt;attribute name="roadWidth" type="{}stNonNegativeDouble" />
 *       &lt;attribute name="extrusionProfile" type="{}stGuid" />
 *       &lt;attribute name="materialSet" type="{}stGuid" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctExtrusionBridge", propOrder = {
    "altitudeSampleLocationList",
    "polylinePointList",
    "polylineObjectPlacementList",
    "bankShearList"
})
public class CtExtrusionBridge {

    @XmlElement(name = "AltitudeSampleLocationList", required = true)
    protected CtAltitudeSampleLocationList altitudeSampleLocationList;
    @XmlElement(name = "PolylinePointList", required = true)
    protected CtPolylinePointList polylinePointList;
    @XmlElement(name = "PolylineObjectPlacementList")
    protected CtPolylineObjectPlacementList polylineObjectPlacementList;
    @XmlElement(name = "BankShearList")
    protected CtBankShearList bankShearList;
    @XmlAttribute(name = "probability")
    protected Double probability;
    @XmlAttribute(name = "suppressPlatform")
    protected StBool suppressPlatform;
    @XmlAttribute(name = "instanceId")
    protected String instanceId;
    @XmlAttribute(name = "imageComplexity")
    protected StComplexity imageComplexity;
    @XmlAttribute(name = "roadWidth")
    protected Double roadWidth;
    @XmlAttribute(name = "extrusionProfile")
    protected String extrusionProfile;
    @XmlAttribute(name = "materialSet")
    protected String materialSet;

    /**
     * Gets the value of the altitudeSampleLocationList property.
     * 
     * @return
     *     possible object is
     *     {@link CtAltitudeSampleLocationList }
     *     
     */
    public CtAltitudeSampleLocationList getAltitudeSampleLocationList() {
        return altitudeSampleLocationList;
    }

    /**
     * Sets the value of the altitudeSampleLocationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAltitudeSampleLocationList }
     *     
     */
    public void setAltitudeSampleLocationList(CtAltitudeSampleLocationList value) {
        this.altitudeSampleLocationList = value;
    }

    /**
     * Gets the value of the polylinePointList property.
     * 
     * @return
     *     possible object is
     *     {@link CtPolylinePointList }
     *     
     */
    public CtPolylinePointList getPolylinePointList() {
        return polylinePointList;
    }

    /**
     * Sets the value of the polylinePointList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtPolylinePointList }
     *     
     */
    public void setPolylinePointList(CtPolylinePointList value) {
        this.polylinePointList = value;
    }

    /**
     * Gets the value of the polylineObjectPlacementList property.
     * 
     * @return
     *     possible object is
     *     {@link CtPolylineObjectPlacementList }
     *     
     */
    public CtPolylineObjectPlacementList getPolylineObjectPlacementList() {
        return polylineObjectPlacementList;
    }

    /**
     * Sets the value of the polylineObjectPlacementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtPolylineObjectPlacementList }
     *     
     */
    public void setPolylineObjectPlacementList(CtPolylineObjectPlacementList value) {
        this.polylineObjectPlacementList = value;
    }

    /**
     * Gets the value of the bankShearList property.
     * 
     * @return
     *     possible object is
     *     {@link CtBankShearList }
     *     
     */
    public CtBankShearList getBankShearList() {
        return bankShearList;
    }

    /**
     * Sets the value of the bankShearList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBankShearList }
     *     
     */
    public void setBankShearList(CtBankShearList value) {
        this.bankShearList = value;
    }

    /**
     * Gets the value of the probability property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProbability() {
        return probability;
    }

    /**
     * Sets the value of the probability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProbability(Double value) {
        this.probability = value;
    }

    /**
     * Gets the value of the suppressPlatform property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getSuppressPlatform() {
        return suppressPlatform;
    }

    /**
     * Sets the value of the suppressPlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setSuppressPlatform(StBool value) {
        this.suppressPlatform = value;
    }

    /**
     * Gets the value of the instanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Sets the value of the instanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    /**
     * Gets the value of the imageComplexity property.
     * 
     * @return
     *     possible object is
     *     {@link StComplexity }
     *     
     */
    public StComplexity getImageComplexity() {
        return imageComplexity;
    }

    /**
     * Sets the value of the imageComplexity property.
     * 
     * @param value
     *     allowed object is
     *     {@link StComplexity }
     *     
     */
    public void setImageComplexity(StComplexity value) {
        this.imageComplexity = value;
    }

    /**
     * Gets the value of the roadWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRoadWidth() {
        return roadWidth;
    }

    /**
     * Sets the value of the roadWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRoadWidth(Double value) {
        this.roadWidth = value;
    }

    /**
     * Gets the value of the extrusionProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrusionProfile() {
        return extrusionProfile;
    }

    /**
     * Sets the value of the extrusionProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrusionProfile(String value) {
        this.extrusionProfile = value;
    }

    /**
     * Gets the value of the materialSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialSet() {
        return materialSet;
    }

    /**
     * Sets the value of the materialSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialSet(String value) {
        this.materialSet = value;
    }

}
