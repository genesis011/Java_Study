package test1;

import java.util.Scanner;

public class A1_19 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 1.x는 실수이고 사용자로부터 값을 받는다.
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력해주세요 : ");
		double x = scan.nextDouble();
		if (x <= 0)
			System.out.println("함수값은 " + ((x * x * x) - (9 * x) + 2) + "입니다.");
		else
			System.out.println("함수값은 " + ((7 * x) + 2) + "입니다.");
	}
}
