package chapter14.trycatch;

public class BadIndex2 {
	public static final int NO;
	static { NO = 10;}

	public static void main(String[] args) {
		int[] array = new int[NO];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		int result;
		try{
		result = array[12];
		System.out.println("1. 프로그램 진행중입니다.");
		} finally {
			System.out.println("Ending부분에 꼭 표현하고 싶다면...");
		}
	}
}
