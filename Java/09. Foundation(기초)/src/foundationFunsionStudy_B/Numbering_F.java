package foundationFunsionStudy_B;

public class Numbering_F {
	public static void main(String[] args) {
		String result = numbering(2, 5); //메소드 numbering이 리던한 값이 변수 result에 감긴다.
		System.out.println(result); // 변수 result의 값을 화면에 출력한다.
	}

	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while (i < limit) {
			output += " " + i; //숫자를 화면에 출력하는 대신 변수 output에 담았다.
			i++;
		}// 중요!!! output에 담겨있는 문자열을 메소드 외부로 반환하려면 아래와 같이 result배치하면된다.
		return output;
	}
}
