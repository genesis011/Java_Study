package chapter03;

import java.util.Scanner;

public class B9_Gcd1 {

	public static void main(String[] args) {
		// x와 y의 값을 입력받는다1~100
		int x = inputValue();
		int y = inputValue();
		int temp = 0;
		// 2. x,y값의 대소결정한다.(큰값 : x, 작은 값 : y
		if (x < y) {
			temp = x;
			x = y;
			y = temp = 0;
		}
		// 3. 최대 공약수
		while (true) {
			if (y == 0) {
				System.out.println("최대 공약수는 " + x);
				break;
			} else {
				temp = x % y;
				x = y;
				y = temp;
			}
		}
	}
	@SuppressWarnings("resource")
	public static int inputValue() {
		int value = 0;
		do {	
			Scanner scan = new Scanner(System.in);
			System.out.println("1~100까지 수를 입력 요망: ");
			value =scan.nextInt();
		} while (value < 1 || value > 100);
		return value;
	}
}
