package BankA;

@SuppressWarnings("serial")
public class NegativeBalanceException extends Exception{
	public NegativeBalanceException(String str) { //������ �Լ�
		super(str);
	}
}
