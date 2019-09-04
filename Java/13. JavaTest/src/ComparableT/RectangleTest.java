package ComparableT;

public class RectangleTest {

	private static String str1;

	public static void main(String[] args) {
		Rectangle rec1=new Rectangle(10, 40);
		Rectangle rec2=new Rectangle(20, 30);
		Circle cir1=new Circle(20);
		
		int compareValue=0;
		
		System.out.println(rec1);
		System.out.println(rec2);
		System.out.println(cir1);
		
		compareValue=rec1.compareTo(rec2);
		
		ifFunc(compareValue, "��ü1","��ü2");
		
		compareValue=rec1.compareTo(cir1);
		
		ifFunc(compareValue, "��ü1","��ü2");
	}

	private static void ifFunc(int compareValue, String string, String string2) {
		if(compareValue==1) {
			System.out.println(str1+"�� ũ��.");
		}else if(compareValue==-1) {
			System.out.println(str1+"�� ũ��.");
		}else if(compareValue==0) {
			System.out.println(str1+"�� ��ü�� ����.");
		}else {
			System.out.println("�� ��ü�� ���� �� �����ϴ�.");
		}	
	}
}
