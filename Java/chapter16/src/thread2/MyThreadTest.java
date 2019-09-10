package thread2;

public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main = "+Thread.currentThread().getName());
//		2. 소리를 작동시키는 방법
//		1. 숫자를 찍어주는 스레드
		Thread t1 = new Mythread() {
			@Override
			public void run() {
				System.out.println("t1"+Thread.currentThread().getName());
				for (int i = 1; i <= 5; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {}
				}
			}
		};
		Thread t2 = new Mythread2();
		t1.start();
		t2.start();
//		t1.run(); //원형은 run으로 입력해야 한다.
	}
}
