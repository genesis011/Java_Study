package chapter03;

import java.util.Scanner;

public class B2_EvenOdd {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int number = 0;
		int i = 0;
		
		//System.out.println("������ �Է��Ͻÿ� : ");
		@SuppressWarnings("unused")
		Scanner input = new Scanner(System.in);

		for (i = 0; i < 3; i++) {
			int number1 = (int) (Math.random() * (100 - 50 + 1) + 50);
			if (number1 % 2 == 0) {
				System.out.println(number1+"�Էµ� ������ ¦���Դϴ�.");
			} else {
				System.out.println(number1+"�Էµ� ������ Ȧ���Դϴ�.");
			}
			System.out.println("���α׷��� �����մϴ�.");
		}

	}

}
