package chapter14.trycatch;

public class BadIndex4 {
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
			int[] array = new int[-10];
			System.out.println("try");
		} catch (NumberFormatException e) {
			System.out.println("숫자 형식 오류");
		} catch (NegativeArraySizeException e) {
			System.out.println("배열 크기 음수 오류");
		} catch (Exception e) {
			System.out.println("오류");
		}
	}
}
