//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.10 at 05:00:27 PM CEST 
//


package generatedXmlClasses;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctPolylinePointList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctPolylinePointList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolylinePoint" type="{}ctLatLonAlt" maxOccurs="65535" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctPolylinePointList", propOrder = {
    "polylinePoint"
})
public class CtPolylinePointList {

    @XmlElement(name = "PolylinePoint", required = true)
    protected List<CtLatLonAlt> polylinePoint;

    /**
     * Gets the value of the polylinePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polylinePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolylinePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtLatLonAlt }
     * 
     * 
     */
    public List<CtLatLonAlt> getPolylinePoint() {
        if (polylinePoint == null) {
            polylinePoint = new ArrayList<CtLatLonAlt>();
        }
        return this.polylinePoint;
    }

}
