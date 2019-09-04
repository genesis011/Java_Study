package chapter03;

import java.util.Scanner;

public class B3_Bonus {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		final int targetSalse=1000;
		int mySalse=0;
		int bonus=0;
		String result;
		
		Scanner input=new Scanner(System.in);
		System.out.println("실적을 입력하시오 : ");
		mySalse=input.nextInt();
		
		if(mySalse>=targetSalse) {
			result="실적 달성";
			bonus= (int) ((mySalse-1000)*0.1);
		}
		else{
			result="실적 달성 못함";
			bonus=mySalse-1000;
		}
		System.out.println(result+"\n"+bonus);
	}
	
}
