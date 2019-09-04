package foundationCodeStudyBook_A;

import java.util.Scanner;

public class A_119Funtion {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = 0;
		x = scan.nextDouble();
		if (x <= 0)
			System.out.println("함수 값은 " + ((x * x * x) - (9 * x) + 2) + "입니다.");
		else
			System.out.println("함수 값은 " + ((7 * x) + 2) + "입니다.");
	}
}
