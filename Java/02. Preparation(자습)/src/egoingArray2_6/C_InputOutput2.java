package egoingArray2_6;

import java.util.Scanner;

public class C_InputOutput2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			System.out.println(sc.nextInt() * 1000);
		}
		sc.close();
	}
}
