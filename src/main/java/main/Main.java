package main;

import java.io.File;
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBException;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

import algorithms.TaxiwayToPaintedLines;
import cli.Args;
import cli.CommandTaxiwayToPaintedLines;
import dataAccess.FSData;

public class Main {

	public static void main(String[] args) {
		Args myArgs = new Args();
		CommandTaxiwayToPaintedLines cTw2Pl = new CommandTaxiwayToPaintedLines();

		JCommander jc = JCommander.newBuilder().addObject(myArgs).addCommand("tw2pl", cTw2Pl).build();
		jc.setProgramName("AirportXML");

		try {
			jc.parse(args);
		} catch (ParameterException e) {
			jc.usage();
			System.exit(0);
		}

		try {
			FSData fsd = FSData.load(new File(myArgs.getInputFilename()));
			System.out.println("Successfully loaded file. Version=" + fsd.getElement().getVersion());

			if (jc.getParsedCommand() != null) {
				switch (jc.getParsedCommand().toLowerCase()) {
				case "tw2pl":
					TaxiwayToPaintedLines.processAirport(fsd.getAirports().get(0), cTw2Pl);
					break;
				case "default":

				}
			} else {
				System.out.println("no command specified");

			}

			System.out.println("Writing XML: " + myArgs.getOutputFilename());
			FSData.write(fsd, myArgs.getOutputFilename());
			System.out.println("Successfully written " + myArgs.getOutputFilename());

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
