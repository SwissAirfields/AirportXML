package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import xmlClasses.FSData;
import xmlClasses.PaintedLine;
import xmlClasses.TaxiwayItem;
import xmlClasses.TaxiwayPath;
import xmlClasses.Vertex;

public class Algorithms {

	public static void TaxiwayLinesToPaintedLines(FSData fsd) {

		// create copy of TaxiwayPath-List
		List<TaxiwayPath> remainingPaths = new LinkedList<>();
		remainingPaths.addAll(fsd.getAirports().get(0).getTaxiwayPaths());
		
		// create list of sections
		List<TaxiwaySection> sections = new ArrayList<>();
		for (;remainingPaths.size() > 0;) {
			sections.add(TaxiwaySection.extract(remainingPaths));
		}
		
		for (TaxiwaySection s: sections) {
			createLineFromSection(fsd, s);
		}
		
	}
	
	private static void createLineFromSection(FSData fsd, final TaxiwaySection section) {
		PaintedLine newLine = new PaintedLine();
		newLine.setParentGroupID(7);
		newLine.setSurface("{AD55D2BC-BAE5-4708-8D33-42A0945E88BB}");
		newLine.setTrueAngle("NONE");
		newLine.setType("DEFAULT");

		List<Vertex> vertices = new ArrayList<>();
		
		for(TaxiwayItem point: section.getItems()) {
			Vertex v = new Vertex();
			v.setLat(point.getLat());
			v.setLon(point.getLon());
			vertices.add(v);
		}
		
		
		newLine.setVertices(vertices);
		fsd.getAirports().get(0).getPaintedLines().add(newLine);
	}
	
}
