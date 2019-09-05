package BankA;

public class BankAccount {
	private int balance;
	
	public BankAccount(int balance) {
		super();
		this.balance=balance;
	}
	public void deposit(int money) {
		balance+=money;
	}
	public void widthDraw(int money) throws NegativeBalanceException{
		if(balance<money) {
			throw new  NegativeBalanceException(-(balance-money)+"�ݾ��� �����մϴ�.");
		}
		balance-=money;
		System.out.println(money+"�ݾ��� ����Ͽ����ϴ�.");
	}
}
