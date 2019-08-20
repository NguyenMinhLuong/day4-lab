package day4.vn;

public abstract class Shape {
	String color;

	public abstract double getArea();

	public String toString() {
		return "Shape";
	}

	public void processShape() {
		System.out.println("Shape color is :" + color);
		System.out.println("Shape Area is :" + getArea());
	}
}
