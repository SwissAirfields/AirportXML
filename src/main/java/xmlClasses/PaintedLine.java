package xmlClasses;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;




@XmlType
public class PaintedLine {
	private Integer parentGroupID;
	private Integer groupIndex;
	private PaintedLineType type;
	private PaintedLineTrueAngle trueAngle;
	private String surface;
	private List<Vertex> vertices;

	public enum PaintedLineType {
	    DEFAULT,
	    HOLD_SHORT_FORWARD,
	    HOLD_SHORT_BACKWARD,
	    EDGE_LINE_DASHED,
	    EDGE_LINE_SOLID,
	    EDGE_SERVICE_DASHED, 
	    EDGE_SERVICE_SOLID,
	    HOLD_SHORT_TAXIWAY,
	    ILS_HOLD_SHORT,
	    SERVICE_DASHED,
	    DEFAULT_LIGHTED,
	    HOLD_SHORT_FORWARD_LIGHTED,
	    HOLD_SHORT_BACKWARD_LIGHTED,
	    EDGE_LINE_DASHED_LIGHTED,
	    EDGE_LINE_SOLID_LIGHTED,
	    EDGE_SERVICE_DASHED_LIGHTED, 
	    EDGE_SERVICE_SOLID_LIGHTED,
	    HOLD_SHORT_TAXIWAY_LIGHTED,
	    ILS_HOLD_SHORT_LIGHTED,
	    SERVICE_DASHED_LIGHTED,
	    WIDE_YELLOW,
	    WIDE_YELLOW_LIGHTED,
	    NON_MOVEMENT,
	    NON_MOVEMENT_LIGHTED,
	    ENHANCED_CENTER,
	    ENHANCED_CENTER_LIGHTED,
	    WIDE_WHITE,
	    WIDE_WHITE_LIGHTED,
	    NON_MOVEMENT_BACK,
	    NON_MOVEMENT_BACK_LIGHTED,
	    EDGE_SOLID_ORTHO,
	    EDGE_SOLID_ORTHO_LIGHTED,
	    EDGE_SOLID_ORTHO_BACK,
	    EDGE_SOLID_ORTHO_BACK_LIGHT,
	    WIDE_RED,
	    WIDE_RED_LIGHTED,
	    SLIM_RED,
	    SLIM_RED_LIGHTED,
	    HOLD_SHORT_FORWARD_MARKED,
	    HOLD_SHORT_BACKWARD_MARKED,
	    HOLD_SHORT_FORWARD_MARKED_L,
	    HOLD_SHORT_BACKWARD_MARKED_L
	}

	public enum PaintedLineTrueAngle {
	    NONE, BEGIN, END, BOTH_ENDS, ALL_POINTS 
	}

	
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

	public PaintedLineType getType() {
		return type;
	}

	@XmlAttribute
	public void setType(PaintedLineType type) {
		this.type = type;
	}

	public PaintedLineTrueAngle getTrueAngle() {
		return trueAngle;
	}

	@XmlAttribute
	public void setTrueAngle(PaintedLineTrueAngle trueAngle) {
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