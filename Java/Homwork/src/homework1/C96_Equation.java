package homework1;

public class C96_Equation {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			for (int k = 0; k <= 10; k++) {
				if ((3 * i + 10 * k) == 100)
					System.out.println("(" + i + "," + k + ")");
			}
		}
	}
}
