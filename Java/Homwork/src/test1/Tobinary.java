package test1;

import java.util.Scanner;

public class Tobinary {

	public static void main(String[] args) {
		int num = 0;// ��ĵ���� ���� ����
		num = scan(); //������ ��ĵ���� ���� ���� ����
		tobinary(num); //�Լ��� �ҷ��� ���ڸ� ������ ���ڿ��� �ٲ㼭 ���

	}

	@SuppressWarnings("resource")
	public static int scan() {
		Scanner input = new Scanner(System.in); //��ĳ�ʸ� ���� 
		System.out.print("2�������� ��ȯ�� ���� �Է��Ͻÿ� : ");// �Է� �� ���
		int value = input.nextInt();//�Է� ���� ���� ����
		return value; //�Է� ���� ���� ������ ������ ����
	}

	public static void tobinary(int num) {
		String str = Integer.toBinaryString(num); //�Է� ���� ���ڸ� �Լ��� ����ؼ� ������ ���ڿ��� ��ȯ �� ������ ����
		while (str.length() < 16) { //16�ڸ� ���� 0�� ��� �ؾ� �ϹǷ� �ݺ����� ����
			str = "0" + str; // ���������� �ٲ� ���ڿ��� �տ��ٰ� 0�� �����ش�. 1001 -> 01001
		}
		
		System.out.println("2�������� ��ȯ�� ���� " + str);
	}

}
