package a_07_14Event;

public class StudentTest {

	public static void main(String[] args) {
		Student student=new Student("홍길동",1234,"컴공",12,234);
		System.out.println(student.toString());
		
		UnderGraduate under=new UnderGraduate("홍길동",1234,"컴공",12,234,"축구부");
		System.out.println(under.toString());
		
		Graduate grad =new Graduate("이",16546,"장",345,03,"연구",45);
		System.out.println(grad.toString());
	}
}
