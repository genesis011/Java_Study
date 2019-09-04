package foundationCodeStudyBook_A;

import java.util.Scanner;

public class A_118SmallNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, y, z, min;
		System.out.print("정수를 입력하시오 : ");
		x = scan.nextInt();
		System.out.print("정수를 입력하시오 : ");
		y = scan.nextInt();
		System.out.print("정수를 입력하시오 : ");
		z = scan.nextInt();
		if (x < y) {
			if (z < x)
				min = z;
			else
				min = x;
		} else {
			if (z < y)
				min = z;
			else
				min = y;
		}
		System.out.printf("제일 작은 정수는 %d입니다", min);
	}
}
