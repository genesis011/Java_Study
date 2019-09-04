package foundationFunsionStudy_B;

import java.util.Scanner;

public class DoWhile {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int value = 0;

		// Scanner는 java.util 패키지에 있는 클래스로써 키보드로 부터 값을 입력받는다던지 할 때 유용하게 사용할 수 있는 클래스입니다.
		Scanner scan = new Scanner(System.in);
		// 위 처럼 작성하시면 키보드로부터 값을 입력받을 수 있는 Scanner객체가 생성됩니다.
		do {
			System.out.print("수를 입력하시오 : ");
			value = scan.nextInt(); // Scanner클래스를 이용하여 키보드로 부터 숫자값을 입력받습니다.
			System.out.println("입력받은 수 : " + value);
		} while (value != 10); // 입력받은 값이 10이 아닐 경우에는 계속 반복합니다.

		System.out.println("반복문 종료");
	}
}
