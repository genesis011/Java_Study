package thread5; // ���ÿ� �Ҹ����� ���

// 1. ������ 1�� ��� Thread ��ӹ޴´�.
public class Mythread extends Thread {
//	2. �����带 �����Ѵ�
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
