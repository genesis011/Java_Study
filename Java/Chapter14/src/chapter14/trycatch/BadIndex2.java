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
		System.out.println("1. ���α׷� �������Դϴ�.");
		} finally {
			System.out.println("Ending�κп� �� ǥ���ϰ� �ʹٸ�...");
		}
	}
}
