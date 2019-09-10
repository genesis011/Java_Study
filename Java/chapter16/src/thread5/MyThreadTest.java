package thread5;

import java.awt.Toolkit;

public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException {
//		Runnable r1 = new MyThread3();
		Runnable r2 = new MyThread4();
//		1. Thread 입력해야한다.
		Thread t1=new Thread(/*new Runnable() {*/  //임시객체 /람다식->
//			@Override
/*			public void run*/()-> {
				Toolkit tool = Toolkit.getDefaultToolkit();
				for (int i = 1; i <= 5; i++) {
					tool.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {}
				}
//			}
		});
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
	}
}
