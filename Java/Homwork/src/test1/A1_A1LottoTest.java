package test1;

import java.util.Scanner;

public class A1_A1LottoTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//�ΰ��� ���� �Է¹޴´�.
		int n=9, k=0;
		long fact1=1,fact2=1;
		int i=0;
		Scanner scan=new Scanner(System.in);
		do {
			System.out.printf("�ζ� ���� ��ü���� ����");
			n=scan.nextInt();
			System.out.printf("�ζ� ���� ��ü���� ����");
			k=scan.nextInt();
		}while((n<1 || n>45)||(k<1 || k>45));
		
		//�ΰ��� ���� ������ ���հ��
		for(i=1;i<=k;i++) {
			fact1=fact1*(n-i+1);
			fact2=fact2*(i);
		}
		System.out.println("�ζ��� Ȯ����"+(fact1/fact2));
	}
}
