package a_07_08_1Circle;

public class CylinderTest {

	public static void main(String[] args) {
		Cylinder c1 = new Cylinder(5.0);

		Cylinder c2 = new Cylinder(5.0, 3.0);

		System.out.println(c1.getRadius());

		System.out.println(c1.getRadius());

		System.out.println(c2.getHeight());

		System.out.println(c2.getVolume());
	}
}
