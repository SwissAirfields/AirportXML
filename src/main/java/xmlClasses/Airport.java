package xmlClasses;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class Airport {
	private String region;
	private String country;
	private String state;
	private String city;
	private String name;
	private String ident;
	private double lat;
	private double lon;
	private double alt;
	private float magvar;
	private float trafficScalar;
	private double airportTestRadius;
	private String applyFlatten;
	private String isOnTIN;
	private List<AirportGroup> airportGroups;
	private List<TaxiwayPoint> taxiwayPoints;
	private List<TaxiwayPath> taxiwayPaths;
	private List<TaxiwayParking> taxiwayParkings;
	private List<PaintedLine> paintedLines;


	public void createReferences() {
		for (TaxiwayPath p : taxiwayPaths) {
			p.getStart().addConnectedPath(p);
			p.getEnd().addConnectedPath(p);
		}
	}
	
	
	public String getRegion() {
		return region;
	}

	@XmlAttribute
	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	@XmlAttribute
	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	@XmlAttribute
	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	@XmlAttribute
	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}

	public String getIdent() {
		return ident;
	}

	@XmlAttribute
	public void setIdent(String ident) {
		this.ident = ident;
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

	public double getAlt() {
		return alt;
	}

	@XmlAttribute
	public void setAlt(double alt) {
		this.alt = alt;
	}

	public float getMagvar() {
		return magvar;
	}

	@XmlAttribute
	public void setMagvar(float magvar) {
		this.magvar = magvar;
	}

	public float getTrafficScalar() {
		return trafficScalar;
	}

	@XmlAttribute
	public void setTrafficScalar(float trafficScalar) {
		this.trafficScalar = trafficScalar;
	}

	public double getAirportTestRadius() {
		return airportTestRadius;
	}

	@XmlAttribute
	public void setAirportTestRadius(double airportTestRadius) {
		this.airportTestRadius = airportTestRadius;
	}

	public String getApplyFlatten() {
		return applyFlatten;
	}

	@XmlAttribute
	public void setApplyFlatten(String applyFlatten) {
		this.applyFlatten = applyFlatten;
	}

	public String getIsOnTIN() {
		return isOnTIN;
	}

	@XmlAttribute
	public void setIsOnTIN(String isOnTIN) {
		this.isOnTIN = isOnTIN;
	}

	public List<AirportGroup> getAirportGroups() {
		return airportGroups;
	}

	@XmlElement(name = "AirportGroup")
	public void setAirportGroups(List<AirportGroup> airportGroups) {
		this.airportGroups = airportGroups;
	}

	
	
	public List<TaxiwayPoint> getTaxiwayPoints() {
		return taxiwayPoints;
	}

	@XmlElement(name = "TaxiwayPoint")
	public void setTaxiwayPoints(List<TaxiwayPoint> taxiwayPoints) {
		this.taxiwayPoints = taxiwayPoints;
	}

	
	
	public List<TaxiwayPath> getTaxiwayPaths() {
		return taxiwayPaths;
	}

	@XmlElement(name = "TaxiwayPath")
	public void setTaxiwayPaths(List<TaxiwayPath> taxiwayPaths) {
		this.taxiwayPaths = taxiwayPaths;
	}

	public List<PaintedLine> getPaintedLines() {
		return paintedLines;
	}

	@XmlElementWrapper(name = "PaintedElements")
	@XmlElement(name = "PaintedLine")
	public void setPaintedLines(List<PaintedLine> paintedLines) {
		this.paintedLines = paintedLines;
	}

	public List<TaxiwayParking> getTaxiwayParkings() {
		return taxiwayParkings;
	}

	@XmlElement(name = "TaxiwayParking")
	public void setTaxiwayParkings(List<TaxiwayParking> taxiwayParkings) {
		this.taxiwayParkings = taxiwayParkings;
	}

	
	
}


