package foundationCodeStudyBook_A;

import java.util.Scanner;

public class A_110Grading { //학점 : Grades

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = 0; // 점수
		System.out.print("성적을 입력하시오 : ");
		score = input.nextInt();
		if (score >= 90)
			System.out.println("A 학점");
		else if (score >= 80)
			System.out.println("B 학점");
		else if (score >= 70)
			System.out.println("C 학점");
		else if (score >= 60)
			System.out.println("D 학점");
		else
			System.out.println("F 학점");
	}
}
