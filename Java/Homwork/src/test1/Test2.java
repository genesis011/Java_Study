package test1;

import java.util.Scanner;

public class Test2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int num = 0;
		String value = null;
		Scanner input = new Scanner(System.in);		
		System.out.print("2�������� ��ȯ�� �� :");
		num = input.nextInt();		
		value = fac(num);		
		System.out.println(value);
	}

	public static String fac(int num) {		
		String value = null;
		value = Integer.toBinaryString(num);
		while (value.length() < 16) {
			value = "0" + value;
		}
		return value;
	}
}
