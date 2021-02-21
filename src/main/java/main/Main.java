package main;

import java.io.FileNotFoundException;
import javax.xml.bind.JAXBException;
import xmlClasses.FSData;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FSData fsd = FSData.load("LSZF_original.xml");
			System.out.println(fsd.getVersion());

			FSData.write(fsd, "LSZF_rewritten.xml");

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
