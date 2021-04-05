//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.05 at 10:27:20 PM CEST 
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
 * <p>Java class for ctTaxiwayPath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctTaxiwayPath">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Material" type="{}ctFacilityMaterial" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Coloration" type="{}ctColoration" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentGroupID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="groupIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="start" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="end" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="type" type="{}stTaxiwayPathType" />
 *       &lt;attribute name="surface" type="{}stSurface" />
 *       &lt;attribute name="drawSurface" type="{}stBool" />
 *       &lt;attribute name="drawDetail" type="{}stBool" />
 *       &lt;attribute name="width" type="{}stDistance" />
 *       &lt;attribute name="weightLimit" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="centerLine" type="{}stBool" />
 *       &lt;attribute name="centerLineLighted" type="{}stBool" />
 *       &lt;attribute name="leftEdgeLighted" type="{}stBool" />
 *       &lt;attribute name="rightEdgeLighted" type="{}stBool" />
 *       &lt;attribute name="leftEdge" type="{}stTaxiwayEdgeType" />
 *       &lt;attribute name="rightEdge" type="{}stTaxiwayEdgeType" />
 *       &lt;attribute name="number" type="{}stRunwayNumber" />
 *       &lt;attribute name="designator" type="{}stDesignator" />
 *       &lt;attribute name="enhanced" type="{}stBool" />
 *       &lt;attribute name="groundMerging" type="{}stBool" />
 *       &lt;attribute name="excludeVegetationAround" type="{}stBool" />
 *       &lt;attribute name="excludeVegetationInside" type="{}stBool" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctTaxiwayPath", propOrder = {
    "material",
    "coloration"
})
public class CtTaxiwayPath {

    @XmlElement(name = "Material")
    protected List<CtFacilityMaterial> material;
    @XmlElement(name = "Coloration")
    protected CtColoration coloration;
    @XmlAttribute(name = "displayName")
    protected String displayName;
    @XmlAttribute(name = "parentGroupID")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parentGroupID;
    @XmlAttribute(name = "groupIndex")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger groupIndex;
    @XmlAttribute(name = "start")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger start;
    @XmlAttribute(name = "end")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger end;
    @XmlAttribute(name = "type")
    protected StTaxiwayPathType type;
    @XmlAttribute(name = "surface")
    protected String surface;
    @XmlAttribute(name = "drawSurface")
    protected StBool drawSurface;
    @XmlAttribute(name = "drawDetail")
    protected StBool drawDetail;
    @XmlAttribute(name = "width")
    protected String width;
    @XmlAttribute(name = "weightLimit")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger weightLimit;
    @XmlAttribute(name = "name")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger name;
    @XmlAttribute(name = "centerLine")
    protected StBool centerLine;
    @XmlAttribute(name = "centerLineLighted")
    protected StBool centerLineLighted;
    @XmlAttribute(name = "leftEdgeLighted")
    protected StBool leftEdgeLighted;
    @XmlAttribute(name = "rightEdgeLighted")
    protected StBool rightEdgeLighted;
    @XmlAttribute(name = "leftEdge")
    protected StTaxiwayEdgeType leftEdge;
    @XmlAttribute(name = "rightEdge")
    protected StTaxiwayEdgeType rightEdge;
    @XmlAttribute(name = "number")
    protected String number;
    @XmlAttribute(name = "designator")
    protected StDesignator designator;
    @XmlAttribute(name = "enhanced")
    protected StBool enhanced;
    @XmlAttribute(name = "groundMerging")
    protected StBool groundMerging;
    @XmlAttribute(name = "excludeVegetationAround")
    protected StBool excludeVegetationAround;
    @XmlAttribute(name = "excludeVegetationInside")
    protected StBool excludeVegetationInside;

    /**
     * Gets the value of the material property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the material property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtFacilityMaterial }
     * 
     * 
     */
    public List<CtFacilityMaterial> getMaterial() {
        if (material == null) {
            material = new ArrayList<CtFacilityMaterial>();
        }
        return this.material;
    }

    /**
     * Gets the value of the coloration property.
     * 
     * @return
     *     possible object is
     *     {@link CtColoration }
     *     
     */
    public CtColoration getColoration() {
        return coloration;
    }

    /**
     * Sets the value of the coloration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtColoration }
     *     
     */
    public void setColoration(CtColoration value) {
        this.coloration = value;
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
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStart(BigInteger value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnd(BigInteger value) {
        this.end = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link StTaxiwayPathType }
     *     
     */
    public StTaxiwayPathType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link StTaxiwayPathType }
     *     
     */
    public void setType(StTaxiwayPathType value) {
        this.type = value;
    }

    /**
     * Gets the value of the surface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurface() {
        return surface;
    }

    /**
     * Sets the value of the surface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurface(String value) {
        this.surface = value;
    }

    /**
     * Gets the value of the drawSurface property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getDrawSurface() {
        return drawSurface;
    }

    /**
     * Sets the value of the drawSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setDrawSurface(StBool value) {
        this.drawSurface = value;
    }

    /**
     * Gets the value of the drawDetail property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getDrawDetail() {
        return drawDetail;
    }

    /**
     * Sets the value of the drawDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setDrawDetail(StBool value) {
        this.drawDetail = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the weightLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWeightLimit() {
        return weightLimit;
    }

    /**
     * Sets the value of the weightLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWeightLimit(BigInteger value) {
        this.weightLimit = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setName(BigInteger value) {
        this.name = value;
    }

    /**
     * Gets the value of the centerLine property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getCenterLine() {
        return centerLine;
    }

    /**
     * Sets the value of the centerLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setCenterLine(StBool value) {
        this.centerLine = value;
    }

    /**
     * Gets the value of the centerLineLighted property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getCenterLineLighted() {
        return centerLineLighted;
    }

    /**
     * Sets the value of the centerLineLighted property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setCenterLineLighted(StBool value) {
        this.centerLineLighted = value;
    }

    /**
     * Gets the value of the leftEdgeLighted property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getLeftEdgeLighted() {
        return leftEdgeLighted;
    }

    /**
     * Sets the value of the leftEdgeLighted property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setLeftEdgeLighted(StBool value) {
        this.leftEdgeLighted = value;
    }

    /**
     * Gets the value of the rightEdgeLighted property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getRightEdgeLighted() {
        return rightEdgeLighted;
    }

    /**
     * Sets the value of the rightEdgeLighted property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setRightEdgeLighted(StBool value) {
        this.rightEdgeLighted = value;
    }

    /**
     * Gets the value of the leftEdge property.
     * 
     * @return
     *     possible object is
     *     {@link StTaxiwayEdgeType }
     *     
     */
    public StTaxiwayEdgeType getLeftEdge() {
        return leftEdge;
    }

    /**
     * Sets the value of the leftEdge property.
     * 
     * @param value
     *     allowed object is
     *     {@link StTaxiwayEdgeType }
     *     
     */
    public void setLeftEdge(StTaxiwayEdgeType value) {
        this.leftEdge = value;
    }

    /**
     * Gets the value of the rightEdge property.
     * 
     * @return
     *     possible object is
     *     {@link StTaxiwayEdgeType }
     *     
     */
    public StTaxiwayEdgeType getRightEdge() {
        return rightEdge;
    }

    /**
     * Sets the value of the rightEdge property.
     * 
     * @param value
     *     allowed object is
     *     {@link StTaxiwayEdgeType }
     *     
     */
    public void setRightEdge(StTaxiwayEdgeType value) {
        this.rightEdge = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link StDesignator }
     *     
     */
    public StDesignator getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StDesignator }
     *     
     */
    public void setDesignator(StDesignator value) {
        this.designator = value;
    }

    /**
     * Gets the value of the enhanced property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getEnhanced() {
        return enhanced;
    }

    /**
     * Sets the value of the enhanced property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setEnhanced(StBool value) {
        this.enhanced = value;
    }

    /**
     * Gets the value of the groundMerging property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getGroundMerging() {
        return groundMerging;
    }

    /**
     * Sets the value of the groundMerging property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setGroundMerging(StBool value) {
        this.groundMerging = value;
    }

    /**
     * Gets the value of the excludeVegetationAround property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getExcludeVegetationAround() {
        return excludeVegetationAround;
    }

    /**
     * Sets the value of the excludeVegetationAround property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setExcludeVegetationAround(StBool value) {
        this.excludeVegetationAround = value;
    }

    /**
     * Gets the value of the excludeVegetationInside property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getExcludeVegetationInside() {
        return excludeVegetationInside;
    }

    /**
     * Sets the value of the excludeVegetationInside property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setExcludeVegetationInside(StBool value) {
        this.excludeVegetationInside = value;
    }

}
