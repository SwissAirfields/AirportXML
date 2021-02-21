package xmlClasses;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class TaxiwayPath {
	private Integer parentGroupID;
	private Integer groupIndex;
	private String type;
	private String surface;
	private String centerLine;
	private TaxiwayItem start;
	private TaxiwayItem end;
	private float width;
	private int weightLimit;
	private int name;
	private String drawSurface;
	private String drawDetail;
	private String groundMerging;
	private String excludeVegetationAround;
	private String excludeVegetationInside;

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

	public String getType() {
		return type;
	}

	@XmlAttribute
	public void setType(String type) {
		this.type = type;
	}

	public String getSurface() {
		return surface;
	}

	@XmlAttribute
	public void setSurface(String surface) {
		this.surface = surface;
	}

	public String getCenterLine() {
		return centerLine;
	}

	@XmlAttribute
	public void setCenterLine(String centerLine) {
		this.centerLine = centerLine;
	}

	public TaxiwayItem getStart() {
		return start;
	}

	@XmlIDREF
	@XmlAttribute
	public void setStart(TaxiwayItem start) {
		this.start = start;
	}

	public TaxiwayItem getEnd() {
		return end;
	}

	@XmlIDREF
	@XmlAttribute
	public void setEnd(TaxiwayItem end) {
		this.end = end;
	}

	public float getWidth() {
		return width;
	}

	@XmlAttribute
	public void setWidth(float width) {
		this.width = width;
	}

	public int getWeightLimit() {
		return weightLimit;
	}

	@XmlAttribute
	public void setWeightLimit(int weightLimit) {
		this.weightLimit = weightLimit;
	}

	public int getName() {
		return name;
	}

	@XmlAttribute
	public void setName(int name) {
		this.name = name;
	}

	public String getDrawSurface() {
		return drawSurface;
	}

	@XmlAttribute
	public void setDrawSurface(String drawSurface) {
		this.drawSurface = drawSurface;
	}

	public String getDrawDetail() {
		return drawDetail;
	}

	@XmlAttribute
	public void setDrawDetail(String drawDetail) {
		this.drawDetail = drawDetail;
	}

	public String getGroundMerging() {
		return groundMerging;
	}

	@XmlAttribute
	public void setGroundMerging(String groundMerging) {
		this.groundMerging = groundMerging;
	}

	public String getExcludeVegetationAround() {
		return excludeVegetationAround;
	}

	@XmlAttribute
	public void setExcludeVegetationAround(String excludeVegetationAround) {
		this.excludeVegetationAround = excludeVegetationAround;
	}

	public String getExcludeVegetationInside() {
		return excludeVegetationInside;
	}

	@XmlAttribute
	public void setExcludeVegetationInside(String excludeVegetationInside) {
		this.excludeVegetationInside = excludeVegetationInside;
	}

}

//<TaxiwayPath groupIndex="292" type="TAXI" surface="{B008C78F-E00D-4776-9AFB-3842E7C0D02F}" 
//centerLine="TRUE" start="148" end="147" width="7.800000" weightLimit="0" name="0" drawSurface="FALSE" 
//drawDetail="TRUE" groundMerging="TRUE" excludeVegetationAround="TRUE" excludeVegetationInside="TRUE"/>
