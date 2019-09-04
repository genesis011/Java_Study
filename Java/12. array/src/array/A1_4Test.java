package array;

import java.util.Arrays;

public class A1_4Test {

	public static void main(String[] args) {
		final int INDEX = 10;
		// 1. 정수형 배열 캑체를 만든다(s)10개를 만든다.
		int[] s = new int[INDEX];
		// 2. 랜덤으로 10~50까지 배열 객체를 저장한다.
		inputIntArray(s);
		// 3. 첫번째 배열 객체요소 값을 minimum값으로 저장한다.
		int minimum = s[0];
		// 4. 모든 배열객체 요소를 차례대로 비교하여 값을 수정한다.
		for (int i = 0; i < s.length; i++) {
			if (minimum > s[i])
				minimum = s[i];
			// 5.최소 값은 출력한다.
		}
		System.out.println(Arrays.toString(s));
		System.out.println("최소 값은" + minimum+"입니다.");
	}

	public static void inputIntArray(int[] s) {
		for (int i = 0; i < s.length; i++) {
			s[i] = (int) (Math.random() * (50 - 10 + 1) + 10);
		}
		return;
	}
}
