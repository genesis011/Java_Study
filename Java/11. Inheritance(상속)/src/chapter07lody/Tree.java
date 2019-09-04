package chapter07lody;

public class Tree extends Bomb {
	
	public Tree() {
		super(); //부모 생성자를 부르고 있다.
	}

	@Override
	public void bomb() {
		System.out.println("Tree bomb() function");
	}
}
