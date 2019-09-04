package chapter14.trycatch;

public class BadIndex8 {

	public static void throwit() {
		System.out.print("A ");
		throw new RuntimeException();
	}

	public static void main(String[] args) {
		try {
			System.out.print("B ");
			throwit();
		} catch (Exception re) {
			System.out.print("C ");
		} finally {
			System.out.print("D ");
		}
		System.out.println("E ");
	}
}