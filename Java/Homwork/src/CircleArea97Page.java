import java.util.*;
public class CircleArea97Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius;
		double area;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.printf("반지름을 입력하시오 : ");
		radius = input.nextDouble();
		area = 3.14 * radius * radius;
		
		System.out.println(area);
	}

}
