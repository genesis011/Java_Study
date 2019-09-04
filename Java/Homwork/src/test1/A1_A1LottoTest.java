package test1;

import java.util.Scanner;

public class A1_A1LottoTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//두개의 수를 입력받는다.
		int n=9, k=0;
		long fact1=1,fact2=1;
		int i=0;
		Scanner scan=new Scanner(System.in);
		do {
			System.out.printf("로또 복권 전체수의 개수");
			n=scan.nextInt();
			System.out.printf("로또 복권 전체수의 개수");
			k=scan.nextInt();
		}while((n<1 || n>45)||(k<1 || k>45));
		
		//두갸의 수를 가지고 조합경우
		for(i=1;i<=k;i++) {
			fact1=fact1*(n-i+1);
			fact2=fact2*(i);
		}
		System.out.println("로또의 확률은"+(fact1/fact2));
	}
}
