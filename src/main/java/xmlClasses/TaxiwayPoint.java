package xmlClasses;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class TaxiwayPoint {
	private Integer parentGroupID;
	private Integer groupIndex;
	private String index;
	private String type;
	private String orientation;
	private double lat;
	private double lon;

	public Integer getParentGroupID() {
		return parentGroupID;
	}

	@XmlAttribute
	public void setParentGroupID(Integer parentGroupID) {
		this.parentGroupID = parentGroupID;
	}

	public Integer getGroupIndex() {
		return groupIndex;
	}

	@XmlAttribute
	public void setGroupIndex(Integer groupIndex) {
		this.groupIndex = groupIndex;
	}

	public String getIndex() {
		return index;
	}

	@XmlID
	@XmlAttribute
	public void setIndex(String index) {
		this.index = index;
	}

	public String getType() {
		return type;
	}

	@XmlAttribute
	public void setType(String type) {
		this.type = type;
	}

	public String getOrientation() {
		return orientation;
	}

	@XmlAttribute
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

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

}

//		<TaxiwayPoint parentGroupID="1" index="358" type="NORMAL" orientation="FORWARD" lat="47.44169673698183" lon="8.22941340044164"/>
