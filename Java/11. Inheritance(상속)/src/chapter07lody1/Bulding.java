package chapter07lody1;

public class Bulding  extends Bomb{
	public Bulding() {
		super();
	}
	@Override
	public void bomb() {
		System.out.println("건물이 무너지고 있습니다.");
	}
	public static void sbomb() {
		System.out.println("Bulding static");
	}
}
