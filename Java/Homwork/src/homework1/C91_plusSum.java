package homework1;

public class C91_plusSum {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			for (int k = 0; k <= i; k++) {
				sum += i;
			}
		}
		System.out.println("гую╨ " + sum);
	}
}
