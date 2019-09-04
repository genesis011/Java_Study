package chapter14.trycatch;

public class BadIndex9 {

	public static void main(String[] args) {
		try {
			someMethod();
			System.out.print("A");
		} catch (Exception ex) {
			System.out.print("B");
		} finally {
			System.out.print("C");
		}
		System.out.print("D");
	}
	public static void someMethod() {
	}
}
