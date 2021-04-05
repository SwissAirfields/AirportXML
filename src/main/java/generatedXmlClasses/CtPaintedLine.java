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
 * <p>Java class for ctPaintedLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctPaintedLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vertex" type="{}ctVertexLL" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentGroupID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="groupIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="type" use="required" type="{}stPaintedLineType" />
 *       &lt;attribute name="trueAngle" type="{}stPaintedLineTrueAngle" />
 *       &lt;attribute name="surface" type="{}stSurface" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctPaintedLine", propOrder = {
    "vertex"
})
public class CtPaintedLine {

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
    @XmlAttribute(name = "type", required = true)
    protected StPaintedLineType type;
    @XmlAttribute(name = "trueAngle")
    protected StPaintedLineTrueAngle trueAngle;
    @XmlAttribute(name = "surface")
    protected String surface;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link StPaintedLineType }
     *     
     */
    public StPaintedLineType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link StPaintedLineType }
     *     
     */
    public void setType(StPaintedLineType value) {
        this.type = value;
    }

    /**
     * Gets the value of the trueAngle property.
     * 
     * @return
     *     possible object is
     *     {@link StPaintedLineTrueAngle }
     *     
     */
    public StPaintedLineTrueAngle getTrueAngle() {
        return trueAngle;
    }

    /**
     * Sets the value of the trueAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link StPaintedLineTrueAngle }
     *     
     */
    public void setTrueAngle(StPaintedLineTrueAngle value) {
        this.trueAngle = value;
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

}
