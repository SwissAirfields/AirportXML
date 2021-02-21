package xmlClasses;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class AirportGroup {
	private String displayName;
	private int groupID;
	private int groupIndex;

	public String getDisplayName() {
		return displayName;
	}

	@XmlAttribute
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public int getGroupID() {
		return groupID;
	}

	@XmlAttribute
	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public int getGroupIndex() {
		return groupIndex;
	}

	@XmlAttribute
	public void setGroupIndex(int groupIndex) {
		this.groupIndex = groupIndex;
	}

}

