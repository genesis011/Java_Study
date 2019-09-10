package join;

public class SumCalssTest {

	public static void main(String[] args) throws InterruptedException {
//		1. 공유객체를 만든다.
		Data data=new Data();
		System.out.println("1~100합계="+data.getSum());
//		2. 스레드 sumClass 객체를 만든다.
		Thread thread=new SumClass(data);
		thread.start();
		System.out.println("기다려주세요... ... ...");
//		Thread.sleep(1);
		thread.join(); //SumClass 스레드가 끝나면 main 스레드가 작동됨
//		main 스레드는 일시 정지 상태로 빠진다.
		System.out.println("1~100합계="+data.getSum());
	}
}
