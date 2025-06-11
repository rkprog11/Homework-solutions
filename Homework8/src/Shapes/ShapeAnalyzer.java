package Shapes;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShapeAnalyzer {
	static List<Shape> filterByMinArea(Collection<? extends Shape> shapes, double minArea){
		List<Shape> re= new ShapeStorage<Shape>();
		 for (Shape shape : shapes) {
			 if(shape.getArea() < minArea) {
				re.add(shape);
			 }
		 }
		 return re;
	}
	
	static Shape findShapeWithMaxArea(Collection<? extends Shape> shapes) {
		Shape maxShape = shapes.iterator().next();
		double maxArea = maxShape.getArea();
		for (Shape shape : shapes) {
			double shapeArea = shape.getArea();
			if(shapeArea > maxArea) {
				maxShape = shape;
				maxArea = shapeArea;
			}
		}
		return maxShape;
	}
	 static <T extends Shape> Map<String, List<T>> groupByType(Collection<T> shapes){
		 Map<String, List<T>> map = new HashMap<String, List<T>>();
		 for(Shape shape : shapes) {
			 String shapeName =shape.getClass().getSimpleName();
			 List<T> k = map.get(shapeName);
			 if(k == null) {
				 k = new ShapeStorage<T>();
				 map.put(shapeName, k);
			 }
			 k.add((T)shape);	 
		 }
		 return map;
	 }
}
