package comparabletow;

public class MyClassTest {

	private static final int Value = 0;

	public static void main(String[] args) {
		MyClass[] mc = { 
				new MyClass(1, "김길동"), 
				new MyClass(2, "장길동"), 
				new MyClass(3, "홍길동") };//MyClass[] 객체배열(대문자면)

		MyClass mc1 = MyMethod.getMax(mc);

		System.out.println(mc1);
	}
}
