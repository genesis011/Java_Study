package a15_12RandomTeest;

public class RandomTest {

	public static void main(String[] args) {
		RandomList<String> random = new RandomList<String>();
		random.add("¼º¹Î");
		random.add("°ø¹Î");
		random.add("À¯¹Î");
		System.out.println(random.getObj());
		System.out.println("--------");
		random.iteratorPrint();
	}

}
