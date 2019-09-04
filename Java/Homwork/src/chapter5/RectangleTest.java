package chapter5;

public class RectangleTest {

	class Rectangle {
		int w;
		int h;

		int area() {
			return w * h;
		}

		int perimeter() {
			return 2 * (w + h);
		}
	}

	public class rectangleTest {
		public void main(String[] args) {
			Rectangle myRect;
			myRect = new Rectangle();
			myRect.w = 10;
			myRect.h = 20;
			System.out.println("������ " + myRect.area());
			System.out.println("�ѷ��� " + myRect.perimeter());
		}
	}
}
