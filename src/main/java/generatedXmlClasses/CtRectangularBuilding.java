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


/**
 * <p>Java class for ctRectangularBuilding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctRectangularBuilding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="roofType" type="{}stRoofType" />
 *       &lt;attribute name="sizeX" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="sizeZ" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="sizeBottomY" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexBottomX" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexBottomZ" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="sizeWindowY" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexWindowX" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexWindowY" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexWindowZ" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="sizeTopY" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexTopX" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexTopZ" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexRoofX" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexRoofZ" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="sizeRoofY" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexRoofY" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="gableTexture" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexGableY" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexGableZ" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="faceTexture" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexFaceX" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="textureIndexFaceY" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctRectangularBuilding")
public class CtRectangularBuilding {

    @XmlAttribute(name = "roofType")
    protected StRoofType roofType;
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
    @XmlAttribute(name = "textureIndexBottomZ")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexBottomZ;
    @XmlAttribute(name = "sizeWindowY")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sizeWindowY;
    @XmlAttribute(name = "textureIndexWindowX")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexWindowX;
    @XmlAttribute(name = "textureIndexWindowY")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexWindowY;
    @XmlAttribute(name = "textureIndexWindowZ")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexWindowZ;
    @XmlAttribute(name = "sizeTopY")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sizeTopY;
    @XmlAttribute(name = "textureIndexTopX")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexTopX;
    @XmlAttribute(name = "textureIndexTopZ")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexTopZ;
    @XmlAttribute(name = "textureIndexRoofX")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexRoofX;
    @XmlAttribute(name = "textureIndexRoofZ")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexRoofZ;
    @XmlAttribute(name = "sizeRoofY")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sizeRoofY;
    @XmlAttribute(name = "textureIndexRoofY")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexRoofY;
    @XmlAttribute(name = "gableTexture")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger gableTexture;
    @XmlAttribute(name = "textureIndexGableY")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexGableY;
    @XmlAttribute(name = "textureIndexGableZ")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexGableZ;
    @XmlAttribute(name = "faceTexture")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger faceTexture;
    @XmlAttribute(name = "textureIndexFaceX")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexFaceX;
    @XmlAttribute(name = "textureIndexFaceY")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger textureIndexFaceY;

    /**
     * Gets the value of the roofType property.
     * 
     * @return
     *     possible object is
     *     {@link StRoofType }
     *     
     */
    public StRoofType getRoofType() {
        return roofType;
    }

    /**
     * Sets the value of the roofType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StRoofType }
     *     
     */
    public void setRoofType(StRoofType value) {
        this.roofType = value;
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
     * Gets the value of the textureIndexBottomZ property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextureIndexBottomZ() {
        return textureIndexBottomZ;
    }

    /**
     * Sets the value of the textureIndexBottomZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextureIndexBottomZ(BigInteger value) {
        this.textureIndexBottomZ = value;
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
     * Gets the value of the textureIndexWindowZ property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextureIndexWindowZ() {
        return textureIndexWindowZ;
    }

    /**
     * Sets the value of the textureIndexWindowZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextureIndexWindowZ(BigInteger value) {
        this.textureIndexWindowZ = value;
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
     * Gets the value of the textureIndexTopZ property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextureIndexTopZ() {
        return textureIndexTopZ;
    }

    /**
     * Sets the value of the textureIndexTopZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextureIndexTopZ(BigInteger value) {
        this.textureIndexTopZ = value;
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
     * Gets the value of the gableTexture property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGableTexture() {
        return gableTexture;
    }

    /**
     * Sets the value of the gableTexture property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGableTexture(BigInteger value) {
        this.gableTexture = value;
    }

    /**
     * Gets the value of the textureIndexGableY property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextureIndexGableY() {
        return textureIndexGableY;
    }

    /**
     * Sets the value of the textureIndexGableY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextureIndexGableY(BigInteger value) {
        this.textureIndexGableY = value;
    }

    /**
     * Gets the value of the textureIndexGableZ property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextureIndexGableZ() {
        return textureIndexGableZ;
    }

    /**
     * Sets the value of the textureIndexGableZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextureIndexGableZ(BigInteger value) {
        this.textureIndexGableZ = value;
    }

    /**
     * Gets the value of the faceTexture property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFaceTexture() {
        return faceTexture;
    }

    /**
     * Sets the value of the faceTexture property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFaceTexture(BigInteger value) {
        this.faceTexture = value;
    }

    /**
     * Gets the value of the textureIndexFaceX property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextureIndexFaceX() {
        return textureIndexFaceX;
    }

    /**
     * Sets the value of the textureIndexFaceX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextureIndexFaceX(BigInteger value) {
        this.textureIndexFaceX = value;
    }

    /**
     * Gets the value of the textureIndexFaceY property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTextureIndexFaceY() {
        return textureIndexFaceY;
    }

    /**
     * Sets the value of the textureIndexFaceY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTextureIndexFaceY(BigInteger value) {
        this.textureIndexFaceY = value;
    }

}