package capter5;

import java.util.Scanner;

public class StringTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String str =null;
		Scanner scanner= new Scanner(System.in);
		System.out.print("����Ʈ�� �Է��Ͻÿ� : ");
		str = scanner.nextLine();
		if(str.equals("quit")) {
			System.exit(0);
			
		}else if(str.matches("^www\\.(.+)$")){
			System.out.println("ù �ܾ www.�� �Է��ϼ̽��ϴ�.");
		}else {
			System.out.println("ù �ܾ www.~ ��������");
		}

	}

}
