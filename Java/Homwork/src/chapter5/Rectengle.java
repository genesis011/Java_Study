package chapter5;

public class Rectengle {

	private int area;
	private int perimeter;

	@SuppressWarnings("unused")
	public Rectengle() {
		area=0;
		perimeter=0;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}

	public int getArea() {
		return area;
	}

	public int getPerimeter() {
		return perimeter;
	}
	public int result() {
		return area*perimeter;
	}

	public void printer() {
		System.out.println("면적 : " + getArea());
		System.out.println("둘레 : " + getPerimeter());
	}

}