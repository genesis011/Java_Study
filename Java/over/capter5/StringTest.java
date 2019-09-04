package capter5;

import java.util.Scanner;

public class StringTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String str =null;
		Scanner scanner= new Scanner(System.in);
		System.out.print("사이트를 입력하시오 : ");
		str = scanner.nextLine();
		if(str.equals("quit")) {
			System.exit(0);
			
		}else if(str.matches("^www\\.(.+)$")){
			System.out.println("첫 단어를 www.로 입력하셨습니다.");
		}else {
			System.out.println("첫 단어를 www.~ 정신차려");
		}

	}

}
