package comparable;

public class MyClassTest {
	public static void main(String[] args) {
		MyClass<MyClass>mc1=new MyClass<MyClass>(10, "ȫ�浿");
		MyClass<MyClass>mc2=new MyClass<MyClass>(20, "���浿");
		
		int value=mc1.compareTo(mc2);
		
		switch (value) {
		case 1:System.out.println(mc1.toString()+"Ů�ϴ�"); break;
		case -1:System.out.println(mc2.toString()+"Ů�ϴ�"); break;
		case 0:System.out.println(mc1.toString()+"�����ϴ�."); break;

		default:System.out.println("��������");
			break;
		}
		MyClass[] mcArray={new MyClass<MyClass>(10, "ȫ�浿"),
		
		new MyClass<MyClass>(10, "ȫ�浿"),
		new MyClass<MyClass>(20, "ȫ�浿"),
		new MyClass<MyClass>(30, "ȫ�浿"),
		new MyClass<MyClass>(40, "ȫ�浿"),
		};
		MyClass largeObject=MyArrayAlg.getMax(mcArray);
		System.out.println(largeObject+"���� ū ��ü�Դϴ�.");
		
		String[] strArray= {new String("��浿"),new String("�ϱ浿"),new String("��浿"),};
		String largeString=MyArrayAlg.getMax(strArray);
		System.out.println(largeObject+"���� ū ��ü�Դϴ�.");
	}
}
