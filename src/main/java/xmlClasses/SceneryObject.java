package xmlClasses;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlType
public class SceneryObject {
	private double lat;
	private double lon;
	private double alt;
	private float pitch;
	private float bank;
	private float heading;
	private String imageComplexity;
	private String altitudeIsAgl;
	private String snapToGround;
	private String snapToNormal;
	private LibraryObject libraryObject;

	public double getLat() {
		return lat;
	}

	@XmlAttribute
	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	@XmlAttribute
	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getAlt() {
		return alt;
	}

	@XmlAttribute
	public void setAlt(double alt) {
		this.alt = alt;
	}

	public float getPitch() {
		return pitch;
	}

	@XmlAttribute
	public void setPitch(float pitch) {
		this.pitch = pitch;
	}

	public float getBank() {
		return bank;
	}

	@XmlAttribute
	public void setBank(float bank) {
		this.bank = bank;
	}

	public float getHeading() {
		return heading;
	}

	@XmlAttribute
	public void setHeading(float heading) {
		this.heading = heading;
	}

	public String getImageComplexity() {
		return imageComplexity;
	}

	@XmlAttribute
	public void setImageComplexity(String imageComplexity) {
		this.imageComplexity = imageComplexity;
	}

	public String isAltitudeIsAgl() {
		return altitudeIsAgl;
	}

	@XmlAttribute
	public void setAltitudeIsAgl(String altitudeIsAgl) {
		this.altitudeIsAgl = altitudeIsAgl;
	}

	public String isSnapToGround() {
		return snapToGround;
	}

	@XmlAttribute
	public void setSnapToGround(String snapToGround) {
		this.snapToGround = snapToGround;
	}

	public String isSnapToNormal() {
		return snapToNormal;
	}

	@XmlAttribute
	public void setSnapToNormal(String snapToNormal) {
		this.snapToNormal = snapToNormal;
	}

	public LibraryObject getLibraryObject() {
		return libraryObject;
	}

	@XmlElement(name="LibraryObject")
	public void setLibraryObject(LibraryObject libraryObject) {
		this.libraryObject = libraryObject;
	}

}

//<SceneryObject lat="47.44357988985393" lon="8.22766742955271" alt="0.00000000000000" pitch="0.001926" bank="-0.001960" heading="85.561425" imageComplexity="VERY_SPARSE" altitudeIsAgl="TRUE" snapToGround="TRUE" snapToNormal="FALSE">
//<LibraryObject name="{65B40360-EADB-4927-82CB-A5AF526F5377}" scale="0.550000"/>
//</SceneryObject>
