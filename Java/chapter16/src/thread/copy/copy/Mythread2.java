package thread.copy.copy;
// ���ÿ� �Ҹ����� ���
import java.awt.Toolkit;

// 1. ������ 1�� ��� Thread ��ӹ޴´�.
public class Mythread2 extends Thread {
//	2. �����带 �����Ѵ�
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
