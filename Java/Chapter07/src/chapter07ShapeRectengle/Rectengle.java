package chapter07ShapeRectengle;

public class Rectengle extends Shape {
	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	double area() {
		return (double) width * height;
	}

	void draw() {
		System.out.println("(" + this.getX() + "," + this.getY() + ") ��ġ�� " + "����: " + width + "����: " + height);
	}
}
