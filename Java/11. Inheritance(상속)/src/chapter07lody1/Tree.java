package chapter07lody1;

public class Tree extends Bomb{

	public Tree() {
		super();
	}
	@Override
	public void bomb() {
		System.out.println("나무가 불타고 있습니다.");
	}
	public static void sbomb() {
		System.out.println("Tree static");
	}
}
