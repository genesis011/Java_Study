package bread;

public class Bakery {
	public String bread;
	public boolean isBread;

	public Bakery() {
		super();
		this.bread = null;
		this.isBread = false;
	}

	public synchronized String getisBread() throws InterruptedException {
		while (!isBread) {
			wait();
		}
		isBread = false;
		notifyAll();
		return bread;
	}

	public synchronized void setBread(String bread) throws InterruptedException {
		while (isBread) {
			wait();
		}
		isBread = true;
		this.bread = bread;
		notifyAll();
	}
}
