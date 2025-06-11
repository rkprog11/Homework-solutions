package Shapes;

public class Rectangle extends Shape {
	double width, length;
	
	
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*length;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rechteck";
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	

}
