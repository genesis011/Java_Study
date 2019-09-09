package thread;

import java.awt.Toolkit;

public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException {
//		2. 소리를 작동시키는 방법
		Toolkit tool=Toolkit.getDefaultToolkit();
		for(int i=1;i<=5;i++) {
			tool.beep();
			Thread.sleep(500);
		}
		tool.beep();
		
//		1. 숫자를 찍어주는 스레드
		Thread t = new Mythread();
		t.start();
//		t.run();
	}
}
