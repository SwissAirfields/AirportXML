package xmlClasses;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class LibraryObject {
	private String name;
	private float scale;

	public String getName() {
		return name;
	}

	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}

	public float getScale() {
		return scale;
	}

	@XmlAttribute
	public void setScale(float scale) {
		this.scale = scale;
	}

}
