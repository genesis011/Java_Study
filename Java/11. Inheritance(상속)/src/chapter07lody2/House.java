package chapter07lody2;

public class House extends Bomb{
	public House() {
		super();
	}
	public void bomb() {
		System.out.println("집이 무너지고 있습니다");
	}
	
	public static void sbomb() {
		System.out.println("House");
	}
}
