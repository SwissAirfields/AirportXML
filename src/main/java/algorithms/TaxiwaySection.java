package algorithms;

import java.util.ArrayList;
import java.util.List;

import dataAccess.TaxiwayItem;
import dataAccess.TaxiwayPath;

public class TaxiwaySection {
	private List<TaxiwayPath> paths = new ArrayList<>();
	private List<TaxiwayItem<?>> items = new ArrayList<>();

	public static int getNumberOfPathsWithCenterline(final TaxiwayItem<?> point) {
		int result = 0;

		for (TaxiwayPath p : point.getConnectedPaths()) {
			if (p.getElement().getCenterLine().value().equals("TRUE")) {
				result++;
			}
		}

		return result;
	}

	public static TaxiwaySection extract(List<TaxiwayPath> list) {
		TaxiwaySection result = new TaxiwaySection();

		TaxiwayPath currentPath = list.get(0);

		// find section with centerline
		for (; !currentPath.getElement().getCenterLine().value().equals("TRUE");) {
			list.remove(currentPath);
			if (list.size() > 0) {
				currentPath = list.get(0);
			} else {
				return null;
			}
		}
		TaxiwayItem<?> currentPoint = currentPath.getStart();

		// find beginning of section (number of connected paths != 2)
		for (; getNumberOfPathsWithCenterline(currentPoint) == 2;) {

			// get path on other side of point
			for (TaxiwayPath p : currentPoint.getConnectedPaths()) {
				if ((p != currentPath) && (p.getElement().getCenterLine().value().equals("TRUE"))) {
					currentPath = p;
					break;
				}
			}

			// get point on other side of path
			currentPoint = currentPath.getOtherEnd(currentPoint);
		}

		result.items.add(currentPoint);

		// change direction
		currentPoint = currentPath.getOtherEnd(currentPoint);

		// process until end of section
		for (; getNumberOfPathsWithCenterline(currentPoint) == 2;) {
			list.remove(currentPath);
			result.paths.add(currentPath);
			result.items.add(currentPoint);

			// get path on other side of point
			for (TaxiwayPath p : currentPoint.getConnectedPaths()) {
				if ((p != currentPath) && (p.getElement().getCenterLine().value().equals("TRUE"))) {
					currentPath = p;
					break;
				}
			}

			// get point on other side of path
			currentPoint = currentPath.getOtherEnd(currentPoint);
		}

		list.remove(currentPath);
		result.paths.add(currentPath);
		result.items.add(currentPoint);

		return result;
	}

	@Override
	public String toString() {
		String result = "";

		for (TaxiwayPath p : paths) {
			result += p + "\n";
		}

		return result;
	}

	public List<TaxiwayPath> getPaths() {
		return paths;
	}

	public List<TaxiwayItem<?>> getItems() {
		return items;
	}

}
