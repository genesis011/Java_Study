package chapter5;

public class Calculation2 {

	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(double a, double b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Calculation2 obj = new Calculation2();
		obj.sum(1.12, 2.25);
		obj.sum(10, 20);
	}
}
