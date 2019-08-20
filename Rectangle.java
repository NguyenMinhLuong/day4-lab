package day4.vn;

public class Rectangle extends Shape {
	int length;
	int width;
	Shape shape;
	public Rectangle(int length, int width, String color) {
		this.length = length;
		this.width = width;
		this.color=color;
	}

	public String toString() {
		super.toString();
		return "Rectangle";
	}

	public double getArea() {
		super.getArea();
		return length * width;
	}
	public void processShape()
	{
		super.processShape();
	}
}
