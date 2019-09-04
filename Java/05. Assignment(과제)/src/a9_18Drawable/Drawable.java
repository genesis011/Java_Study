package a9_18Drawable;

public interface Drawable {
	void draw();
}
class Shape implements Drawable{
	protected  int x,y;
	@Override
	public void draw() {
		System.out.println("Shape Draw");
	}
}
class Rectangle extends Shape{
	private int widht, height;	
	@Override
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}
class Triangle extends Shape{
	private int base,height;	
	@Override
	public void draw() {
		System.out.println("Triangle Draw");
	}
}
class Cricle extends Shape{
	private int radius;	
	@Override
	public void draw() {
		System.out.println("Cricle Draw");
	}
}
