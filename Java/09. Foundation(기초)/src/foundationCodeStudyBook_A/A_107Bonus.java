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
		System.out.print("������ �Է��Ͻÿ� : ");
		mySales=input.nextInt();
		if(mySales>=targetSales) {
			result="���� �޼�";
			bonus=(mySales-targetSales)/10;
		}else {
			result="���� �޼� ����";
			bonus=0;
		}
		System.out.println(result+"\n"+"���ʽ�"+bonus);
	}

}
