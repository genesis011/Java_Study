package a_07_08_1Circle;

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

	public double getVolume() {
		double radius = super.getRadius();
		return (double) Math.round((radius * radius * 3.14) * height * 100) / 100;
	}
}
