package join;

public class SumClass extends Thread {
	private Data data;
	
	public SumClass(Data data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
			data.setSum(sum);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {}
		}
	}
}
