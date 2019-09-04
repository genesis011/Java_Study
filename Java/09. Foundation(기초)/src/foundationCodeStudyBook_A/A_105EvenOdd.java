package foundationCodeStudyBook_A;

import java.util.Scanner;

public class A_105EvenOdd { // 짝수 : Even, 홀수 : odd

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		System.out.print("정수를 입력하시오 : ");
		number = input.nextInt();
		if (number % 2 == 0) {
			System.out.println("입려고된 정수는 짝수입니다.");
		} else {
			System.out.println("입려력된 정수는 홀수입니다.");
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
