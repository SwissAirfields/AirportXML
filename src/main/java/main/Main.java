package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import algorithms.TaxiwayToPaintedLines;
import dataAccess.Airport;
import dataAccess.FSData;
import generatedXmlClasses.CtAirport;
import generatedXmlClasses.CtFSData;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FSData fsd = FSData.load(new File("LSZF_original2.xml"));
			System.out.println(fsd.getElement().getVersion());
			TaxiwayToPaintedLines.TaxiwayLinesToPaintedLines(fsd.getAirports().get(0));
			
			FSData.write(fsd, "LSZF_rewritten2.xml");

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		try {
//			CtFSData fsd = load("LSZF_original2.xml");
//			System.out.println(fsd.getVersion());
//			// Algorithms.TaxiwayLinesToPaintedLines(fsd);
//			write(fsd, "LSZF_rewritten3.xml");
//			
//
//		} catch (JAXBException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

//	public static CtFSData load(String filename) throws JAXBException, FileNotFoundException {
//		JAXBContext context = JAXBContext.newInstance(CtFSData.class);
//		JAXBElement<CtFSData> root = (JAXBElement<CtFSData>) context.createUnmarshaller()
//				.unmarshal(new FileReader(filename));
//		CtFSData result = root.getValue();
//
//		if (!result.getVersion().equals("9.0")) {
//			throw new RuntimeException(
//					"Wrong schema version of input file: " + result.getVersion() + " instead of 9.0");
//		}
////		for (CtAirport a: result.getAirport()) {
////			a.createReferences();
////		}
//		return result;
//
//	}
//
//	public static void write(CtFSData data, String filename) throws JAXBException {
//		JAXBElement<CtFSData> root = new JAXBElement<CtFSData>(new QName("FSData"), (Class<CtFSData>) data.getClass(),
//				data);
//
//		JAXBContext context = JAXBContext.newInstance(CtFSData.class);
//		Marshaller mar = context.createMarshaller();
//		mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//		mar.marshal(root, new File(filename));
//
//	}

}
