package BankA;

public class BankTest { //Ŭ����

	public static void main(String[] args) { //�����Լ�
		BankAccount ba=new BankAccount(10_000);
		try {
			ba.widthDraw(20_000);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
