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
 * <p>Java class for ctMultiSidedBuilding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctMultiSidedBuilding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="buildingSides" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="smoothing" type="{}stBool" />
 *       &lt;attribute name="sizeX" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="sizeZ" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="sizeBottomY" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexBottomX" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="sizeWindowY" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexWindowX" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexWindowY" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="sizeTopY" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexTopX" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="sizeRoofY" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexRoofX" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexRoofY" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexRoofZ" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctMultiSidedBuilding")
public class CtMultiSidedBuilding {

    @XmlAttribute(name = "buildingSides")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger buildingSides;
    @XmlAttribute(name = "smoothing")
    protected StBool smoothing;
    @XmlAttribute(name = "sizeX")
    protected Double sizeX;
    @XmlAttribute(name = "sizeZ")
    protected Double sizeZ;
    @XmlAttribute(name = "sizeBottomY")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sizeBottomY;
    @XmlAttribute(name = "textureIndexBottomX")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexBottomX;
    @XmlAttribute(name = "sizeWindowY")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sizeWindowY;
    @XmlAttribute(name = "textureIndexWindowX")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexWindowX;
    @XmlAttribute(name = "textureIndexWindowY")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexWindowY;
    @XmlAttribute(name = "sizeTopY")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sizeTopY;
    @XmlAttribute(name = "textureIndexTopX")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexTopX;
    @XmlAttribute(name = "sizeRoofY")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sizeRoofY;
    @XmlAttribute(name = "textureIndexRoofX")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexRoofX;
    @XmlAttribute(name = "textureIndexRoofY")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexRoofY;
    @XmlAttribute(name = "textureIndexRoofZ")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexRoofZ;

    /**
     * Gets the value of the buildingSides property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBuildingSides() {
        return buildingSides;
    }

    /**
     * Sets the value of the buildingSides property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBuildingSides(BigInteger value) {
        this.buildingSides = value;
    }

    /**
     * Gets the value of the smoothing property.
     * 
     * @return
     *     possible object is
     *     {@link StBool }
     *     
     */
    public StBool getSmoothing() {
        return smoothing;
    }

    /**
     * Sets the value of the smoothing property.
     * 
     * @param value
     *     allowed object is
     *     {@link StBool }
     *     
     */
    public void setSmoothing(StBool value) {
        this.smoothing = value;
    }

    /**
     * Gets the value of the sizeX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSizeX() {
        return sizeX;
    }

    /**
     * Sets the value of the sizeX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSizeX(Double value) {
        this.sizeX = value;
    }

    /**
     * Gets the value of the sizeZ property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSizeZ() {
        return sizeZ;
    }

    /**
     * Sets the value of the sizeZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSizeZ(Double value) {
        this.sizeZ = value;
    }

    /**
     * Gets the value of the sizeBottomY property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSizeBottomY() {
        return sizeBottomY;
    }

    /**
     * Sets the value of the sizeBottomY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSizeBottomY(BigInteger value) {
        this.sizeBottomY = value;
    }

    /**
     * Gets the value of the textureIndexBottomX property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextureIndexBottomX() {
        return textureIndexBottomX;
    }

    /**
     * Sets the value of the textureIndexBottomX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextureIndexBottomX(BigInteger value) {
        this.textureIndexBottomX = value;
    }

    /**
     * Gets the value of the sizeWindowY property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSizeWindowY() {
        return sizeWindowY;
    }

    /**
     * Sets the value of the sizeWindowY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSizeWindowY(BigInteger value) {
        this.sizeWindowY = value;
    }

    /**
     * Gets the value of the textureIndexWindowX property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextureIndexWindowX() {
        return textureIndexWindowX;
    }

    /**
     * Sets the value of the textureIndexWindowX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextureIndexWindowX(BigInteger value) {
        this.textureIndexWindowX = value;
    }

    /**
     * Gets the value of the textureIndexWindowY property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextureIndexWindowY() {
        return textureIndexWindowY;
    }

    /**
     * Sets the value of the textureIndexWindowY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextureIndexWindowY(BigInteger value) {
        this.textureIndexWindowY = value;
    }

    /**
     * Gets the value of the sizeTopY property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSizeTopY() {
        return sizeTopY;
    }

    /**
     * Sets the value of the sizeTopY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSizeTopY(BigInteger value) {
        this.sizeTopY = value;
    }

    /**
     * Gets the value of the textureIndexTopX property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextureIndexTopX() {
        return textureIndexTopX;
    }

    /**
     * Sets the value of the textureIndexTopX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextureIndexTopX(BigInteger value) {
        this.textureIndexTopX = value;
    }

    /**
     * Gets the value of the sizeRoofY property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSizeRoofY() {
        return sizeRoofY;
    }

    /**
     * Sets the value of the sizeRoofY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSizeRoofY(BigInteger value) {
        this.sizeRoofY = value;
    }

    /**
     * Gets the value of the textureIndexRoofX property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextureIndexRoofX() {
        return textureIndexRoofX;
    }

    /**
     * Sets the value of the textureIndexRoofX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextureIndexRoofX(BigInteger value) {
        this.textureIndexRoofX = value;
    }

    /**
     * Gets the value of the textureIndexRoofY property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextureIndexRoofY() {
        return textureIndexRoofY;
    }

    /**
     * Sets the value of the textureIndexRoofY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextureIndexRoofY(BigInteger value) {
        this.textureIndexRoofY = value;
    }

    /**
     * Gets the value of the textureIndexRoofZ property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextureIndexRoofZ() {
        return textureIndexRoofZ;
    }

    /**
     * Sets the value of the textureIndexRoofZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextureIndexRoofZ(BigInteger value) {
        this.textureIndexRoofZ = value;
    }

}
