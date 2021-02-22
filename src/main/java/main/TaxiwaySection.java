package main;

import java.util.ArrayList;
import java.util.List;

import xmlClasses.TaxiwayItem;
import xmlClasses.TaxiwayPath;

public class TaxiwaySection {
	private List<TaxiwayPath> paths =  new ArrayList<>();
	private List<TaxiwayItem> items = new ArrayList<>();
	
	public static TaxiwaySection extract(List<TaxiwayPath> list) {
		TaxiwaySection result = new TaxiwaySection();
		
		TaxiwayPath currentPath = list.get(0);
		
		// find section with centerline
		for(;!currentPath.getCenterLine().equals("TRUE");) {
			list.remove(currentPath);
			currentPath = list.get(0);
		}
		TaxiwayItem currentPoint = currentPath.getStart();
		
		// find beginning of section (number of connected paths != 2)
		for(;(currentPoint.getConnectedPaths().size() == 2) && currentPath.getCenterLine().equals("TRUE");) {
			
			// get path on other side of point
			for (TaxiwayPath p: currentPoint.getConnectedPaths()) {
				if (p != currentPath) {
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
		for (;(currentPoint.getConnectedPaths().size() == 2) && currentPath.getCenterLine().equals("TRUE");) {
			list.remove(currentPath);
			result.paths.add(currentPath);
			result.items.add(currentPoint);
			
			// get path on other side of point
			for (TaxiwayPath p: currentPoint.getConnectedPaths()) {
				if (p != currentPath) {
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
		
		for (TaxiwayPath p: paths) {
			result += p + "\n";
		}
		
		return result;
	}

	public List<TaxiwayPath> getPaths() {
		return paths;
	}

	public List<TaxiwayItem> getItems() {
		return items;
	}


	
	
}
