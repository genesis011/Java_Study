package a_07A;

class A {
	public int myMethod(int a, int b) { //final이 오버라이드를 못하게 막는 역할을 한다.
		return 0;
	}
}

class B extends A {
	public int myMethod(int a, int b) {
		return 1;
	}
}

public class Test1 {
	public static void main(String args[]) {
		B b = new B();
		System.out.println("x = " + b.myMethod(0, 1));
	}
}