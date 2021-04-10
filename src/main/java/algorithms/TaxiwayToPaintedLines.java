package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import cli.CommandTaxiwayToPaintedLines;
import dataAccess.Airport;
import dataAccess.PaintedLine;
import dataAccess.TaxiwayItem;
import dataAccess.TaxiwayParking;
import dataAccess.TaxiwayPath;
import dataAccess.TaxiwayPoint;
import generatedXmlClasses.CtVertexLL;
import generatedXmlClasses.StPaintedLineTrueAngle;
import generatedXmlClasses.StPaintedLineType;

public class TaxiwayToPaintedLines {

	public static void processAirport(Airport airport, final CommandTaxiwayToPaintedLines command) {

		// create copy of TaxiwayPath-List
		List<TaxiwayPath> remainingPaths = new LinkedList<>();
		remainingPaths.addAll(airport.getTaxiwayPaths());

		// create list of sections
		List<TaxiwaySection> sections = new ArrayList<>();
		for (; remainingPaths.size() > 0;) {
			TaxiwaySection s = TaxiwaySection.extract(remainingPaths);
			if (s != null) {
				sections.add(s);
			}
		}
		System.out.println("Extracted " + sections.size() + " line sections from taxiway objects");

		for (TaxiwaySection s : sections) {
			createLineFromSection(airport, s, command);
		}

	}

	private static void createLineFromSection(Airport airport, final TaxiwaySection section,
			final CommandTaxiwayToPaintedLines command) {
		PaintedLine newLine = airport.newPaintedLine();
		// newLine.getElement().setParentGroupID(7);;
		if (command.getMaterial() != null) {
			newLine.getElement().setSurface("{" + command.getMaterial() + "}");
		}
		newLine.getElement().setType(StPaintedLineType.fromValue(command.getLinetype()));

		newLine.getElement().setTrueAngle(StPaintedLineTrueAngle.NONE);
		newLine.getElement().getVertex();

		for (TaxiwayItem<?> item : section.getItems()) {
			CtVertexLL v = new CtVertexLL();
			if (item instanceof TaxiwayPoint) {
				v.setLat(((TaxiwayPoint) item).getElement().getLat());
				v.setLon(((TaxiwayPoint) item).getElement().getLon());
			} else if (item instanceof TaxiwayParking) {
				v.setLat(((TaxiwayParking) item).getElement().getLat());
				v.setLon(((TaxiwayParking) item).getElement().getLon());
			}

			newLine.getElement().getVertex().add(v);
		}

		// add middle point for lines with only 2 vertices
		if (command.getExtend()) {
			if (newLine.getElement().getVertex().size() == 2) {
				CtVertexLL v = new CtVertexLL();
				v.setLat((newLine.getElement().getVertex().get(0).getLat()
						+ newLine.getElement().getVertex().get(1).getLat()) / 2);
				v.setLon((newLine.getElement().getVertex().get(0).getLon()
						+ newLine.getElement().getVertex().get(1).getLon()) / 2);
				newLine.getElement().getVertex().add(1, v);
			}
		}
	}

}
