package thread.copy;

import java.awt.Toolkit;

public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException {
//		2. �Ҹ��� �۵���Ű�� ���

//		1. ���ڸ� ����ִ� ������
		Thread t1 = new Mythread();
		Thread t2 = new Mythread2();
		t1.start();
		t2.start();
//		t.run();
	}
}
