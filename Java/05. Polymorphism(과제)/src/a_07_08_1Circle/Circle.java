package a_07_08_1Circle;

public class Circle {
	private double Radius;
	private String color;
	public Circle() {
	}
	public Circle(double Radius) {
		this.Radius = Radius;
	}
	public double getRadius() {
		return Radius;
	}
	public double getArea() {
		return (double) Math.round(Radius * 2 * 3.14 * 100);
	}
}
