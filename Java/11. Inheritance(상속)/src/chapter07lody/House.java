package chapter07lody;

public class House extends Bomb{
	public House() {
		super(); //부모 생성자를 부르고 있다.
	}
	
	@Override
	public void bomb() {
		System.out.println("House bomb() function");
	}
}
