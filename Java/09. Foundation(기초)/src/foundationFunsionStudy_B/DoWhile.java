package foundationFunsionStudy_B;

import java.util.Scanner;

public class DoWhile {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int value = 0;

		// Scanner�� java.util ��Ű���� �ִ� Ŭ�����ν� Ű����� ���� ���� �Է¹޴´ٴ��� �� �� �����ϰ� ����� �� �ִ� Ŭ�����Դϴ�.
		Scanner scan = new Scanner(System.in);
		// �� ó�� �ۼ��Ͻø� Ű����κ��� ���� �Է¹��� �� �ִ� Scanner��ü�� �����˴ϴ�.
		do {
			System.out.print("���� �Է��Ͻÿ� : ");
			value = scan.nextInt(); // ScannerŬ������ �̿��Ͽ� Ű����� ���� ���ڰ��� �Է¹޽��ϴ�.
			System.out.println("�Է¹��� �� : " + value);
		} while (value != 10); // �Է¹��� ���� 10�� �ƴ� ��쿡�� ��� �ݺ��մϴ�.

		System.out.println("�ݺ��� ����");
	}
}
