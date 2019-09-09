package thread.copy.copy;

import java.awt.Toolkit;

public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException {
//		2. 소리를 작동시키는 방법
//		세번째 방법
//		1. 숫자를 찍어주는 스레드
		Thread t1 = new Mythread() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {}
				}
			}
		};
		
		Thread t2 = new Mythread2();
		t1.start();
		t2.start();
//		t.run();
	}
}
