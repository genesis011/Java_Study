package chapter07Base;

class Base{
	public Base() {
		System.out.println("Base() ������");
	}
}

class Derived extends Base{
	public Derived() {
		System.out.println("Derived() ������");
	}
}

public class BaseTest {

	public static void main(String[] args) {
		Derived r=new Derived();
	}
}
