package test1;

import java.util.Arrays;

public class Test_160 {

	public static void main(String[] args) {
		final int INDEX = 10;
		int[] s = new int[INDEX];
		inputIntArray(s);
		int maxmum = searchMaxValue(s);

		System.out.println(Arrays.toString(s));
		System.out.println("�ִ밪" + maxmum);
	}

	public static void inputIntArray(int[] s) {
		for (int i = 1; i < s.length; i++) {
			s[i] = (int) ((Math.random() * 20 - 10 + 1) + 10);
		}
		return;
	}

	public static int searchMaxValue(int[] s) {
		int maxmum = s[0];
		for (int i = 1; i < s.length; i++) {
			if (maxmum < s[i])
				maxmum = s[i];
		}
		return maxmum;
	}
}
