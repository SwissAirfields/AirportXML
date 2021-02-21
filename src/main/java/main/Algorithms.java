package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import xmlClasses.FSData;
import xmlClasses.TaxiwayPath;

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
		
		
		
	}
}
