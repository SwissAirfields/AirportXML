package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

	public static void TaxiwayLinesToPaintedLines(Airport airport) {

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

		for (TaxiwaySection s : sections) {
			createLineFromSection(airport, s);
		}

	}

	private static void createLineFromSection(Airport airport, final TaxiwaySection section) {
		PaintedLine newLine = airport.newPaintedLine();
		// newLine.getElement().setParentGroupID(7);;
		newLine.getElement().setSurface("{AD55D2BC-BAE5-4708-8D33-42A0945E88BB}");
		newLine.getElement().setTrueAngle(StPaintedLineTrueAngle.NONE);
		newLine.getElement().setType(StPaintedLineType.DEFAULT);

		newLine.getElement().getVertex();

		for (TaxiwayItem<?> item : section.getItems()) {
			CtVertexLL v = new CtVertexLL();
			if (item instanceof TaxiwayPoint) {
				v.setLat(((TaxiwayPoint)item).getElement().getLat());
				v.setLon(((TaxiwayPoint)item).getElement().getLon());
			} else if (item instanceof TaxiwayParking) {
				v.setLat(((TaxiwayParking)item).getElement().getLat());
				v.setLon(((TaxiwayParking)item).getElement().getLon());
			}
			
			newLine.getElement().getVertex().add(v);
		}
	}

}
