package test1;

import java.util.Scanner;

public class A1_test {
		//1.�������
		static Scanner scan = new Scanner(System.in);//���� �������
		public final int COUNT = 10;
		public int[] seat = new int[COUNT]; // {};
		//2.����Լ�
		public void inputArrayValue() {

			System.out.print("�迭 : ");
			int intValue = scan.nextInt();
			for (int i = 0; i < seat.length; i++) {
				seat[i] = intValue;
			}
			return;
		}
		public static int inputBookIndex() {
			int index = 0;
			for (;;) {
				System.out.print("�¼� ����(1~10)�� �ϼ���(����� -1) : ");
				index = scan.nextInt();
				if (index == -1) {
					System.out.println("�ȳ��� ������.");
					System.exit(0);
				}
				if (index >= 1 && index <= 10)
					break;
				System.out.println("�ٽ� �Է��Ͻÿ�");
				// if (index <= 0 || index > 10) {
				// if (index == -1)
				// System.exit(0);
				// continue;
			}
			return index;
		//}
		//3.������ �Լ�
		//public A1_test(int init) {
		//	for(int i=0;i<seat.length;i++) {
		///		seat[i]=init;
		//	}
		//}
		///public A1_test(int init) {
			
		//}
	}

}
