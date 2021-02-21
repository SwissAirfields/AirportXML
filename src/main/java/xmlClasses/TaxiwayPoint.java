package xmlClasses;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class TaxiwayPoint extends TaxiwayItem {
	private String type;
	private String orientation;


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


}

//		<TaxiwayPoint parentGroupID="1" index="358" type="NORMAL" orientation="FORWARD" lat="47.44169673698183" lon="8.22941340044164"/>
