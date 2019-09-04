package foundationFunsionStudy_B;

public class Numbering_E {

	public static void main(String[] args) {
		numbering(2, 9);
	}

	public static void numbering(int init, int limit) { //init(√ ±‚»≠)
		int i = init;
		while (i < limit) {
			System.out.println(" " + i);
			i++;
		}
	}
}
