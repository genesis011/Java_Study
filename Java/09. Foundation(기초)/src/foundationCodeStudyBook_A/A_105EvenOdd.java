package foundationCodeStudyBook_A;

import java.util.Scanner;

public class A_105EvenOdd { // ¦�� : Even, Ȧ�� : odd

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		System.out.print("������ �Է��Ͻÿ� : ");
		number = input.nextInt();
		if (number % 2 == 0) {
			System.out.println("�Է���� ������ ¦���Դϴ�.");
		} else {
			System.out.println("�Է��µ� ������ Ȧ���Դϴ�.");
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
