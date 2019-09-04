package homework1;

import java.util.Scanner;

public class C94_Text {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		String s, S;
		Scanner scan = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		s = scan.next();
		char c = s.charAt(0);
		switch (c) {
		case 'a': case 'i': case 'o': case 'u': case 'e':
		case 'A': case 'I': case 'O': case 'U': case 'E':
			System.out.println("모음입니다.");
			break;
		default:
			System.out.println("자음입니다.");
		}
	}
}
