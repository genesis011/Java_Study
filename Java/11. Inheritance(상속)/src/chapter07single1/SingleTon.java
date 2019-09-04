package chapter07single1;

public class SingleTon {
	private String string = "과제 완료함";
	
	private static SingleTon singleTon;


	static {

	}

	private SingleTon() {
		
	}

	public static SingleTon getSinlgTon() {
		if (singleTon == null) {
			singleTon = new SingleTon();
		}
		return singleTon;
	}

	public void print() {
		System.out.println("신난다. 수업끝났다.");
		System.out.println("야... 신난다. 과제할 시간이다.");
		System.out.println("기다렸어" + string);
	}

	public void setString(String string) {
		this.string = string;
	}
	
	public void getString() {
		System.out.println(this.string);
	}
	
}
