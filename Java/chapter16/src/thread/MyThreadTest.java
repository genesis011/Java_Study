package thread;

import java.awt.Toolkit;

public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException {
//		2. �Ҹ��� �۵���Ű�� ���
		Toolkit tool=Toolkit.getDefaultToolkit();
		for(int i=1;i<=5;i++) {
			tool.beep();
			Thread.sleep(500);
		}
		tool.beep();
		
//		1. ���ڸ� ����ִ� ������
		Thread t = new Mythread();
		t.start();
//		t.run();
	}
}
