package foundationFunsionStudy_B;

public class Numbering_D {

	public static void main(String[] args) {
		numbering(5); // variable(변하기 쉬운)
	}

	public static void numbering(int limit) { // limit(한도)
		int i = 0;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}
}
