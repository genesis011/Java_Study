package chapter02;

import java.util.Scanner;

public class ToBinaryTest<staitc> {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int number=0;
		Scanner inputObject=new Scanner(System.in);//�Է¹޴� ��踦 �������.
		System.out.print("2�������� �ٲ� ���� ���� �Է¿�� :");
		number = inputObject.nextInt();
		String strValue=toBinaryString(number);
		System.out.println(number+"���� 2���� ��ȯ="+strValue);
	}
	
	public static String toBinaryString(int value) {
		String strValue =Integer.toBinaryString(value);
		System.out.println("2�������� ��ȯ�� ���ڿ�����:"+strValue.length());
		while(strValue.length()<=32) {
			strValue="0"+strValue;
		}
		return strValue;
	}
}
