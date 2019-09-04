package chapter07lody2;

public class Car extends Bomb{
	public Car() {
		super();
	}
	@Override
	public void bomb() {
		System.out.println("차가 폭발합니다.");
	}
	public static void sbomb() {
		System.out.println("Car static");
	}
}
