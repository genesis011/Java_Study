package thread1;

import java.awt.Toolkit;

public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException {
//		2. �Ҹ��� �۵���Ű�� ���
		Toolkit toolkit=Toolkit.getDefaultToolkit(); //�ѹ��� ������ /�̱���
		for(int i=1;i<=5;i++) {
			toolkit.beep();
			Thread.sleep(500); // 5��
		}
		toolkit.beep(); //�������� ���
		
//		1. ���ڸ� ����ִ� ������
		Thread t = new Mythread();
		t.start();
//		t.run();
	}
}
