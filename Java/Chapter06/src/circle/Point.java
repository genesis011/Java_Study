package circle;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		this.x=0;
		this.y=0;
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
		//return String.format(, );
	}
}
