package chapter03;

import java.util.Scanner;

public class B4_Grade {

	public static void main(String[] args) {
		int score = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("�̸��� �Է��Ͻÿ� :");
		String name = input.nextLine();
		System.out.println("������ �Է��Ͻÿ� :");
		score = input.nextInt();
		/*
		 * switch ((int) (score / 10)) { case 10: System.out.println(name+"A���� �Դϴ�.");
		 * break; case 9: System.out.println(name+"A���� �Դϴ�."); break; case 8:
		 * System.out.println(name+"b���� �Դϴ�."); break; case 7:
		 * System.out.println(name+"C���� �Դϴ�."); break; case 6:
		 * System.out.println(name+"D���� �Դϴ�."); break; default:
		 * System.out.println(name+"����� ����Դϴ�."); break; }
		 */

		if (score >= 90) {
			System.out.println(name + "A���� �Դϴ�.");

		}else if (score >= 80) {
			System.out.println(name + "B���� �Դϴ�.");
		}else if (score >= 70) {
			System.out.println(name + "C���� �Դϴ�.");
		}else if (score >= 60) {
			System.out.println(name + "D���� �Դϴ�.");
		}else {
			System.out.println(name + "F���� �Դϴ�.");
		}
		
		
	}
}
