package thread.copy.copy2;

import java.awt.Toolkit;

public class MyThreadTest {

	public static void main(String[] args) {

//		Runnable r1 = new MyThread3();//4번째 방법
		Runnable r2 = new MyThread4();
//		1. Thread 입력해야한다.
		Thread t1 = new Thread(() -> {
			Toolkit tool = Toolkit.getDefaultToolkit();
			for (int i = 1; i <= 5; i++) {
				tool.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}

		});
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
