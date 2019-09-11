package a16_7OutTest;

public class Test {
	private int count = 1;

	public synchronized void sub() {
		for (int i = 0; i < 10; i++)
			System.out.print(count++);
	}

	public static void main(String[] args) {
		Test demo = new Test();
		Thread a1 = new A(demo);
		Thread a2 = new A(demo);
		a1.start();
		a2.start();
	}
}

class A extends Thread {
	Test demo;

	public A(Test td) {
		demo = td;
	}

	public void run() {
		demo.sub();
	}
}