package array;

import java.util.Arrays;

public class A1_4Test2 {

	public static void main(String[] args) {
		final int INDEX = 10;
		int[] s = new int[INDEX];
		inputIntArray(s);
		int minimum = s[0];
		int minimum1 = s[0];
		for (int i = 0; i < s.length; i++) {
			if (minimum > s[i])
				minimum = s[i];
			if (minimum1 < s[i])
				minimum1 = s[i];
		}
		System.out.println(Arrays.toString(s));
		System.out.println("�ּ� ����" + minimum + "�Դϴ�.");
		System.out.println("�ִ� ����" + minimum1 + "�Դϴ�.");
	}

	public static void inputIntArray(int[] s) {
		for (int i = 0; i < s.length; i++) {
			s[i] = (int) (Math.random() * (50 - 10 + 1) + 10);
		}
		return;
	}
}
