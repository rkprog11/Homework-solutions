package Shapes;

public class ShapeFactory {
	
	public static Shape fromString(String input) {
		try {
			String shapeName = input.substring(0,input.indexOf(':'));
			if(shapeName.equals("Circle")) { //"Circle: radius=2.0"
				Double radius = Double.parseDouble(input.substring(input.indexOf('=') + 1, input.length()));
				return new Circle(radius);
			} else if(shapeName.equals("Rectangle")) { //"Rectangle: width=3.0, length=4.0"
				double width =  Double.parseDouble(input.substring(input.indexOf('=') + 1, input.indexOf(',')));
				double length =  Double.parseDouble(input.substring(input.indexOf('=',input.indexOf('=') + 1)+1, input.length()));
				return new Rectangle(width, length);
			}
		} catch (Exception e){
			
		}
		return null;
	}
	// eigene exception noch einbauen
}
