package chapter14.trycatch;
public class BadIndex13 {
	public static void main(String[] args) {
		sub();
	}
	public static void sub() throws ArrayIndexOutOfBoundsException {
		int[] array = new int[10];
		int i = array[10];
	}
}