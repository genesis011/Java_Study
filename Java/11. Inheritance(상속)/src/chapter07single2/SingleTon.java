package chapter07single2;

public class SingleTon {
	private String string="출석 완료";
//	private static SingleTon singleTon;
	private static SingleTon singleTon=new SingleTon();

//	1. 첫번 째 방식
	static {
		singleTon=new SingleTon();
	}
	private SingleTon() {
	}
//	2. 두번 째 방식
	public static SingleTon getSingleTon() {
		if(singleTon==null) {
			singleTon=new SingleTon();
		}
		return singleTon;
	}
	public void print() {
		System.out.println("수업시작");
		System.out.println("정각 "+string);
	}
	public void setString(String string) {
		this.string=string;
	}
	public void getString() {
		System.out.println(this.string);
	}
}
