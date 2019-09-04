package chapter07single1;

public class SingleTon {
	private String string = "���� �Ϸ���";
	
	private static SingleTon singleTon;


	static {

	}

	private SingleTon() {
		
	}

	public static SingleTon getSinlgTon() {
		if (singleTon == null) {
			singleTon = new SingleTon();
		}
		return singleTon;
	}

	public void print() {
		System.out.println("�ų���. ����������.");
		System.out.println("��... �ų���. ������ �ð��̴�.");
		System.out.println("��ٷȾ�" + string);
	}

	public void setString(String string) {
		this.string = string;
	}
	
	public void getString() {
		System.out.println(this.string);
	}
	
}
