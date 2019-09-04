package foundationFunsionStudy_B;

public class MyClass {
	
	public void method() {
		System.out.println("method1이 실행됩니다.");
	}

	public void method2(int x) {
		System.out.println(x + " 를 이용하는 method2입니다.");
	}

	public int method3() {
		System.out.println("method3이 실행됩니다.");
//위 메소드가 실행되면, 콘솔에 'method3이 실행됩니다.' 를 출력하고, 이 메소드를 호출한 쪽에 10을 리턴한다.
		return 10;

	}

	public void method4(int x, int y) {
		System.out.println(x + "," + y + " 를 이용하는 method4입니다.");
	}

	public int method5(int y) {
		System.out.println(y + " 를 이용하는 method5입니다.");
		return 5;
	}
}
