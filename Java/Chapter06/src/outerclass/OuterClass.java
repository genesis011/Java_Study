package outerclass;

public class OuterClass {
	//1. �������(�����������, �ν��Ͻ� �������)
	private int age;
	private static int sage;
	//2. �������Ŭ���� (��������Ŭ����, ����������Ŭ����)
	static class StaticClass{
		//�������, ����Լ�, ������
	
		public StaticClass() {
			//age=10;//�ν��Ͻ� ������� ������
			sage=20;
//			InnerClass innerClass=new InnerClass();//�ν��Ͻ� ���� Ŭ������ ������
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
		//�������, ����Լ�, ������
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
	//2. ������ �Լ� (�����ε�)
	public OuterClass() {
		this(0);
	}
	public OuterClass(int age) {
		
	}
//		public void myMethod() {
//			System.out.print("�ܺ� Ŭ������ private�� ���� ��:"+value);
//		}
//	}
//	OuterClass(){
//		InnerClass obj=new InnerClass();
//		obj.myMethod();
//	}
}
