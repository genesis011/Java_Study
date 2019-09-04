package solution;

public class Circle {
	public int radius;
	public final double PI = 3.141592;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", PI=" + PI + "]";
	}
}
