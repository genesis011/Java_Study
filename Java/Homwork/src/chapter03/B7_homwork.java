package chapter03;

import java.util.Scanner;

public class B7_homwork {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int number=0;
		Scanner inputObject=new Scanner(System.in);
		System.out.print("2�������� �ٲ� ���� ���� �Է� ��� : ");
		number = inputObject.nextInt();
		String strValue = toBinaryString(number);
		System.out.println(number+"���� 2���� ��ȯ="+strValue);
	 }
	 public static String toBinaryString(int value) {
	 	String strValue = Integer.toBinaryString(value);
	 	while(strValue.length()<=32) {
	 		strValue = "0"+strValue;
	 	}
	 	return strValue;
	  }
	}
