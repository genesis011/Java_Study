package outerclass;

public class OuterClass {
	//1. 멤버변수(정적멤버변수, 인스턴스 멤버변수)
	private int age;
	private static int sage;
	//2. 멤버내부클래스 (정적내방클래스, 비정적내장클래스)
	static class StaticClass{
		//멤버변수, 멤버함수, 생성자
	
		public StaticClass() {
			//age=10;//인스턴스 멤버변수 사용못함
			sage=20;
//			InnerClass innerClass=new InnerClass();//인스턴스 내부 클래스는 사용못함
			StaticClassB staticClass=new StaticClassB();
		}
		public void innerMyMethod() {
			
		}
	}
	static class StaticClassB{
		public StaticClassB() {
			sage=20;
		}
	}
	
	class InnerClassB{
		public InnerClassB() {
			age=10;
			sage=20;
		}
		
	}
	class InnerClass{
		//멤버변수, 멤버함수, 생성자
		public InnerClass() {
			age=10;
			sage=20;
			StaticClass StaticClass=new StaticClass();
			InnerClassB innerClassB= new InnerClassB();
		}
		public void innerMyMethod() {
			age=30;sage=40;
			System.out.println("InnerClass age="+age+"sage"+sage);
		}
	}
	//2. 생성자 함수 (오버로딩)
	public OuterClass() {
		this(0);
	}
	public OuterClass(int age) {
		
	}
//		public void myMethod() {
//			System.out.print("외부 클래스의 private의 변수 값:"+value);
//		}
//	}
//	OuterClass(){
//		InnerClass obj=new InnerClass();
//		obj.myMethod();
//	}
}
