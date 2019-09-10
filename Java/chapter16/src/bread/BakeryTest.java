package bread;

public class BakeryTest {

	public static void main(String[] args) {
		Bakery bakery=new Bakery();
//		생산자 스레드객체 만듦
		Runnable baker=new Baker(bakery);
		Thread thread1=new Thread(baker);
//		소비자 스레드 객체 만듦
		Thread thread2=new Guest(bakery);
		
		thread1.start();
		thread2.start();
	}

}
