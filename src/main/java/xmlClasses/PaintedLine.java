package xmlClasses;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class PaintedLine {
	private Integer parentGroupID;
	private Integer groupIndex;
	private String type;
	private String trueAngle;
	private String surface;
	private List<Vertex> vertices;

	public Integer getGroupIndex() {
		return groupIndex;
	}

	@XmlAttribute
	public void setGroupIndex(Integer groupIndex) {
		this.groupIndex = groupIndex;
	}

	public Integer getParentGroupID() {
		return parentGroupID;
	}

	@XmlAttribute
	public void setParentGroupID(Integer parentGroupID) {
		this.parentGroupID = parentGroupID;
	}

	public String getType() {
		return type;
	}

	@XmlAttribute
	public void setType(String type) {
		this.type = type;
	}

	public String getTrueAngle() {
		return trueAngle;
	}

	@XmlAttribute
	public void setTrueAngle(String trueAngle) {
		this.trueAngle = trueAngle;
	}

	public String getSurface() {
		return surface;
	}

	@XmlAttribute
	public void setSurface(String surface) {
		this.surface = surface;
	}

	public List<Vertex> getVertices() {
		return vertices;
	}

	@XmlElement(name = "Vertex")
	public void setVertices(List<Vertex> vertices) {
		this.vertices = vertices;
	}

}

//<PaintedLine groupIndex="507" type="EDGE_LINE_SOLID" trueAngle="NONE" surface="{B1049C2A-A3F3-41A8-AC42-91FB47CFD4D8}">