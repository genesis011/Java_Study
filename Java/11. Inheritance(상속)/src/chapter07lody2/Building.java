package chapter07lody2;

public class Building  extends Bomb{
	public Building() {
		super();
	}
	public void bomb() {
		System.out.println("건물이 무너지고 있습니다");
	}
	
	public static void sbomb() {
		System.out.println("Building");
	}
}
