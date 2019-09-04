package homework2;

import java.util.Scanner;

public class A1_19 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String[] arr = new String[10];

		int[] num = new int[10];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "¹øÂ°- : ");
			num[i] = scan.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			arr[i] = ((i * 10) + 1) + "-" + ((i + 1) * 10) + ":";
		}

		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++)
				if ((i * 10) + 1 <= num[j] && num[j] <= (i + 1) * 10)
					arr[i] += "*";
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
	}
}
