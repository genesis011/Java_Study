package chapter14.trycatch;

public class BadIndex10 {

	public static void main(String[] args) {
		try {
			int x = 0;
			int y = 5 / x;
		} catch (ArithmeticException ae) {
			System.out.println("Exception");

		} catch (Exception e) {
			System.out.println(" Arithmetic Exception");
		}
		System.out.println("finished");
	}
}