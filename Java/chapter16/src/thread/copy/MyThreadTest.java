package thread.copy;

import java.awt.Toolkit;

public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException {
//		2. 소리를 작동시키는 방법

//		1. 숫자를 찍어주는 스레드
		Thread t1 = new Mythread();
		Thread t2 = new Mythread2();
		t1.start();
		t2.start();
//		t.run();
	}
}
