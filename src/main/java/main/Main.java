package main;

import java.io.FileNotFoundException;
import javax.xml.bind.JAXBException;
import xmlClasses.FSData;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FSData fsd = FSData.load("LSZF_original2.xml");
			System.out.println(fsd.getVersion());
			Algorithms.TaxiwayLinesToPaintedLines(fsd);
			
			FSData.write(fsd, "LSZF_rewritten2.xml");

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
