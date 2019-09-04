package array2;

public class A1_CommandLineTest {

	public static void main(String[] args) {
		//
		for (String str : args) {
			if (str.equals("-h")) {
				System.out.println("help");
			} else {
				System.out.println(str);
			}
		}
	}
}
