package InterFaceComparable1;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rec1=new Rectangle(10, 20);
		Rectangle rec2=new Rectangle(10, 20);
		
		
		System.out.println(rec1);
		System.out.println(rec2);
		int returnValue =rec1.compareTo( rec2);
		switch (returnValue) {
		case -1:
			System.out.println("1크다.");
			break;
		case 1:
			System.out.println("2크다.");
			break;
		default:
			System.out.println("같다.");
			break;
		}
	}
}
