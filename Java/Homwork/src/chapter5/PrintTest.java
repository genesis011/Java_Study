package chapter5;

public class PrintTest {

	public static void main(String[] args) {
		String a = "javaprogramming";
		a = a.substring(5, 7);
		char b = a.charAt(1);
		a = a + b;
		System.out.println(a);
	}
}
