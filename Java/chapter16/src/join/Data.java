package join;

public class Data {
	private int sum=0;

//	����ȭ ó��
	public synchronized int getSum() {
		return sum;
	}

//	����ȭ ó��
	public synchronized void setSum(int sum) {
		this.sum = sum;
	}
}
