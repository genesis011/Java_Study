package array;

import java.util.Scanner;

public class A1_A1TobinaryTest {

	public static void main(String[] args) {
		int num = scan();
		tobinary(num);
	}

	public static void tobinary(int number) {
		String num = Integer.toBinaryString(number);
		while (num.length() < 32) {
			num = "0" + num;
		}
		System.out.println("2진법으로 변환 값은" + num);
	}

	@SuppressWarnings("resource")
	public static int scan() {
		Scanner input = new Scanner(System.in);
		System.out.print("2진법으로 변환할 값을 입력하시오 : ");
		int value = input.nextInt();
		return value;
	}
}
