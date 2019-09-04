package homework1;

import java.util.Scanner;

public class C92_PlusIfLElse {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		int x = 0, y = 0, z = 0, min = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		x = scan.nextInt();
		System.out.print("정수를 입력하세요");
		y = scan.nextInt();
		System.out.print("정수를 입력하세요");
		z = scan.nextInt();
		if (x < y) {
			if (x < z) {
				if (y < z)
					System.out.println(x + " " + y + " " + z);
				else
					System.out.println(x + " " + z + " " + y);
			} else {
				if (y < x)
					System.out.println(z + " " + y + " " + x);
				else
					System.out.println(z + " " + x + " " + y);
			}
		} else {
			if (y < z) {
				if (x < z)
					System.out.println(y + " " + x + " " + z);
				else
					System.out.println(y + " " + z + " " + x);
			} else {
				if (y < x)
					System.out.println(z + " " + y + " " + x);
				else
					System.out.println(z + " " + x + " " + y);
			}
		}
	}
}
