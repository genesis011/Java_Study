package chapter07lody1;

public class Car extends Bomb{
	public Car() {
		super();
	}
	@Override
	public void bomb() {
		System.out.println("���� �����մϴ�.");
	}
	public static void sbomb() {
		System.out.println("Car static");
	}
}
