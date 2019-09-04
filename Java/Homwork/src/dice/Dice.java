package dice;

public class Dice {
	private int face;

	int roll() {
		int face = (int) (Math.random() * 6) + 1;
		return face;
	}
}
