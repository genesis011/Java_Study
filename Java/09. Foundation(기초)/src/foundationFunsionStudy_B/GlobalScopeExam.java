package foundationFunsionStudy_B;

public class GlobalScopeExam {
	int globalScope = 10;   // �ν��Ͻ� ���� 

    @SuppressWarnings("unused")
	public void scopeTest(int value, char[] localScpe){   
		int localScope = 10;
		System.out.println(globalScope);
		System.out.println(localScpe);
		System.out.println(value);
	}
}
