package a16_8OutTest;

public class Test {
	public static void main(String[] args) {
		Thread t = new Thread(new Job());
		t.start();
	}
}
