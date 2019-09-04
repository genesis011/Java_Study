package test1;

import java.util.Arrays;
import java.util.Scanner;

public abstract class A1_BookingTest {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// 1. 배열 선언한다(10개)
		final int COUNT = 10;
		int[] seat = new int[COUNT]; // {};
		// 2. 배열을 사용자로 부터 입력받아서 초기화한다.
		inputArrayValue(seat);
		seatPrint(seat);
		for (;;) {
			// 4. 좌석번호 예약을 받는다.
			int index = inputBookIndex();
			// 5. 좌석 예약 번호가 되어있는지 확인
			if (seat[index - 1] == 1) {
				System.out.print("이미 예약 되었습니다. 다시 입력해주세요 : ");
				continue;
			} else {
				seat[index - 1] = 1;
				System.out.println("예약이 완료 되었습니다.");
				seatPrint(seat);
			}
		}
	}

	public static void inputArrayValue(int[] seat) {
		System.out.print("배열 : ");
		int intValue = scan.nextInt();
		for (int i = 0; i < seat.length; i++) {
			seat[i] = intValue;
		}
		return;
	}

	public static int inputBookIndex() {
		int index = 0;
		for (;;) {
			System.out.print("좌석 예약(1~10)을 하세요(종료는 -1) : ");
			index = scan.nextInt();
			if (index == -1) {
				System.out.println("안녕히 가세요.");
				System.exit(0);
			}
			if (index >= 1 && index <= 10)
				break;
			System.out.println("다시 입력하시오");
			// if (index <= 0 || index > 10) {
			// if (index == -1)
			// System.exit(0);
			// continue;
		}
		return index;
	}

	public static void seatPrint(int[] seat) {
		// 3. 출력한다.
		System.out.println(Arrays.toString(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
		System.out.println(Arrays.toString(seat));
		return;
	}
}
