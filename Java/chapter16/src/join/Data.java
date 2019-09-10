package join;

public class Data {
	private int sum=0;

//	동기화 처리
	public synchronized int getSum() {
		return sum;
	}

//	동기화 처리
	public synchronized void setSum(int sum) {
		this.sum = sum;
	}
}
