package xmlClasses;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;

public class TaxiwayItem {
	protected Integer parentGroupID;
	protected Integer groupIndex;
	protected String index;
	protected double lat;
	protected double lon;
	protected List<TaxiwayPath> connectedPaths = new ArrayList<>();

	public List<TaxiwayPath> getConnectedPaths() {
		return connectedPaths;
	}
	
	public void addConnectedPath(final TaxiwayPath path) {
		connectedPaths.add(path);
	}

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
