package a9_23Game;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int user, com;
		System.out.println("하나를 선택 할 것 : 가위(0), 바위(1), 보(2) :");

		user = s.nextInt();
		com = r.nextInt(3);
		if (com == 0)
			System.out.println("컴퓨터는 가위(0)를 냈습니다.");
		else if (com == 1)
			System.out.println("컴퓨터는 바위(1)를 냈습니다.");
		else
			System.out.println("컴퓨터는 보(2)를 냈습니다.");
		if (user == 0) {
			if (com == 1)
				System.out.println("컴퓨터가 이겼습니다.");
			else if (com == 2)
				System.out.println("당신이 이겼습니다.");
			else
				System.out.println("비겼습니다.");
		}
		else if (user == 1) {
			if (com == 0)
				System.out.println("당신이 이겼습니다.");
			else if (com == 2)
				System.out.println("컴퓨터가 이겼습니다.");
			else
				System.out.println("비겼습니다.");
		}
		else {
			if (com == 0)
				System.out.println("컴퓨터가 이겼습니다.");
			else if (com == 1)
				System.out.println("당신이 졌습니다.");
			else
				System.out.println("비겼습니다.");
		}
	}
}
