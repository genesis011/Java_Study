package a9_18Drawable;

public class DrawableTest {

	public static void main(String[] args) {
		Drawable[] arrayOfShapes = new Shape[4];
		for (int i = 0; i < arrayOfShapes.length; i++) {
			arrayOfShapes[0] = new Shape();
			arrayOfShapes[1] = new Rectangle();
			arrayOfShapes[2] = new Triangle();
			arrayOfShapes[3] = new Cricle();

			arrayOfShapes[i].draw();
		}
	}
}
