package a_07;

class A {
	public void f(A a) {
		System.out.print("fa(A) ");
	}

	public void f(B b) {
		System.out.print("fa(B) ");
	}
}

class B extends A {
	public void f(A a) {
		System.out.print("fb(A) ");
	}

	public void f(B b) {
		System.out.print("fb(B) ");
	}
}

public class Test_7 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A ba = (A) b;
		a.f(a);
		a.f(b);
		b.f(a);
		b.f(b);
		a.f(ba);
		b.f(ba);
		ba.f(a);
		ba.f(b);
		ba.f(ba);
	}
}
