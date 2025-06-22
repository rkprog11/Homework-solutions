package Shapes;

import java.util.ArrayList;

public class ShapeStorage<T extends Shape> extends ArrayList<T> {
	
	
	public double getTotalArea() {
		double area = 0;
		
		//über DIESE Liste iterieren und Area addieren
		for(Shape shape : this) {  								//this inherits a list structure from arrayList
			area += shape.getArea();
		}
		
		return area;
	}
	
	public void displayAllShapes() {
		String msg = "";
		
		//über DIESE Liste iterieren und an msg anfügen
		for(Shape shape : this) {
			msg += shape.toString();
			msg += ", ";
		}
		msg = msg.substring(0, msg.length() - 2); // delete the ", " at the end
		System.out.println(msg);
	}
	
	public <U extends T> void importLargeShapes(ShapeStorage<U> other, double minArea) {
		for(Shape shape : other) {							//Shape can be replaced with U (or T)
			if(shape.getArea() >= minArea) {
				//Shape zu DIESER Liste hinzufügen
				this.add((T)shape);
			}
		}
	}
}
