package foundationFunsionStudy_B;

public class Total {

	public static void main(String[] args) {
		int total = 0;
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) { // 2로 나눈 나머지가 0이 아니라는것은 홀수를 의미한다.
				continue; // 홀수일 경우 total = total + i; 문장이 실행되지 않으므로, 결과적으로 짝수만 더해준다.
			}
			total = total + i;
		}
		System.out.println(total);
		for (int i = 1; i <= 100; i++) { // 1부터 100까지 반복하기 위한 for 반복문

			result = result + i; // 1부터 100까지 반복해서 total 변수에 값을 누적
		}
		System.out.println(result); // 결과값 출력
	}
}
