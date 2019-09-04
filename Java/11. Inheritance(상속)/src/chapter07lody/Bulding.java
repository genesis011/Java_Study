package chapter07lody;

public class Bulding  extends Bomb{
	
	public Bulding() {
		super(); //부모 생성자를 부르고 있다.
	}
	@Override
	public void bomb() {
		System.out.println("bulding bomb() function");
	}
}
