package array;

import java.util.Arrays;

public class A1_4Test {

	public static void main(String[] args) {
		final int INDEX = 10;
		// 1. ������ �迭 Ĵü�� �����(s)10���� �����.
		int[] s = new int[INDEX];
		// 2. �������� 10~50���� �迭 ��ü�� �����Ѵ�.
		inputIntArray(s);
		// 3. ù��° �迭 ��ü��� ���� minimum������ �����Ѵ�.
		int minimum = s[0];
		// 4. ��� �迭��ü ��Ҹ� ���ʴ�� ���Ͽ� ���� �����Ѵ�.
		for (int i = 0; i < s.length; i++) {
			if (minimum > s[i])
				minimum = s[i];
			// 5.�ּ� ���� ����Ѵ�.
		}
		System.out.println(Arrays.toString(s));
		System.out.println("�ּ� ����" + minimum+"�Դϴ�.");
	}

	public static void inputIntArray(int[] s) {
		for (int i = 0; i < s.length; i++) {
			s[i] = (int) (Math.random() * (50 - 10 + 1) + 10);
		}
		return;
	}
}
