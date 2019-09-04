package shapeTest;

public class ShapeTest1 {

	private static Shape arrayofShapes[];

	public static void main(String[] args) {
		init();
		drawAll();
	}

	public static void init() {
		arrayofShapes = new Shape[3];
		arrayofShapes[0] = new Rectangle();
		arrayofShapes[1] = new Triangle();
		arrayofShapes[2] = new Circle();
	}

	public static void drawAll() {
		for (int i = 0; i < arrayofShapes.length; i++) {
			arrayofShapes[i].draw();
		}
	}
}
