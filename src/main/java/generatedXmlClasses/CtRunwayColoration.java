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
 * <p>Java class for ctRunwayColoration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctRunwayColoration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="red" use="required" type="{}stRatio" />
 *       &lt;attribute name="green" use="required" type="{}stRatio" />
 *       &lt;attribute name="blue" use="required" type="{}stRatio" />
 *       &lt;attribute name="alpha" use="required" type="{}stRatio" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctRunwayColoration")
public class CtRunwayColoration {

    @XmlAttribute(name = "red", required = true)
    protected double red;
    @XmlAttribute(name = "green", required = true)
    protected double green;
    @XmlAttribute(name = "blue", required = true)
    protected double blue;
    @XmlAttribute(name = "alpha", required = true)
    protected double alpha;

    /**
     * Gets the value of the red property.
     * 
     */
    public double getRed() {
        return red;
    }

    /**
     * Sets the value of the red property.
     * 
     */
    public void setRed(double value) {
        this.red = value;
    }

    /**
     * Gets the value of the green property.
     * 
     */
    public double getGreen() {
        return green;
    }

    /**
     * Sets the value of the green property.
     * 
     */
    public void setGreen(double value) {
        this.green = value;
    }

    /**
     * Gets the value of the blue property.
     * 
     */
    public double getBlue() {
        return blue;
    }

    /**
     * Sets the value of the blue property.
     * 
     */
    public void setBlue(double value) {
        this.blue = value;
    }

    /**
     * Gets the value of the alpha property.
     * 
     */
    public double getAlpha() {
        return alpha;
    }

    /**
     * Sets the value of the alpha property.
     * 
     */
    public void setAlpha(double value) {
        this.alpha = value;
    }

}