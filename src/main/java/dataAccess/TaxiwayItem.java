package dataAccess;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class TaxiwayItem<T> extends DataAccessBase<T> {
	protected final BigInteger index;
	protected List<TaxiwayPath> connectedPaths = new ArrayList<>();

	public TaxiwayItem(final T element, final BigInteger index) {
		super(element);
		this.index = index;
	}

	public List<TaxiwayPath> getConnectedPaths() {
		return connectedPaths;
	}

	public void addConnectedPath(final TaxiwayPath path) {
		connectedPaths.add(path);
	}

	public BigInteger getIndex() {
		return index;
	}

}
