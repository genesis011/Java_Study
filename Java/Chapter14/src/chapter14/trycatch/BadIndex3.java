package chapter14.trycatch;

public class BadIndex3 {
	public static final int NO;
	static {
		NO = 10;
	}

	public static void main(String[] args) {
//		int[] array = new int[NO];
//		for (int i = 0; i < array.length; i++) {
//			array[i] = i;
//		}

		try {
			int n = Integer.parseInt("abc");
			System.out.println("try");
		} catch (NumberFormatException e) {
			System.out.println("숫자 형식 오류");
		} finally {
			System.out.println("finally");
		}
	}
}
