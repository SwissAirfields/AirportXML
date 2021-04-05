package dataAccess;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.bind.JAXBElement;

import generatedXmlClasses.CtAirport;
import generatedXmlClasses.CtPaintedElements;
import generatedXmlClasses.CtPaintedLine;
import generatedXmlClasses.CtTaxiwayParking;
import generatedXmlClasses.CtTaxiwayPath;
import generatedXmlClasses.CtTaxiwayPoint;
import generatedXmlClasses.ObjectFactory;

public class Airport extends DataAccessBase<CtAirport> {
	private List<TaxiwayPath> taxiwayPaths;
	private Map<BigInteger, TaxiwayItem<?>> taxiwayItems;
	private CtPaintedElements paintedElements;
	
	@SuppressWarnings("unchecked")
	public Airport(final CtAirport element) {
		super(element);

		taxiwayItems = new TreeMap<>();

		// create index of taxiway items
		for (JAXBElement<?> je : element.getGrpAirportChildren()) {
			if (je.getValue() instanceof CtTaxiwayPoint) {
				taxiwayItems.put(((JAXBElement<CtTaxiwayPoint>) je).getValue().getIndex(),
						new TaxiwayPoint((CtTaxiwayPoint) je.getValue()));
			} else if (je.getValue() instanceof CtTaxiwayParking) {
				taxiwayItems.put(((JAXBElement<CtTaxiwayParking>) je).getValue().getIndex(),
						new TaxiwayParking((CtTaxiwayParking) je.getValue()));
			} else if (je.getValue() instanceof CtPaintedElements) {
				paintedElements = (CtPaintedElements) je.getValue();
			}
		}

		taxiwayPaths = new ArrayList<>();
		
		// create list of taxiway paths and references
		for (JAXBElement<?> je : element.getGrpAirportChildren()) {
			if (je.getValue() instanceof CtTaxiwayPath) {
				CtTaxiwayPath ctTaxiwayPath = (CtTaxiwayPath) je.getValue();
				TaxiwayPath taxiwayPath = new TaxiwayPath((CtTaxiwayPath) je.getValue(),
						taxiwayItems.get(ctTaxiwayPath.getStart()), taxiwayItems.get(ctTaxiwayPath.getEnd()));

				taxiwayPaths.add(taxiwayPath);
				taxiwayPath.getStart().addConnectedPath(taxiwayPath);
				taxiwayPath.getEnd().addConnectedPath(taxiwayPath);
			}
		}

		// create painted elements node if not found
		if (paintedElements == null) {
			ObjectFactory factory = new ObjectFactory();
			JAXBElement<CtPaintedElements> je = factory.createCtAirportPaintedElements(new CtPaintedElements());
			paintedElements = (CtPaintedElements)je.getValue();

			element.getGrpAirportChildren().add(je);
		}
		
	}

	public List<TaxiwayPath> getTaxiwayPaths() {
		return taxiwayPaths;
	}

	public PaintedLine newPaintedLine() {
		CtPaintedLine ctPaintedLine = new CtPaintedLine();
		paintedElements.getPaintedLine().add(ctPaintedLine);
		PaintedLine result = new PaintedLine(ctPaintedLine);
		return result;
	}

}
