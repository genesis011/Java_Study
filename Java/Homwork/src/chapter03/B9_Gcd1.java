package chapter03;

import java.util.Scanner;

public class B9_Gcd1 {

	public static void main(String[] args) {
		// x�� y�� ���� �Է¹޴´�1~100
		int x = inputValue();
		int y = inputValue();
		int temp = 0;
		// 2. x,y���� ��Ұ����Ѵ�.(ū�� : x, ���� �� : y
		if (x < y) {
			temp = x;
			x = y;
			y = temp = 0;
		}
		// 3. �ִ� �����
		while (true) {
			if (y == 0) {
				System.out.println("�ִ� ������� " + x);
				break;
			} else {
				temp = x % y;
				x = y;
				y = temp;
			}
		}
	}
	@SuppressWarnings("resource")
	public static int inputValue() {
		int value = 0;
		do {	
			Scanner scan = new Scanner(System.in);
			System.out.println("1~100���� ���� �Է� ���: ");
			value =scan.nextInt();
		} while (value < 1 || value > 100);
		return value;
	}
}
