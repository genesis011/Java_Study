package foundationCodeStudyBook_A;

import java.util.Scanner;

public class A_110Grading { //���� : Grades

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = 0; // ����
		System.out.print("������ �Է��Ͻÿ� : ");
		score = input.nextInt();
		if (score >= 90)
			System.out.println("A ����");
		else if (score >= 80)
			System.out.println("B ����");
		else if (score >= 70)
			System.out.println("C ����");
		else if (score >= 60)
			System.out.println("D ����");
		else
			System.out.println("F ����");
	}
}
