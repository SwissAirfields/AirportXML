package dataAccess;


import generatedXmlClasses.CtTaxiwayPath;

public class TaxiwayPath extends DataAccessBase<CtTaxiwayPath> {
	private final TaxiwayItem<?> start;
	private final TaxiwayItem<?> end;

	public TaxiwayPath(final CtTaxiwayPath element, final TaxiwayItem<?> start, final TaxiwayItem<?> end) {
		super(element);
		this.start = start;
		this.end = end;
	}

	public TaxiwayItem<?> getOtherEnd(final TaxiwayItem<?> thisEnd) {
		TaxiwayItem<?> result = null;

		if (thisEnd == start) {
			result = end;
		} else if (thisEnd == end) {
			result = start;
		}

		return result;
	}

	public TaxiwayItem<?> getStart() {
		return start;
	}

	public TaxiwayItem<?> getEnd() {
		return end;
	}

	@Override
	public String toString() {
		return "TaxiwayPath start=" + getStart().getIndex() + " end=" + getEnd().getIndex();
	}

}

//<TaxiwayPath groupIndex="292" type="TAXI" surface="{B008C78F-E00D-4776-9AFB-3842E7C0D02F}" 
//centerLine="TRUE" start="148" end="147" width="7.800000" weightLimit="0" name="0" drawSurface="FALSE" 
//drawDetail="TRUE" groundMerging="TRUE" excludeVegetationAround="TRUE" excludeVegetationInside="TRUE"/>
