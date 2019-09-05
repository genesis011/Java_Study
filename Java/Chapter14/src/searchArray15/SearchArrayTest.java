package searchArray15;

import java.util.Scanner;

public class SearchArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int data = sc.nextInt();
		try {
			searchArray(a, data);
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
	}
	public static int searchArray(int array[], int data) throws NotFoundException {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == data)
				return i;
		}
		throw new NotFoundException();
	}
}
