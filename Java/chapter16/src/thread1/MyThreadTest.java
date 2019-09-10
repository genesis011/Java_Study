package thread1;

import java.awt.Toolkit;

public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException {
//		2. 소리를 작동시키는 방법
		Toolkit toolkit=Toolkit.getDefaultToolkit(); //한번만 만들어라 /싱글톤
		for(int i=1;i<=5;i++) {
			toolkit.beep();
			Thread.sleep(500); // 5초
		}
		toolkit.beep(); //비프음을 출력
		
//		1. 숫자를 찍어주는 스레드
		Thread t = new Mythread();
		t.start();
//		t.run();
	}
}
