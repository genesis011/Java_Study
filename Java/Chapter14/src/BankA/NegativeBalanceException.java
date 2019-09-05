package BankA;

@SuppressWarnings("serial")
public class NegativeBalanceException extends Exception{
	public NegativeBalanceException(String str) { //생성자 함수
		super(str);
	}
}
