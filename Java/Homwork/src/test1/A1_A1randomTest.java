package test1;

import java.util.Scanner;

public class A1_A1randomTest {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		int x = 0, y = 0;
		int number = 0;
		Scanner input = new Scanner(System.in);
		number = (int) (Math.random() * (100 - 1 + 1) + 1);
		for (;;) {
			System.out.printf("���� �Է��Ͻÿ� : ");
			y = input.nextInt();
			if (number < y) {
				System.out.println("�����ϴ�.");
			} else if (number > y) {
				System.out.println("�����ϴ�.");
			} else {
				System.out.println("�����մϴ�.");
				break;
			}

		}
	}

}
