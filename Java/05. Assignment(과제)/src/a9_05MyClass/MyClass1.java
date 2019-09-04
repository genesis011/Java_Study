package a9_05MyClass;

public class MyClass1 {
	interface A {
		public float mA(int a);
	}

	interface B extends A {
		public int mB(int a);

		public Object mBB(int a);
	}

	class C {
		public void mC(int a) {
			System.out.println("æ»≥Á«œººø‰");
		}
	}

	public abstract class MyClass extends C implements B {

	}
}
