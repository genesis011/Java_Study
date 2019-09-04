package chapter5;

public class RectengleTest {
	public static void main(String[] args) {
		
		Rectengle rec =new  Rectengle();
		//std.printer();
		
		rec.setArea(10);
		rec.setPerimeter(20);
		
		rec.printer();
		System.out.println("ÇÕ°è´Â : "+rec.result());
	}
}
