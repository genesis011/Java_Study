package a15_12RandomTeest;

public class RandomTest {

	public static void main(String[] args) {
		RandomList<String> random = new RandomList<String>();
		random.add("����");
		random.add("����");
		random.add("����");
		System.out.println(random.getObj());
		System.out.println("--------");
		random.iteratorPrint();
	}

}
