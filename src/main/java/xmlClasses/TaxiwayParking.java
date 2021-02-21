package xmlClasses;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class TaxiwayParking extends TaxiwayItem {
	private String type;
	private float heading;
	private float radius;
	private String name;
	private int number;
	private String suffix;
	private String pushBack;
	private String numberMarking;
	private float numberBiasX;
	private float numberBiasZ;
	private float numberHeading;

	public String getType() {
		return type;
	}

	@XmlAttribute
	public void setType(String type) {
		this.type = type;
	}

	public float getHeading() {
		return heading;
	}

	@XmlAttribute
	public void setHeading(float heading) {
		this.heading = heading;
	}

	public float getRadius() {
		return radius;
	}

	@XmlAttribute
	public void setRadius(float radius) {
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	@XmlAttribute
	public void setNumber(int number) {
		this.number = number;
	}

	public String getSuffix() {
		return suffix;
	}

	@XmlAttribute
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getPushBack() {
		return pushBack;
	}

	@XmlAttribute
	public void setPushBack(String pushBack) {
		this.pushBack = pushBack;
	}

	public String getNumberMarking() {
		return numberMarking;
	}

	@XmlAttribute
	public void setNumberMarking(String numberMarking) {
		this.numberMarking = numberMarking;
	}

	public float getNumberBiasX() {
		return numberBiasX;
	}

	@XmlAttribute
	public void setNumberBiasX(float numberBiasX) {
		this.numberBiasX = numberBiasX;
	}

	public float getNumberBiasZ() {
		return numberBiasZ;
	}

	@XmlAttribute
	public void setNumberBiasZ(float numberBiasZ) {
		this.numberBiasZ = numberBiasZ;
	}

	public float getNumberHeading() {
		return numberHeading;
	}

	@XmlAttribute
	public void setNumberHeading(float numberHeading) {
		this.numberHeading = numberHeading;
	}

}
