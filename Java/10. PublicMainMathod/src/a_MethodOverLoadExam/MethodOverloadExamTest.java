package a_MethodOverLoadExam;

public class MethodOverloadExamTest {

	public static void main(String[] args) {
		MethodOverloadExam m = new MethodOverloadExam();
		System.out.println(m.plus(5, 10));
		System.out.println(m.plus(5, 10, 15));
		System.out.println(m.plus("Hallo ", "World"));
	}
}
