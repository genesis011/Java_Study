package BankIndex16;

class BadIndex extends Exception {
	public BadIndex(String message) {
		super(message);
	}
}

class BankAccount {
	private int balance = 0;

	public int getbalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void depopsit(int amount) {
		balance += amount;
	}
	public void withdraw(int amount) throws Exception {
		if (balance < amount)
			throw new Exception("잔고가 없습니다.");
		balance -= amount;
	}
}

