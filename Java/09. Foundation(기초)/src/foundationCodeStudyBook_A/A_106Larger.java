package foundationCodeStudyBook_A;

import java.util.Scanner;

public class A_106Larger { // 더 큰 : Larger

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 0, y = 0, max = 0;
		System.out.print("첫번째 정수 : ");
		x = input.nextInt();

		System.out.print("두번째 정수 : ");
		y = input.nextInt();

		if (x > y)
			max = x;
		else
			max = y;
		System.out.print("큰 수는 : " + max);
	}
}
