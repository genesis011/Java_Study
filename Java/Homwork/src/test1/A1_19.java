package test1;

import java.util.Scanner;

public class A1_19 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 1.x�� �Ǽ��̰� ����ڷκ��� ���� �޴´�.
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է����ּ��� : ");
		double x = scan.nextDouble();
		if (x <= 0)
			System.out.println("�Լ����� " + ((x * x * x) - (9 * x) + 2) + "�Դϴ�.");
		else
			System.out.println("�Լ����� " + ((7 * x) + 2) + "�Դϴ�.");
	}
}
