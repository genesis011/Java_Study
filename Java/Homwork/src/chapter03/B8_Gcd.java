package chapter03;

import java.util.Scanner;

public class B8_Gcd {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int x = 0, y = 0, r = 0;
		System.out.println("두개의 정수를 입력하시오(작은수,큰수) : ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();

		while(true) {
			if(y == 0){
				System.out.println("최대 공약수는" + x);
				break;
			}else {
				r = x % y;
				x = y;
				y = r;
			}
		}
	}
}
