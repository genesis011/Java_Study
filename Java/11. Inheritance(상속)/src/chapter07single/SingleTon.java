package chapter07single;

public class SingleTon {
	private String string = "과제 완료함";
	// 2멤버변수 (정적 멤버변수, 자기 객체를 가지고 있는)
	private static SingleTon singleTon;

	// 3객체를 싱글톤 객체를 만든다.
	static {
		// singleTon = new SingleTon();
	}

	// 1생성자를 접근하지 외분에서못하도록
	private SingleTon() {
	}
	// 4싱글톤 객체를 리턴 한다.

	public static SingleTon getSinlgTon() {
		if (singleTon == null) {
			singleTon = new SingleTon();
		}
		return singleTon;
	}

	// 5 우리가 실제로 활용할 수 있는 내용을 적어준다.
	public void print() {
		System.out.println("신난다. 수업끝났다.");
		System.out.println("야... 신난다. 과제할 시간이다.");
		System.out.println("기다렸어" + string);
	}

	public static SingleTon getSingleTon() {
		return singleTon;
	}

	public static void setSingleTon(SingleTon singleTon) {
		SingleTon.singleTon = singleTon;
	}
	
}
