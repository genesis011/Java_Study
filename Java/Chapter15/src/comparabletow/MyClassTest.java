package comparabletow;

public class MyClassTest {

	private static final int Value = 0;

	public static void main(String[] args) {
		MyClass[] mc = { new MyClass(1, "��浿"), new MyClass(2, "��浿"), new MyClass(3, "ȫ�浿") };// ��ü�迭

		MyClass mc1 = MyMethod.getMax(mc);

		System.out.println(mc1);
	}
}
