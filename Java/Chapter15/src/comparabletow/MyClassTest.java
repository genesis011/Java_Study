package comparabletow;

public class MyClassTest {

	private static final int Value = 0;

	public static void main(String[] args) {
		MyClass[] mc = { new MyClass(1, "±è±æµ¿"), new MyClass(2, "Àå±æµ¿"), new MyClass(3, "È«±æµ¿") };// °´Ã¼¹è¿­

		MyClass mc1 = MyMethod.getMax(mc);

		System.out.println(mc1);
	}
}
