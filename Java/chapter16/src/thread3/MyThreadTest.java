package thread3;

public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = new MyThread3();
		Runnable r2 = new MyThread4();
//		1. Thread �Է��ؾ��Ѵ�.
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
	}
}
