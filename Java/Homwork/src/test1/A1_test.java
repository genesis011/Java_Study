package test1;

import java.util.Scanner;

public class A1_test {
		//1.멤버변수
		static Scanner scan = new Scanner(System.in);//정적 멤버변수
		public final int COUNT = 10;
		public int[] seat = new int[COUNT]; // {};
		//2.멤버함수
		public void inputArrayValue() {

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
		//}
		//3.생성자 함수
		//public A1_test(int init) {
		//	for(int i=0;i<seat.length;i++) {
		///		seat[i]=init;
		//	}
		//}
		///public A1_test(int init) {
			
		//}
	}

}
