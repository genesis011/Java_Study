package myepception;

public class MyExceptionTest {

	public static void main(String[] args) {
		try {
			method1();
		} catch (MyException e) {
			
			e.printStackTrace();
		}
	}
	private static void method1() throws MyException {
		throw new MyException("잠깐만 조심하세요.");
	}
}
