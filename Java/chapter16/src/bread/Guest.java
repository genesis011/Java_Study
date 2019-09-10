package bread;

public class Guest extends Thread{
//	¸â¹öº¯¼ö
	private Bakery bakery;
//	»ı¼ºÀÚ
	public Guest(Bakery bakery) {
		this.bakery=bakery;
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				String str=bakery.getisBread();
				System.out.println(str+"»§À» ¸Ô¾ú½À´Ï´Ù.");
				Thread.sleep(200);
			}catch (Exception e) {}
		}
	}
}
