package a9_04Dove;

abstract class Bird {
	abstract void sound();
}
class Dove extends Bird {
	void sound() {
		System.out.println("coo coo");
	}
}
public class DoveTest {
	public static void main(String[] args) {
		Dove d = new Dove();
		d.sound();
	}
}
