package thread4;
// ���ÿ� �Ҹ����� ���
import java.awt.Toolkit;

// 1. ������ 1�� ��� Thread ��ӹ޴´�.
public class Mythread2 extends Thread {

//	2. �����带 �����Ѵ�
	@Override
	public void run() {
		System.out.println("t2"+Thread.currentThread().getName());
		Toolkit tool = Toolkit.getDefaultToolkit();
		for (int i = 1; i <= 5; i++) {
			tool.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
