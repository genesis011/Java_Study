package chapter07lody2;

public abstract class BombTest {

	public static void main(String[] args) {
		Bomb[] bomb = { new Tree(), new House(), new Building(), new Car() };
		for (int i = 0; i < bomb.length; i++) {
			bomb[i].bomb();
			if (bomb[i] instanceof Building) {
				((Building) (bomb[i])).sbomb();
			} else if (bomb[i] instanceof Tree) {
				((Tree) (bomb[i])).sbomb();
			} else if (bomb[i] instanceof Car) {
				((Car) (bomb[i])).sbomb();
			} else if (bomb[i] instanceof House) {
				((House) (bomb[i])).sbomb();
			}
		}
	}
}
