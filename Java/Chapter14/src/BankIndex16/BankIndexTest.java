package BankIndex16;

public class BankIndexTest {
	public static void main(String[] arge) throws Exception {
		BankAccount ba = new BankAccount();
		ba.depopsit(100);
		try {
			try {
				ba.withdraw(200);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
		}
	}
}
