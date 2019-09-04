package homework1;

public class C9_Sum {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 || i % 4 == 0)
				sum += i;
		}
		System.out.println("гую╨ " + sum);
	}
}
