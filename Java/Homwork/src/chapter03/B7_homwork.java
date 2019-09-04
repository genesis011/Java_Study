package chapter03;

import java.util.Scanner;

public class B7_homwork {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int number=0;
		Scanner inputObject=new Scanner(System.in);
		System.out.print("2진법으로 바꿀 정수 값을 입력 요망 : ");
		number = inputObject.nextInt();
		String strValue = toBinaryString(number);
		System.out.println(number+"값을 2진법 변환="+strValue);
	 }
	 public static String toBinaryString(int value) {
	 	String strValue = Integer.toBinaryString(value);
	 	while(strValue.length()<=32) {
	 		strValue = "0"+strValue;
	 	}
	 	return strValue;
	  }
	}
