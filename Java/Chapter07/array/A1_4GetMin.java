package array;

public class A1_4GetMin {

	public static void main(String[] args) {
		int[] s = { 12, 3, 19, 6, 18, 8, 12, 4, 1, 19 };
		int minimum = 0;
		int minimum1 = 0;
		minimum = s[0];
		for (int i = 1; i < s.length; i++) {
			if (s[i] < minimum)
				minimum = s[i];
			if (s[i] > minimum1)
				minimum1 = s[i];
			System.out.println("�ּҰ��� " + minimum + "�Դϴ�.");
			System.out.println("���ִ밪�� " + minimum1 + "�Դϴ�.");
		}
	}
}
