package thread.copy.copy2;
// ���ÿ� �Ҹ����� ���
import java.awt.Toolkit;

// 1. ������ 1�� ��� Thread ��ӹ޴´�.
public class Mythread extends Thread {
//	2. �����带 �����Ѵ�
	@Override
	public void run() {
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
