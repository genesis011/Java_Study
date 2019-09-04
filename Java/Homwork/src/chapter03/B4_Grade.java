package chapter03;

import java.util.Scanner;

public class B4_Grade {

	public static void main(String[] args) {
		int score = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("이름을 입력하시오 :");
		String name = input.nextLine();
		System.out.println("점수를 입력하시오 :");
		score = input.nextInt();
		/*
		 * switch ((int) (score / 10)) { case 10: System.out.println(name+"A학점 입니다.");
		 * break; case 9: System.out.println(name+"A학점 입니다."); break; case 8:
		 * System.out.println(name+"b학점 입니다."); break; case 7:
		 * System.out.println(name+"C학점 입니다."); break; case 6:
		 * System.out.println(name+"D학점 입니다."); break; default:
		 * System.out.println(name+"재시험 대상입니다."); break; }
		 */

		if (score >= 90) {
			System.out.println(name + "A학점 입니다.");

		}else if (score >= 80) {
			System.out.println(name + "B학점 입니다.");
		}else if (score >= 70) {
			System.out.println(name + "C학점 입니다.");
		}else if (score >= 60) {
			System.out.println(name + "D학점 입니다.");
		}else {
			System.out.println(name + "F학점 입니다.");
		}
		
		
	}
}
