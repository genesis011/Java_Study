package array;

public class A1_6RollDice {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		final int SIZE = 6;
		int freq[] = new int[SIZE];

		for (int i = 0; i < 10000; i++) {
			++freq[(int) (Math.random() * SIZE)];

			System.out.println("==================");
			System.out.println("¸é  ºóµµ");
			System.out.println("==================");

			for (int i1 = 0; i1 < SIZE; i1++)
				System.out.println("" + (i1 + 1) + "" + freq[i1]);
			//break;
		}
		return;
	}
}
