package chapter03;

import java.util.Scanner;

public class B2_EvenOdd {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int number = 0;
		int i = 0;
		
		//System.out.println("정수를 입력하시오 : ");
		@SuppressWarnings("unused")
		Scanner input = new Scanner(System.in);

		for (i = 0; i < 3; i++) {
			int number1 = (int) (Math.random() * (100 - 50 + 1) + 50);
			if (number1 % 2 == 0) {
				System.out.println(number1+"입력된 정수는 짝수입니다.");
			} else {
				System.out.println(number1+"입력된 정수는 홀수입니다.");
			}
			System.out.println("프로그램을 종료합니다.");
		}

	}

}
