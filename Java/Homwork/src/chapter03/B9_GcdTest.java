package chapter03;

import java.util.Scanner;

public class B9_GcdTest {


	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		int x=0,y=0,r=0;
		int i=1;
		System.out.printf("1~100���� ���� �Է��Ͻÿ�(ū��: ������:) : ");
		Scanner scan=new Scanner(System.in);
		for(i=2;i<10;i++) {
			x= scan.nextInt();
			y= scan.nextInt();
			
			while(true) {
				if(y==0) {
					System.out.println("�ִ� �������"+x);
					break;
				}else {
					r=x%y;
					x=y;
					y=r;
				}
			}
			System.out.println("�ٽ� �Է����ּ���");
			return;
		}
		
	}

}
