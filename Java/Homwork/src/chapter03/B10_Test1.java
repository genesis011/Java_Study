package chapter03;

public class B10_Test1 {

	public static void main(String[] args) {
		// 1.���Ǽ��� �Է��Ѵ�.

		int number = 0;
		for (int i = 0; i < 10; i++) {
			number = (int) (Math.random() * (200 - 100 + 1) + 100);
			toBinaryString(number);
		}

	}

	public static void toBinaryString(int number) {
		String strBinary = Integer.toBinaryString(number);
		while (strBinary.length() < 32) {
			strBinary = "0" + strBinary;
		}
		System.out.println(number + "������" + strBinary);
	}
}
