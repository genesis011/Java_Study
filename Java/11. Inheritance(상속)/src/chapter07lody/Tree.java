package chapter07lody;

public class Tree extends Bomb {
	
	public Tree() {
		super(); //�θ� �����ڸ� �θ��� �ִ�.
	}

	@Override
	public void bomb() {
		System.out.println("Tree bomb() function");
	}
}
