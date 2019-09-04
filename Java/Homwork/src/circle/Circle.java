package circle;

public class Circle {
	double r;
	double cx;
	double cy;

	public double area() {
		return 3.141592 * r * r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getCx() {
		return cx;
	}

	public void setCx(double cx) {
		this.cx = cx;
	}

	public double getCy() {
		return cy;
	}

	public void setCy(double cy) {
		this.cy = cy;
	}

}// end of Circle class
