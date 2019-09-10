package threadA;

import java.awt.Toolkit;

public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException {
//		Runnable r1 = new MyThread3();
		Runnable r2 = new MyThread4();
//		1. Thread 입력해야한다.
		Thread t1 = new Thread(/* new Runnable() { */ // 임시객체 /람다식->
//			@Override
				/* public void run */() -> {
					Toolkit tool = Toolkit.getDefaultToolkit();
					for (int i = 1; i <= 5; i++) {
						if (i == 2 || i == 3) { //2와 3은 양보하고 소리를 내지 않는다.
//							즉 자기에게 주어진 시간이면 양보하고 2와 3이외일 때는 일을 한다는 의미
							Thread.yield();
						} else {
							tool.beep();
						}
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {}
					}
//			}
				});
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
