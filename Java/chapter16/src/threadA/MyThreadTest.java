package threadA;

import java.awt.Toolkit;

public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException {
//		Runnable r1 = new MyThread3();
		Runnable r2 = new MyThread4();
//		1. Thread �Է��ؾ��Ѵ�.
		Thread t1 = new Thread(/* new Runnable() { */ // �ӽð�ü /���ٽ�->
//			@Override
				/* public void run */() -> {
					Toolkit tool = Toolkit.getDefaultToolkit();
					for (int i = 1; i <= 5; i++) {
						if (i == 2 || i == 3) { //2�� 3�� �纸�ϰ� �Ҹ��� ���� �ʴ´�.
//							�� �ڱ⿡�� �־��� �ð��̸� �纸�ϰ� 2�� 3�̿��� ���� ���� �Ѵٴ� �ǹ�
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
