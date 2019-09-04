package methodPlane;

public class PlaneTest {

	public static void main(String[] args) {
		Plane plane1 = new Plane(1, "T737", 200);
		Plane plane2 = new Plane(10, "US091");
		Plane plane3 = new Plane();
		//plane1.setPlanes(0);
		//plane1.getPlanes();
		plane3.setNum(3);
		plane3.setModel("A380");
		plane3.setP_num(150);
		System.out.println(plane1);
		System.out.println(plane2);
		System.out.println(plane3);
		System.out.println("±â   Á¾ : " + plane3.getModel());
	}
}
