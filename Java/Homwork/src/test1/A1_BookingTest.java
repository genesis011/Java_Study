package test1;

import java.util.Arrays;
import java.util.Scanner;

public abstract class A1_BookingTest {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// 1. �迭 �����Ѵ�(10��)
		final int COUNT = 10;
		int[] seat = new int[COUNT]; // {};
		// 2. �迭�� ����ڷ� ���� �Է¹޾Ƽ� �ʱ�ȭ�Ѵ�.
		inputArrayValue(seat);
		seatPrint(seat);
		for (;;) {
			// 4. �¼���ȣ ������ �޴´�.
			int index = inputBookIndex();
			// 5. �¼� ���� ��ȣ�� �Ǿ��ִ��� Ȯ��
			if (seat[index - 1] == 1) {
				System.out.print("�̹� ���� �Ǿ����ϴ�. �ٽ� �Է����ּ��� : ");
				continue;
			} else {
				seat[index - 1] = 1;
				System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
				seatPrint(seat);
			}
		}
	}

	public static void inputArrayValue(int[] seat) {
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
	}

	public static void seatPrint(int[] seat) {
		// 3. ����Ѵ�.
		System.out.println(Arrays.toString(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
		System.out.println(Arrays.toString(seat));
		return;
	}
}
