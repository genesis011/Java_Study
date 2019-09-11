package bakeryTest;

public class Bakery {
	private static int num;
	private String[] bread = { "¼Òº¸·ç »§", "Å©¸²»§", "´ÜÆÏ»§", "½´Å©¸²»§", "½Ä»§", "Âµ", "·Î¿ìÅ±" };
	private boolean isBread = false;

	public synchronized String getBread() {

		while (!isBread) {

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (num == 5 || num == 6) {
			System.out.println(this.bread[num] + "À» ¸Â¾Ò½À´Ï´Ù.");
		} else {
			System.out.println(this.bread[num] + "¸¦ ¸Ô¾ú½À´Ï´Ù.");
		}
		isBread = false;
		notifyAll();

		return this.bread[num];
	}

	public synchronized void setBread() {

		while (isBread) {

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		num = (int) (Math.random() * 6);

		if (num == 5 || num == 6) {
			System.out.println(this.bread[num] + "À» ³¯·È½À´Ï´Ù.");
		} else {
			System.out.println(this.bread[num] + "À» ¸¸µé¾ú½À´Ï´Ù. ");
		}

		isBread = true;

		notifyAll();
	}
}
