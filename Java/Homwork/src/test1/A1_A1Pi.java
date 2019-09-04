package test1;

import java.util.Scanner;

public class A1_A1Pi {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double sum=0.0;
		boolean flag=true;
		double i=0.0;
		int num=0;
		Scanner input=new Scanner(System.in);
		System.out.printf("값을 입력하시오 : ");
		num=input.nextInt();

		for(i=1;i<=num;i+=2) {
			if(flag) {
				sum=sum+(double)4/i;	
			}else {		
				sum=sum-(double)4/i;
			}
			flag=!flag;
		}
		System.out.println(sum);
	}

}
