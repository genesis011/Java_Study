package chapter5;

public class sumTest {

	public static void main(String[] args) {
		Sum sum = new Sum();
		
		System.out.println("두 수의 합 : "+sum.sum(10, 15));
		System.out.println("세 수의 합 : "+sum.sum(5, 10, 20));

	}

}
