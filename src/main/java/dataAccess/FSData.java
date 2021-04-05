package dataAccess;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import generatedXmlClasses.CtAirport;
import generatedXmlClasses.CtFSData;
import generatedXmlClasses.ObjectFactory;

public class FSData extends DataAccessBase<CtFSData> {
	private List<Airport> airports = new ArrayList<>();

	public List<Airport> getAirports() {
		return airports;
	}


	public FSData(final CtFSData element) {
		super(element);

		for (JAXBElement<?> je : element.getGrpFSDataChildren()) {
			if (je.getValue() instanceof CtAirport) {
				airports.add(new Airport((CtAirport)je.getValue()));
			}
		}
	}


	public static void write(FSData data, String filename) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(CtFSData.class);
		Marshaller mar = context.createMarshaller();
		mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		ObjectFactory factory = new ObjectFactory();
		JAXBElement<CtFSData> je = factory.createFSData(data.getElement());
		mar.marshal(je, new File(filename));
	}

	public static FSData load(final File file) throws JAXBException, FileNotFoundException {
		JAXBContext context = JAXBContext.newInstance(CtFSData.class);
		@SuppressWarnings("unchecked")
		JAXBElement<CtFSData> data = (JAXBElement<CtFSData>) context.createUnmarshaller()
				.unmarshal(new FileReader(file));

		if (!data.getValue().getVersion().equals("9.0")) {
			throw new RuntimeException(
					"Wrong schema version of input file: " + data.getValue().getVersion() + " instead of 9.0");
		}

		FSData result = new FSData(data.getValue());

		return result;
	}

}
