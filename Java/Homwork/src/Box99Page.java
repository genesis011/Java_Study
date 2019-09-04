import java.util.Scanner;

public class Box99Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double w;
		double h;
		double area;
		double perimeter;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("사각형의 가로를 입력하시오 : ");
		w=input.nextInt();
		System.out.println("사각형의 세로를 입력하시오 : ");
		h=input.nextInt();
		
		area =w * h;
		perimeter = 2.0 * (w + h);
		
		System.out.println("사각형의 넓이는 " + area);
		System.out.println("사각형의 둘레는 " + perimeter);
		
	}
}
