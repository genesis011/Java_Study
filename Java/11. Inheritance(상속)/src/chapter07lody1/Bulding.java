package chapter07lody1;

public class Bulding  extends Bomb{
	public Bulding() {
		super();
	}
	@Override
	public void bomb() {
		System.out.println("�ǹ��� �������� �ֽ��ϴ�.");
	}
	public static void sbomb() {
		System.out.println("Bulding static");
	}
}
