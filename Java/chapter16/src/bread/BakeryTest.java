package bread;

public class BakeryTest {

	public static void main(String[] args) {
		Bakery bakery=new Bakery();
//		������ �����尴ü ����
		Runnable baker=new Baker(bakery);
		Thread thread1=new Thread(baker);
//		�Һ��� ������ ��ü ����
		Thread thread2=new Guest(bakery);
		
		thread1.start();
		thread2.start();
	}

}
