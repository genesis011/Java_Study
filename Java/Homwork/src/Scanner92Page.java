import java.util.Scanner;

public class Scanner92Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		int x;
		int y;
		int sum;
		
		System.out.println("첫 번째 숫자를 입력하시오 :");
		x = input.nextInt();
		
		System.out.println("두 번째 숫자를 입력하시오 :");
		y = input.nextInt();
		
		sum = x + y;
		System.out.println(sum);
	}

}
