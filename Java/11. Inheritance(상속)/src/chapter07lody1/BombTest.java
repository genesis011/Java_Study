package chapter07lody1;

public abstract class BombTest {

	public static void main(String[] args) {
		
		Bomb[] bomb= {new Car(), new House(), new Bulding(), new Tree()};
		for(int i=0;i<bomb.length;i++) {
			bomb[i].bomb();
			if(bomb[i] instanceof Bulding) {
				((Bulding)(bomb[i])).sbomb();
			}else if(bomb[i] instanceof Tree) {
				((Tree)(bomb[i])).sbomb();
			}else if(bomb[i] instanceof House) {
				((House)(bomb[i])).sbomb();
			}else if(bomb[i] instanceof Car) {
				((Car)(bomb[i])).sbomb();
			}
			
		}
	}
}
