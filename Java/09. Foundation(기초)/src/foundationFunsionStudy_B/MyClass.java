package foundationFunsionStudy_B;

public class MyClass {
	
	public void method() {
		System.out.println("method1�� ����˴ϴ�.");
	}

	public void method2(int x) {
		System.out.println(x + " �� �̿��ϴ� method2�Դϴ�.");
	}

	public int method3() {
		System.out.println("method3�� ����˴ϴ�.");
//�� �޼ҵ尡 ����Ǹ�, �ֿܼ� 'method3�� ����˴ϴ�.' �� ����ϰ�, �� �޼ҵ带 ȣ���� �ʿ� 10�� �����Ѵ�.
		return 10;

	}

	public void method4(int x, int y) {
		System.out.println(x + "," + y + " �� �̿��ϴ� method4�Դϴ�.");
	}

	public int method5(int y) {
		System.out.println(y + " �� �̿��ϴ� method5�Դϴ�.");
		return 5;
	}
}
