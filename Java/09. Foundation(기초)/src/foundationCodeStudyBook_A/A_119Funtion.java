package foundationCodeStudyBook_A;

import java.util.Scanner;

public class A_119Funtion {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = 0;
		x = scan.nextDouble();
		if (x <= 0)
			System.out.println("�Լ� ���� " + ((x * x * x) - (9 * x) + 2) + "�Դϴ�.");
		else
			System.out.println("�Լ� ���� " + ((7 * x) + 2) + "�Դϴ�.");
	}
}
