package foundationCodeStudyBook_A;

import java.util.Scanner;

public class A_107Bonus {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		final int targetSales=1000;
		int mySales;
		int bonus;
		String result;
		System.out.print("실적을 입력하시오 : ");
		mySales=input.nextInt();
		if(mySales>=targetSales) {
			result="실적 달성";
			bonus=(mySales-targetSales)/10;
		}else {
			result="실적 달성 못함";
			bonus=0;
		}
		System.out.println(result+"\n"+"보너스"+bonus);
	}

}
