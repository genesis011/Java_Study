package aa12;

public class A {

	int s;

	void sub() {
		int x = 5;
		setDouble(x);
		System.out.print(x + " ");
		System.out.println(s);
	}

	void setDouble(int x) {
		x = x * 2;
		s = x;
	}
}
