package homework2;

public class A1_20 {
	public static void main(String[] args) {
		int count2 = 0;
		System.out.print("2부터 100사이 모든 소수  : ");
		for (int i = 2; i <= 100; i++) {
			count2 = 0;
			for (int k = 2; k < i - 1; k++) {
				if ((i % k) == 0) {
					count2++;
					break;
				}
			}
			if (count2 == 0)
				System.out.print(" " + i);
		}
	}

}
