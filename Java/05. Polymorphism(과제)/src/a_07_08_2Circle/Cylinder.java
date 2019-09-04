package a_07_08_2Circle;

public class Cylinder extends Circle {
	private double height;
	public Cylinder() {
		super();
	}
	public Cylinder(double radius) {
		super(radius);
	}
	public Cylinder(double radius, double height) {
		this(radius);
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
}
