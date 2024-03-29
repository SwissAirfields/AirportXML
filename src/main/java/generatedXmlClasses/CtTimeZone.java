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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ctTimeZone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctTimeZone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="latitudeMinimum" use="required" type="{}stLatitude" />
 *       &lt;attribute name="latitudeMaximum" use="required" type="{}stLatitude" />
 *       &lt;attribute name="longitudeMinimum" use="required" type="{}stLongitude" />
 *       &lt;attribute name="longitudeMaximum" use="required" type="{}stLongitude" />
 *       &lt;attribute name="timedeviation" use="required" type="{}stTimeShift1" />
 *       &lt;attribute name="priority" use="required" type="{}stTimeZomePriority" />
 *       &lt;attribute name="daylightSavings" type="{}stDaylightSavings" />
 *       &lt;attribute name="daylightSavingsTimeShift" type="{}stTimeShift2" />
 *       &lt;attribute name="daylightSavingsStartDayOfYearBase" type="{}stDayOfYear" />
 *       &lt;attribute name="daylightSavingsStartDayOfWeek" type="{}stDayOfWeek" />
 *       &lt;attribute name="daylightSavingsEndDayOfYearBase" type="{}stDayOfYear" />
 *       &lt;attribute name="daylightSavingsEndDayOfWeek" type="{}stDayOfWeek" />
 *       &lt;attribute name="dstStartMonth" type="{}stDstStartMonth" />
 *       &lt;attribute name="dstStartDayOfTheWeek" type="{}stDstStartDayOfTheWeek" />
 *       &lt;attribute name="dstStartDayOfTheMonth" type="{}stDstStartDayOfTheMonth" />
 *       &lt;attribute name="dstStartRule" type="{}stDstStartRule" />
 *       &lt;attribute name="dstEndMonth" type="{}stDstEndMonth" />
 *       &lt;attribute name="dstEndDayOfTheWeek" type="{}stDstEndDayOfTheWeek" />
 *       &lt;attribute name="dstEndDayOfTheMonth" type="{}stDstEndDayOfTheMonth" />
 *       &lt;attribute name="dstEndRule" type="{}stDstEndRule" />
 *       &lt;attribute name="sIANATimeZoneID" type="{}stIANATimeZoneID" />
 *       &lt;attribute name="dstTimeDiffDuringDST" type="{}stdstTimeDiffDuringDST" />
 *       &lt;attribute name="dstTimeDiffOutsideDST" type="{}stdstTimeDiffOutsideDST" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctTimeZone")
public class CtTimeZone {

    @XmlAttribute(name = "latitudeMinimum", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Double latitudeMinimum;
    @XmlAttribute(name = "latitudeMaximum", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Double latitudeMaximum;
    @XmlAttribute(name = "longitudeMinimum", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double longitudeMinimum;
    @XmlAttribute(name = "longitudeMaximum", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double longitudeMaximum;
    @XmlAttribute(name = "timedeviation", required = true)
    protected double timedeviation;
    @XmlAttribute(name = "priority", required = true)
    protected double priority;
    @XmlAttribute(name = "daylightSavings")
    protected StDaylightSavings daylightSavings;
    @XmlAttribute(name = "daylightSavingsTimeShift")
    protected Integer daylightSavingsTimeShift;
    @XmlAttribute(name = "daylightSavingsStartDayOfYearBase")
    protected Integer daylightSavingsStartDayOfYearBase;
    @XmlAttribute(name = "daylightSavingsStartDayOfWeek")
    protected StDayOfWeek daylightSavingsStartDayOfWeek;
    @XmlAttribute(name = "daylightSavingsEndDayOfYearBase")
    protected Integer daylightSavingsEndDayOfYearBase;
    @XmlAttribute(name = "daylightSavingsEndDayOfWeek")
    protected StDayOfWeek daylightSavingsEndDayOfWeek;
    @XmlAttribute(name = "dstStartMonth")
    protected Double dstStartMonth;
    @XmlAttribute(name = "dstStartDayOfTheWeek")
    protected Double dstStartDayOfTheWeek;
    @XmlAttribute(name = "dstStartDayOfTheMonth")
    protected Double dstStartDayOfTheMonth;
    @XmlAttribute(name = "dstStartRule")
    protected StDstStartRule dstStartRule;
    @XmlAttribute(name = "dstEndMonth")
    protected Double dstEndMonth;
    @XmlAttribute(name = "dstEndDayOfTheWeek")
    protected Double dstEndDayOfTheWeek;
    @XmlAttribute(name = "dstEndDayOfTheMonth")
    protected Double dstEndDayOfTheMonth;
    @XmlAttribute(name = "dstEndRule")
    protected StDstEndRule dstEndRule;
    @XmlAttribute(name = "sIANATimeZoneID")
    protected String sianaTimeZoneID;
    @XmlAttribute(name = "dstTimeDiffDuringDST")
    protected Double dstTimeDiffDuringDST;
    @XmlAttribute(name = "dstTimeDiffOutsideDST")
    protected Double dstTimeDiffOutsideDST;

    /**
     * Gets the value of the latitudeMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getLatitudeMinimum() {
        return latitudeMinimum;
    }

    /**
     * Sets the value of the latitudeMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudeMinimum(Double value) {
        this.latitudeMinimum = value;
    }

    /**
     * Gets the value of the latitudeMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getLatitudeMaximum() {
        return latitudeMaximum;
    }

    /**
     * Sets the value of the latitudeMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudeMaximum(Double value) {
        this.latitudeMaximum = value;
    }

    /**
     * Gets the value of the longitudeMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getLongitudeMinimum() {
        return longitudeMinimum;
    }

    /**
     * Sets the value of the longitudeMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudeMinimum(Double value) {
        this.longitudeMinimum = value;
    }

    /**
     * Gets the value of the longitudeMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getLongitudeMaximum() {
        return longitudeMaximum;
    }

    /**
     * Sets the value of the longitudeMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudeMaximum(Double value) {
        this.longitudeMaximum = value;
    }

    /**
     * Gets the value of the timedeviation property.
     * 
     */
    public double getTimedeviation() {
        return timedeviation;
    }

    /**
     * Sets the value of the timedeviation property.
     * 
     */
    public void setTimedeviation(double value) {
        this.timedeviation = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public double getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(double value) {
        this.priority = value;
    }

    /**
     * Gets the value of the daylightSavings property.
     * 
     * @return
     *     possible object is
     *     {@link StDaylightSavings }
     *     
     */
    public StDaylightSavings getDaylightSavings() {
        return daylightSavings;
    }

    /**
     * Sets the value of the daylightSavings property.
     * 
     * @param value
     *     allowed object is
     *     {@link StDaylightSavings }
     *     
     */
    public void setDaylightSavings(StDaylightSavings value) {
        this.daylightSavings = value;
    }

    /**
     * Gets the value of the daylightSavingsTimeShift property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaylightSavingsTimeShift() {
        return daylightSavingsTimeShift;
    }

    /**
     * Sets the value of the daylightSavingsTimeShift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaylightSavingsTimeShift(Integer value) {
        this.daylightSavingsTimeShift = value;
    }

    /**
     * Gets the value of the daylightSavingsStartDayOfYearBase property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaylightSavingsStartDayOfYearBase() {
        return daylightSavingsStartDayOfYearBase;
    }

    /**
     * Sets the value of the daylightSavingsStartDayOfYearBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaylightSavingsStartDayOfYearBase(Integer value) {
        this.daylightSavingsStartDayOfYearBase = value;
    }

    /**
     * Gets the value of the daylightSavingsStartDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link StDayOfWeek }
     *     
     */
    public StDayOfWeek getDaylightSavingsStartDayOfWeek() {
        return daylightSavingsStartDayOfWeek;
    }

    /**
     * Sets the value of the daylightSavingsStartDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link StDayOfWeek }
     *     
     */
    public void setDaylightSavingsStartDayOfWeek(StDayOfWeek value) {
        this.daylightSavingsStartDayOfWeek = value;
    }

    /**
     * Gets the value of the daylightSavingsEndDayOfYearBase property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaylightSavingsEndDayOfYearBase() {
        return daylightSavingsEndDayOfYearBase;
    }

    /**
     * Sets the value of the daylightSavingsEndDayOfYearBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaylightSavingsEndDayOfYearBase(Integer value) {
        this.daylightSavingsEndDayOfYearBase = value;
    }

    /**
     * Gets the value of the daylightSavingsEndDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link StDayOfWeek }
     *     
     */
    public StDayOfWeek getDaylightSavingsEndDayOfWeek() {
        return daylightSavingsEndDayOfWeek;
    }

    /**
     * Sets the value of the daylightSavingsEndDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link StDayOfWeek }
     *     
     */
    public void setDaylightSavingsEndDayOfWeek(StDayOfWeek value) {
        this.daylightSavingsEndDayOfWeek = value;
    }

    /**
     * Gets the value of the dstStartMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDstStartMonth() {
        return dstStartMonth;
    }

    /**
     * Sets the value of the dstStartMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDstStartMonth(Double value) {
        this.dstStartMonth = value;
    }

    /**
     * Gets the value of the dstStartDayOfTheWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDstStartDayOfTheWeek() {
        return dstStartDayOfTheWeek;
    }

    /**
     * Sets the value of the dstStartDayOfTheWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDstStartDayOfTheWeek(Double value) {
        this.dstStartDayOfTheWeek = value;
    }

    /**
     * Gets the value of the dstStartDayOfTheMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDstStartDayOfTheMonth() {
        return dstStartDayOfTheMonth;
    }

    /**
     * Sets the value of the dstStartDayOfTheMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDstStartDayOfTheMonth(Double value) {
        this.dstStartDayOfTheMonth = value;
    }

    /**
     * Gets the value of the dstStartRule property.
     * 
     * @return
     *     possible object is
     *     {@link StDstStartRule }
     *     
     */
    public StDstStartRule getDstStartRule() {
        return dstStartRule;
    }

    /**
     * Sets the value of the dstStartRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link StDstStartRule }
     *     
     */
    public void setDstStartRule(StDstStartRule value) {
        this.dstStartRule = value;
    }

    /**
     * Gets the value of the dstEndMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDstEndMonth() {
        return dstEndMonth;
    }

    /**
     * Sets the value of the dstEndMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDstEndMonth(Double value) {
        this.dstEndMonth = value;
    }

    /**
     * Gets the value of the dstEndDayOfTheWeek property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDstEndDayOfTheWeek() {
        return dstEndDayOfTheWeek;
    }

    /**
     * Sets the value of the dstEndDayOfTheWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDstEndDayOfTheWeek(Double value) {
        this.dstEndDayOfTheWeek = value;
    }

    /**
     * Gets the value of the dstEndDayOfTheMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDstEndDayOfTheMonth() {
        return dstEndDayOfTheMonth;
    }

    /**
     * Sets the value of the dstEndDayOfTheMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDstEndDayOfTheMonth(Double value) {
        this.dstEndDayOfTheMonth = value;
    }

    /**
     * Gets the value of the dstEndRule property.
     * 
     * @return
     *     possible object is
     *     {@link StDstEndRule }
     *     
     */
    public StDstEndRule getDstEndRule() {
        return dstEndRule;
    }

    /**
     * Sets the value of the dstEndRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link StDstEndRule }
     *     
     */
    public void setDstEndRule(StDstEndRule value) {
        this.dstEndRule = value;
    }

    /**
     * Gets the value of the sianaTimeZoneID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIANATimeZoneID() {
        return sianaTimeZoneID;
    }

    /**
     * Sets the value of the sianaTimeZoneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIANATimeZoneID(String value) {
        this.sianaTimeZoneID = value;
    }

    /**
     * Gets the value of the dstTimeDiffDuringDST property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDstTimeDiffDuringDST() {
        return dstTimeDiffDuringDST;
    }

    /**
     * Sets the value of the dstTimeDiffDuringDST property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDstTimeDiffDuringDST(Double value) {
        this.dstTimeDiffDuringDST = value;
    }

    /**
     * Gets the value of the dstTimeDiffOutsideDST property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDstTimeDiffOutsideDST() {
        return dstTimeDiffOutsideDST;
    }

    /**
     * Sets the value of the dstTimeDiffOutsideDST property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDstTimeDiffOutsideDST(Double value) {
        this.dstTimeDiffOutsideDST = value;
    }

}
