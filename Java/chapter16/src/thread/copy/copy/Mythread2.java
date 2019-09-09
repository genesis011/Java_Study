package thread.copy.copy;
// 동시에 소리나는 방법
import java.awt.Toolkit;

// 1. 스레드 1번 방식 Thread 상속받는다.
public class Mythread2 extends Thread {
//	2. 스레드를 구현한다
	@Override
	public void run() {
		System.out.println("t1"+Thread.currentThread().getName());
		Toolkit tool = Toolkit.getDefaultToolkit();

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}

}
