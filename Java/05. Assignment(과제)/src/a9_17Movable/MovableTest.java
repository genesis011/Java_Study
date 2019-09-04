package a9_17Movable;

public class MovableTest {

	public static void main(String[] args) {
		Movable[] arrayOfShapes =new Movable[3];

		int num1 = (int) (Math.random() * 46 + 1);
		int num2 = (int) (Math.random() * 46 + 1);

		arrayOfShapes[0] = new Rectangle();
		arrayOfShapes[1] = new Triangle();
		arrayOfShapes[2] = new Circle();

		arrayOfShapes[0].move(num1, num2);
		arrayOfShapes[1].move(num1, num2);
		arrayOfShapes[2].move(num1, num2);

	}
}
