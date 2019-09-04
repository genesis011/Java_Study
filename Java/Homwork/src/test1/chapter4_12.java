package test1;

public class chapter4_12 {

	@SuppressWarnings("unused")
	private static int i;

	public static void main(String[] args) {
		double result = 0.0;
		double max=0.0;
		double[] scores = { 1.0, 2.0, 3.0, 4.0 };
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
			result += scores[i];
		}
		System.out.println("\n합은 " + result);
		
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i])
				max = scores[i];

		}
		System.out.println("최대 값 " +max );
	}
}
