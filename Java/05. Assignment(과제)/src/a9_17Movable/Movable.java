package a9_17Movable;

public interface Movable {
	void move(int dx, int dy);
}
class Shape implements Movable {
	protected int dx;
	protected int dy;
	public void draw() {
		System.out.println("Shape Draw");
	}

	@Override
	public void move(int dx, int dy) {

	}
}
class Rectangle extends Shape {
	private int width;
	private int height;

	public void draw() {
		System.out.println("Rectangle Draw");
	}

	@Override
	public void move(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
		System.out.printf("Rectangle 도형의 기준점 이동 > > %d %d \n", dx, dy);
	}
}
class Triangle extends Shape {
	private int base, height;

	public void draw() {
		System.out.println("Triangle Draw");
	}

	@Override
	public void move(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
		System.out.printf("Triangle 도형의 기준점 이동 > > %d %d \n", dx, dy);
	}
}
class Circle extends Shape {
	private int base, height;

	public void draw() {
		System.out.println("Circle Draw");
	}

	@Override
	public void move(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
		System.out.printf("Circle 도형의 기준점 이동 > > %d %d \n", dx, dy);
	}
}
