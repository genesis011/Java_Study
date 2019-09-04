package chapter07lody;

public class BombTest {

	public static void main(String[] args) {
		Bomb[] bomb= {new Bulding(), new Tree(), new House(), new Car() };
		for(int i=0;i<bomb.length;i++) {
			bomb[i].bomb();
			bomb[i].bomb2();
			if(bomb[i]instanceof Bulding) {
				((Bulding)bomb[i]).sbomb();
			}else if(bomb[i]instanceof Tree) {
				((Tree)bomb[i]).sbomb();
			}else if(bomb[i]instanceof House) {
				((House)bomb[i]).sbomb();
			}else if(bomb[i]instanceof Car) {
				((Car)bomb[i]).sbomb();
			}
//			bomb[i].sbomb();
			System.out.println("========");
		}
	}
}