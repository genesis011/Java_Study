package a9_23StrSort;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StrTSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0, i = 0;
		String[] ars = new String[100];
		System.out.println("문자열을 입력 : ");
		String str = s.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {
			ars[i] = st.nextToken();
			System.out.println(ars[i]);
			count++;
			i++;
		}
		System.out.println("모두 " + count + "개의 단어.");
	}
}
