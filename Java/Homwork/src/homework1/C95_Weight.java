package homework1;

import java.util.Scanner;

public class C95_Weight {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double weight, stWeight, height;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ��� : ");
		height = scan.nextDouble();
		System.out.println("�����Ը� �Է��ϼ��� : ");
		weight = scan.nextDouble();
		stWeight = (height - 100) * 0.9;
		if (weight < stWeight)
			System.out.println("��ü���Դϴ�.");
		else if (weight == stWeight)
			System.out.println("ǥ���Դϴ�.");
		else
			System.out.println("��ü���Դϴ�.");
	}
}
