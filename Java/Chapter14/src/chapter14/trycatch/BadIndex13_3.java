package chapter14.trycatch;
public class BadIndex13_3 {
	public static void main(String[] args) {
		sub();
	}
	public static void sub() {
		try {
		int[] array = new int[10];
		int i = array[10];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외처리");
		}
	}
}