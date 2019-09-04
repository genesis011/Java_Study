package foundationCodeStudyBook_A;

public class A_120PrimeNumber { // 소수 : Decimal

	public static void main(String[] args) {
		int count = 0;
		System.out.println("2부터 100사이 모든 소수 : ");
		for (int i = 2; i <= 100; i++) {
			count = 0;
			for (int k = 2; k < i; k++) {
				if ((i % k) == 0) {
					count++;
					break;
				}
			}
			if (count == 0)
				System.out.println(" " + i);
		}
	}
}
