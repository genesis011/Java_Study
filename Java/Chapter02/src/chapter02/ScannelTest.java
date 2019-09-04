package chapter02;

import java.util.Scanner;

public class ScannelTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문장을 사용자로부터 입력받는 방법
		//1. Scanner스캐너 객체를 만든다.
		//2. 문자열(nextLine), 문자단어(next), 정수 값(nextInt), 실수 값nextDouble, 부울 값nextBoolean
		Scanner leeScanner=new Scanner(System.in);
		System.out.printf("당신의 이름을 입력하시오 : ");
		String name=leeScanner.nextLine();
		System.out.println("당신의 이름은 "+name+"입니다.\n");
		System.out.printf("당신의 나이를 입력하시오 : ");
		int age=leeScanner.nextInt();
		System.out.println("당신의 나이는"+age+"입니다.");
	}

}
