package xmlClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "FSData")
@XmlType
public class FSData {
	private String version;
	private List<SceneryObject> sceneryObjects;
	private List<Airport> airports;

	
	
	
	public String getVersion() {
		return version;
	}

	@XmlAttribute
	public void setVersion(String version) {
		this.version = version;
	}

	public List<SceneryObject> getSceneryObjects() {
		return sceneryObjects;
	}

	@XmlElement(name="SceneryObject")
	public void setSceneryObjects(List<SceneryObject> sceneryObjects) {
		this.sceneryObjects = sceneryObjects;
	}

	public List<Airport> getAirports() {
		return airports;
	}

	@XmlElement(name="Airport")
	public void setAirports(List<Airport> airports) {
		this.airports = airports;
	}

	public static FSData load(String filename) throws JAXBException, FileNotFoundException {
		JAXBContext context = JAXBContext.newInstance(FSData.class);

		return (FSData) context.createUnmarshaller().unmarshal(new FileReader("LSZF_original.xml"));

	}
	
	public static void write(FSData data, String filename) throws JAXBException {

		JAXBContext context = JAXBContext.newInstance(FSData.class);
	    Marshaller mar= context.createMarshaller();
	    mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	    mar.marshal(data, new File("LSZF_rewritten.xml"));
		
	}

	
	
}
