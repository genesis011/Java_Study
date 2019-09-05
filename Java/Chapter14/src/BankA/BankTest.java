package BankA;

public class BankTest { //클래스

	public static void main(String[] args) { //메인함수
		BankAccount ba=new BankAccount(10_000);
		try {
			ba.widthDraw(20_000);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
