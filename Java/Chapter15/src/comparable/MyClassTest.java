package comparable;

public class MyClassTest {
	public static void main(String[] args) {
		MyClass<MyClass>mc1=new MyClass<MyClass>(10, "홍길동");
		MyClass<MyClass>mc2=new MyClass<MyClass>(20, "저길동");
		
		int value=mc1.compareTo(mc2);
		
		switch (value) {
		case 1:System.out.println(mc1.toString()+"큽니다"); break;
		case -1:System.out.println(mc2.toString()+"큽니다"); break;
		case 0:System.out.println(mc1.toString()+"같습니다."); break;

		default:System.out.println("정신차려");
			break;
		}
		MyClass[] mcArray={new MyClass<MyClass>(10, "홍길동"),
		
		new MyClass<MyClass>(10, "홍길동"),
		new MyClass<MyClass>(20, "홍길동"),
		new MyClass<MyClass>(30, "홍길동"),
		new MyClass<MyClass>(40, "홍길동"),
		};
		MyClass largeObject=MyArrayAlg.getMax(mcArray);
		System.out.println(largeObject+"가장 큰 객체입니다.");
		
		String[] strArray= {new String("김길동"),new String("하길동"),new String("장길동"),};
		String largeString=MyArrayAlg.getMax(strArray);
		System.out.println(largeObject+"가장 큰 객체입니다.");
	}
}
