package foundationCodeStudyBook_A;

import java.util.Scanner;

public class A_118SmallNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, y, z, min;
		System.out.print("������ �Է��Ͻÿ� : ");
		x = scan.nextInt();
		System.out.print("������ �Է��Ͻÿ� : ");
		y = scan.nextInt();
		System.out.print("������ �Է��Ͻÿ� : ");
		z = scan.nextInt();
		if (x < y) {
			if (z < x)
				min = z;
			else
				min = x;
		} else {
			if (z < y)
				min = z;
			else
				min = y;
		}
		System.out.printf("���� ���� ������ %d�Դϴ�", min);
	}
}
