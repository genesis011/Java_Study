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
			System.out.printf("값을 입력하시오 : ");
			y = input.nextInt();
			if (number < y) {
				System.out.println("높습니다.");
			} else if (number > y) {
				System.out.println("낮습니다.");
			} else {
				System.out.println("축하합니다.");
				break;
			}

		}
	}

}
