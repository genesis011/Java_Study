package bread;

public class Baker implements Runnable {
//	멤버변수
	private static String[] menu = { "단팥", "피자", "식빵", "고로케", "붕어" };
	public Bakery bakery;
// 생성자 함수

	public Baker(Bakery bakery) {
		this.bakery = bakery;
	}

	@Override
	public void run() {
//			1. 5번을 돌린다,
		for (int i = 0; i <5; i++) {
			try {
				this.bakery.setBread(menu[i]);
				System.out.println(menu[i] + "만들었습니다.");
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		} // end of for
	}
}
