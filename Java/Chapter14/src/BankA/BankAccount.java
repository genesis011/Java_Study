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
			throw new  NegativeBalanceException(-(balance-money)+"금액이 부족합니다.");
		}
		balance-=money;
		System.out.println(money+"금액을 출금하였습니다.");
	}
}
