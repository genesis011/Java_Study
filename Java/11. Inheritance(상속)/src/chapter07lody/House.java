package chapter07lody;

public class House extends Bomb{
	public House() {
		super(); //�θ� �����ڸ� �θ��� �ִ�.
	}
	
	@Override
	public void bomb() {
		System.out.println("House bomb() function");
	}
}
