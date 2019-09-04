package chapter14.trycatch;

public class BadIndex {
	public static final int NO;
	static { NO = 10;}

	public static void main(String[] args) {
		int[] array = new int[NO];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		int result;
		try{
		result = array[12]; //5를 입력하면 1번 3번 4번 출력
		System.out.println("1. 프로그램 진행중입니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			result = array[9];
			System.out.println("2. 잘했어요 결과 값은"+result);
		}finally {
			System.out.println("3. 프로그램이 완료 되었습니다.");
		}
		System.out.println("4. 과연 이 문장이 실행이 될까요?"+result);
	}

}
