package a9_24Arrays;

import java.util.Scanner;
public class Sort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] a = { "the", "chiar", "is", "good", "product" };
		System.out.println("���ĵ� �ܾ�� ������ �����ϴ�.");
		Sort.Sort(a);
	}
	private static void Sort(String[] a) {		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
