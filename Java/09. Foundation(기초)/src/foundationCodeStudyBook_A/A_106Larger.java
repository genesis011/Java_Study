package foundationCodeStudyBook_A;

import java.util.Scanner;

public class A_106Larger { // �� ū : Larger

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 0, y = 0, max = 0;
		System.out.print("ù��° ���� : ");
		x = input.nextInt();

		System.out.print("�ι�° ���� : ");
		y = input.nextInt();

		if (x > y)
			max = x;
		else
			max = y;
		System.out.print("ū ���� : " + max);
	}
}
