package chapter14.trycatch;

public class BadIndex11 {

	public static void main(String[] args) {
		sub();
	}
	public static void sub() {
		int[] array = new int[10];
		int i = array[10];
	}
}