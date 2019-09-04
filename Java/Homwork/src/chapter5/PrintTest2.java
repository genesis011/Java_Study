package chapter5;

public class PrintTest2 {

	public static void main(String[] args) {
		String x = "abc";
		x.toUpperCase();
		String y = x.replace('a', 'd');
		y = y + "xyz";
		System.out.println(y);
	}
}
