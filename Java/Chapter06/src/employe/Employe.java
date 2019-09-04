package employe;//extends Object있는 것과 같다.

public class Employe {
	//1. 멤버 변수 선언(정적멤버 면수 선언)]
	private static int count=0;
	private double salary;
	private String name;
	//2. 생성자 오버로딩(디폴트 생성자 /매개변수생성자)
	public Employe() {
		this(0.0,null);
		// TODO Auto-generated constructor stub
	}
	public Employe(double salary, String name) {
		this.salary = salary;
		this.name = name;
		Employe.count++;
	}
	//3. 오버라이딩 
	@Override
	protected void finalize() /*throws Throwable 없어도 됨*/ {
		System.out.println("메모리에서 사라집니다.");
		this.count--;
	}
	//4. 겟터스 함수 진행
	public static int getCount() {
		return count;
	}
	
}
