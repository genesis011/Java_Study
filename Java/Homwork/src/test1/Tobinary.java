package test1;

import java.util.Scanner;

public class Tobinary {

	public static void main(String[] args) {
		int num = 0;// 스캔받을 변수 생성
		num = scan(); //변수에 스캔으로 받은 값을 저장
		tobinary(num); //함수를 불러서 숫자를 이진법 문자열로 바꿔서 출력

	}

	@SuppressWarnings("resource")
	public static int scan() {
		Scanner input = new Scanner(System.in); //스캐너를 만듦 
		System.out.print("2진법으로 변환할 값을 입력하시오 : ");// 입력 전 출력
		int value = input.nextInt();//입력 받은 값을 저장
		return value; //입력 받은 값을 저장한 변수를 리턴
	}

	public static void tobinary(int num) {
		String str = Integer.toBinaryString(num); //입력 받은 숫자를 함수를 사용해서 이진법 문자열로 변환 후 변수에 저장
		while (str.length() < 16) { //16자리 까지 0을 출력 해야 하므로 반복문을 돌림
			str = "0" + str; // 이진법으로 바꾼 문자열에 앞에다가 0을 더해준다. 1001 -> 01001
		}
		
		System.out.println("2진법으로 변환한 값은 " + str);
	}

}
