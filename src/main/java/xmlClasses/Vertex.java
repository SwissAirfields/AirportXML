package xmlClasses;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class Vertex {
	private double lat;
	private double lon;

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
