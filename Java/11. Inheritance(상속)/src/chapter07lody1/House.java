package chapter07lody1;

public class House  extends Bomb{
	public House() {
		super();
	}
	@Override
	public void bomb() {
		System.out.println("집이 폭발합니다.");
	}
	public static void sbomb() {
		System.out.println("house static");
	}
}
