package homework1;

public class C93_Dice {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int k = 1; k <= 6; k++) {
				if ((i + k) == 6)
					System.out.println("(" + i + "," + k + ")");
			}
		}
	}
}
