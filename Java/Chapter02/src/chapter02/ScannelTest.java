package chapter02;

import java.util.Scanner;

public class ScannelTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ����ڷκ��� �Է¹޴� ���
		//1. Scanner��ĳ�� ��ü�� �����.
		//2. ���ڿ�(nextLine), ���ڴܾ�(next), ���� ��(nextInt), �Ǽ� ��nextDouble, �ο� ��nextBoolean
		Scanner leeScanner=new Scanner(System.in);
		System.out.printf("����� �̸��� �Է��Ͻÿ� : ");
		String name=leeScanner.nextLine();
		System.out.println("����� �̸��� "+name+"�Դϴ�.\n");
		System.out.printf("����� ���̸� �Է��Ͻÿ� : ");
		int age=leeScanner.nextInt();
		System.out.println("����� ���̴�"+age+"�Դϴ�.");
	}

}
