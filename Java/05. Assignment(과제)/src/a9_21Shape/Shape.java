package a9_21Shape;

public class Shape {
	String color = "red";
	public void calcArea() {}
	public String toString() {return this.color;}
}
class Rectangle extends Shape{
	int length, width;
	public Rectangle(int length, int width) {
		this.length=length;
		this.width=width;
	}
	public void calcArea() {
		System.out.printf("�簢���� ����: %d\n",(length*width));
	}
	public String toStoString() {
		return color;	
	}
}
class Triangle extends Shape{
	int base, height;	
	public Triangle(int base, int height) {
		System.out.printf("�ﰢ���� ����: %f\n",(double)(base*height)/2);
	}
	public String toString() {return color;}
}
