package chapter5;

import java.awt.Rectangle;

public class Test {
	int width, height;

	int area() {
		return width * height;
	}

	public static void main(String[] args) {
		Rectangle myRect;
		myRect = new Rectangle();
		myRect.width = 10;
		myRect.height = 20;
		System.out.println(myRect.width);
		System.out.println(myRect.height);
	}
}
