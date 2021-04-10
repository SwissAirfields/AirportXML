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
 * <p>Java class for ctApron complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctApron">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Coloration" type="{}ctColoration" minOccurs="0"/>
 *         &lt;element name="Vertex" type="{}ctVertexLL" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentGroupID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="groupIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="surface" type="{}stSurface" />
 *       &lt;attribute name="drawSurface" type="{}stBool" />
 *       &lt;attribute name="drawDetail" type="{}stBool" />
 *       &lt;attribute name="localUV" type="{}stBool" />
 *       &lt;attribute name="stretchUV" type="{}stBool" />
 *       &lt;attribute name="isRectangle" type="{}stBool" />
 *       &lt;attribute name="priority" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="tiling" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="heading" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="falloff" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="opacity" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "ctApron", propOrder = {
    "coloration",
    "vertex"
})
public class CtApron {

    @XmlElement(name = "Coloration")
    protected CtColoration coloration;
    @XmlElement(name = "Vertex")
    protected List<CtVertexLL> vertex;
    @XmlAttribute(name = "displayName")
    protected String displayName;
    @XmlAttribute(name = "parentGroupID")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger parentGroupID;
    @XmlAttribute(name = "groupIndex")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger groupIndex;
    @XmlAttribute(name = "surface")
    protected String surface;
    @XmlAttribute(name = "drawSurface")
    protected StBool drawSurface;
    @XmlAttribute(name = "drawDetail")
    protected StBool drawDetail;
    @XmlAttribute(name = "localUV")
    protected StBool localUV;
    @XmlAttribute(name = "stretchUV")
    protected StBool stretchUV;
    @XmlAttribute(name = "isRectangle")
    protected StBool isRectangle;
    @XmlAttribute(name = "priority")
    protected BigInteger priority;
    @XmlAttribute(name = "tiling")
    protected Double tiling;
    @XmlAttribute(name = "heading")
    protected Double heading;
    @XmlAttribute(name = "falloff")
    protected Double falloff;
    @XmlAttribute(name = "opacity")
    protected BigInteger opacity;
    @XmlAttribute(name = "groundMerging")
    protected StBool groundMerging;
    @XmlAttribute(name = "excludeVegetationAround")
    protected StBool excludeVegetationAround;
    @XmlAttribute(name = "excludeVegetationInside")
    protected StBool excludeVegetationInside;

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
     * Gets the value of the vertex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vertex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVertex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtVertexLL }
     * 
     * 
     */
    public List<CtVertexLL> getVertex() {
        if (vertex == null) {
            vertex = new ArrayList<CtVertexLL>();
        }
        return this.vertex;
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
     * Gets the value of the localUV property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getLocalUV() {
        return localUV;
    }

    /**
     * Sets the value of the localUV property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setLocalUV(StBool value) {
        this.localUV = value;
    }

    /**
     * Gets the value of the stretchUV property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getStretchUV() {
        return stretchUV;
    }

    /**
     * Sets the value of the stretchUV property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setStretchUV(StBool value) {
        this.stretchUV = value;
    }

    /**
     * Gets the value of the isRectangle property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getIsRectangle() {
        return isRectangle;
    }

    /**
     * Sets the value of the isRectangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setIsRectangle(StBool value) {
        this.isRectangle = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the tiling property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTiling() {
        return tiling;
    }

    /**
     * Sets the value of the tiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTiling(Double value) {
        this.tiling = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeading(Double value) {
        this.heading = value;
    }

    /**
     * Gets the value of the falloff property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFalloff() {
        return falloff;
    }

    /**
     * Sets the value of the falloff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFalloff(Double value) {
        this.falloff = value;
    }

    /**
     * Gets the value of the opacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpacity() {
        return opacity;
    }

    /**
     * Sets the value of the opacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpacity(BigInteger value) {
        this.opacity = value;
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
