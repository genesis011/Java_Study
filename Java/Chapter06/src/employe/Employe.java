package employe;//extends Object�ִ� �Ͱ� ����.

public class Employe {
	//1. ��� ���� ����(������� ��� ����)]
	private static int count=0;
	private double salary;
	private String name;
	//2. ������ �����ε�(����Ʈ ������ /�Ű�����������)
	public Employe() {
		this(0.0,null);
		// TODO Auto-generated constructor stub
	}
	public Employe(double salary, String name) {
		this.salary = salary;
		this.name = name;
		Employe.count++;
	}
	//3. �������̵� 
	@Override
	protected void finalize() /*throws Throwable ��� ��*/ {
		System.out.println("�޸𸮿��� ������ϴ�.");
		this.count--;
	}
	//4. ���ͽ� �Լ� ����
	public static int getCount() {
		return count;
	}
	
}
