package Shapes;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class PersistentShapeManager {
	
	 public static void saveShapesToFile(Collection<? extends Shape> shapes, String filename) {
		 //File f = new File(filename);
		 try (FileWriter w = new FileWriter(filename, true); BufferedWriter bw = new BufferedWriter(w)) {
			 for(Shape shape : shapes) {
				 String stringShape = "";
				 switch (shape.getClass().getSimpleName()) {
				 case "Circle":	//"Circle: radius=2.0"
					 stringShape += "Circle: radius=" + ((Circle) shape).getRadius() + "\n";
					 break;
				 case "Rectangle": //"Rectangle: width=3.0, length=4.0"
					 stringShape += "Rectangle: width=" + ((Rectangle) shape).getWidth() + ", length=" + ((Rectangle) shape).getLength() + "\n";
					 break;
				 }
				 bw.append(stringShape);
			 }
		 } catch (IOException ioe) {
			 
		 }
	 }
	 
	 public static List<Shape> loadShapesFromFile(String filename) {
		 try(FileReader fr = new FileReader(filename); BufferedReader br = new BufferedReader(fr)){
			 ShapeStorage<Shape> shapeList = new ShapeStorage<Shape>();
			 String nextLine = br.readLine();
			 while(nextLine != null) {
				 Shape shape = ShapeFactory.fromString(nextLine);
				 shapeList.add(shape);
				 nextLine = br.readLine();
			 }
			 return shapeList;
		 } catch (IOException ioe) {
			 
		 }
		 return null;
	 }
	 
	 static void clearFile(String filename) {
		 try (FileWriter fr = new FileWriter(filename)){
			 fr.write("");
		 } catch (IOException ioe) {
			 
		 }
	 }
}
