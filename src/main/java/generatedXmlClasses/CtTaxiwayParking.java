//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.05 at 10:27:20 PM CEST 
//


package generatedXmlClasses;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ctTaxiwayParking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctTaxiwayParking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentGroupID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="groupIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="lat" type="{}stLatitude" />
 *       &lt;attribute name="lon" type="{}stLongitude" />
 *       &lt;attribute name="biasX" type="{}stLatitude" />
 *       &lt;attribute name="biasZ" type="{}stLongitude" />
 *       &lt;attribute name="heading" use="required" type="{}stHeading" />
 *       &lt;attribute name="radius" use="required" type="{}stDistance" />
 *       &lt;attribute name="type" use="required" type="{}stParkingType" />
 *       &lt;attribute name="name" use="required" type="{}stParkingName" />
 *       &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="suffix" type="{}stParkingSuffix" />
 *       &lt;attribute name="pushBack" use="required" type="{}stParkingPushback" />
 *       &lt;attribute name="teeOffset1" type="{}stTeeOffset" />
 *       &lt;attribute name="teeOffset2" type="{}stTeeOffset" />
 *       &lt;attribute name="teeOffset3" type="{}stTeeOffset" />
 *       &lt;attribute name="teeOffset4" type="{}stTeeOffset" />
 *       &lt;attribute name="airlineCodes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="manufacturerNames" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numberMarking" type="{}stBool" />
 *       &lt;attribute name="numberBiasX" type="{}stDistance" />
 *       &lt;attribute name="numberBiasZ" type="{}stDistance" />
 *       &lt;attribute name="numberHeading" type="{}stHeading" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctTaxiwayParking")
public class CtTaxiwayParking {

    @XmlAttribute(name = "displayName")
    protected String displayName;
    @XmlAttribute(name = "parentGroupID")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parentGroupID;
    @XmlAttribute(name = "groupIndex")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger groupIndex;
    @XmlAttribute(name = "index", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger index;
    @XmlAttribute(name = "lat")
    protected String lat;
    @XmlAttribute(name = "lon")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Double lon;
    @XmlAttribute(name = "biasX")
    protected String biasX;
    @XmlAttribute(name = "biasZ")
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Double biasZ;
    @XmlAttribute(name = "heading", required = true)
    protected double heading;
    @XmlAttribute(name = "radius", required = true)
    protected String radius;
    @XmlAttribute(name = "type", required = true)
    protected StParkingType type;
    @XmlAttribute(name = "name", required = true)
    protected StParkingName name;
    @XmlAttribute(name = "number", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger number;
    @XmlAttribute(name = "suffix")
    protected StParkingSuffix suffix;
    @XmlAttribute(name = "pushBack", required = true)
    protected StParkingPushback pushBack;
    @XmlAttribute(name = "teeOffset1")
    protected Double teeOffset1;
    @XmlAttribute(name = "teeOffset2")
    protected Double teeOffset2;
    @XmlAttribute(name = "teeOffset3")
    protected Double teeOffset3;
    @XmlAttribute(name = "teeOffset4")
    protected Double teeOffset4;
    @XmlAttribute(name = "airlineCodes")
    protected String airlineCodes;
    @XmlAttribute(name = "manufacturerNames")
    protected String manufacturerNames;
    @XmlAttribute(name = "numberMarking")
    protected StBool numberMarking;
    @XmlAttribute(name = "numberBiasX")
    protected String numberBiasX;
    @XmlAttribute(name = "numberBiasZ")
    protected String numberBiasZ;
    @XmlAttribute(name = "numberHeading")
    protected Double numberHeading;

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
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndex(BigInteger value) {
        this.index = value;
    }

    /**
     * Gets the value of the lat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLat(String value) {
        this.lat = value;
    }

    /**
     * Gets the value of the lon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getLon() {
        return lon;
    }

    /**
     * Sets the value of the lon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLon(Double value) {
        this.lon = value;
    }

    /**
     * Gets the value of the biasX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiasX() {
        return biasX;
    }

    /**
     * Sets the value of the biasX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiasX(String value) {
        this.biasX = value;
    }

    /**
     * Gets the value of the biasZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getBiasZ() {
        return biasZ;
    }

    /**
     * Sets the value of the biasZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiasZ(Double value) {
        this.biasZ = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     */
    public double getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     */
    public void setHeading(double value) {
        this.heading = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadius(String value) {
        this.radius = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link StParkingType }
     *     
     */
    public StParkingType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link StParkingType }
     *     
     */
    public void setType(StParkingType value) {
        this.type = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link StParkingName }
     *     
     */
    public StParkingName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link StParkingName }
     *     
     */
    public void setName(StParkingName value) {
        this.name = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
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

    /**
     * Gets the value of the pushBack property.
     * 
     * @return
     *     possible object is
     *     {@link StParkingPushback }
     *     
     */
    public StParkingPushback getPushBack() {
        return pushBack;
    }

    /**
     * Sets the value of the pushBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link StParkingPushback }
     *     
     */
    public void setPushBack(StParkingPushback value) {
        this.pushBack = value;
    }

    /**
     * Gets the value of the teeOffset1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTeeOffset1() {
        return teeOffset1;
    }

    /**
     * Sets the value of the teeOffset1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTeeOffset1(Double value) {
        this.teeOffset1 = value;
    }

    /**
     * Gets the value of the teeOffset2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTeeOffset2() {
        return teeOffset2;
    }

    /**
     * Sets the value of the teeOffset2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTeeOffset2(Double value) {
        this.teeOffset2 = value;
    }

    /**
     * Gets the value of the teeOffset3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTeeOffset3() {
        return teeOffset3;
    }

    /**
     * Sets the value of the teeOffset3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTeeOffset3(Double value) {
        this.teeOffset3 = value;
    }

    /**
     * Gets the value of the teeOffset4 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTeeOffset4() {
        return teeOffset4;
    }

    /**
     * Sets the value of the teeOffset4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTeeOffset4(Double value) {
        this.teeOffset4 = value;
    }

    /**
     * Gets the value of the airlineCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCodes() {
        return airlineCodes;
    }

    /**
     * Sets the value of the airlineCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCodes(String value) {
        this.airlineCodes = value;
    }

    /**
     * Gets the value of the manufacturerNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerNames() {
        return manufacturerNames;
    }

    /**
     * Sets the value of the manufacturerNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerNames(String value) {
        this.manufacturerNames = value;
    }

    /**
     * Gets the value of the numberMarking property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getNumberMarking() {
        return numberMarking;
    }

    /**
     * Sets the value of the numberMarking property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setNumberMarking(StBool value) {
        this.numberMarking = value;
    }

    /**
     * Gets the value of the numberBiasX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberBiasX() {
        return numberBiasX;
    }

    /**
     * Sets the value of the numberBiasX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberBiasX(String value) {
        this.numberBiasX = value;
    }

    /**
     * Gets the value of the numberBiasZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberBiasZ() {
        return numberBiasZ;
    }

    /**
     * Sets the value of the numberBiasZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberBiasZ(String value) {
        this.numberBiasZ = value;
    }

    /**
     * Gets the value of the numberHeading property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNumberHeading() {
        return numberHeading;
    }

    /**
     * Sets the value of the numberHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNumberHeading(Double value) {
        this.numberHeading = value;
    }

}