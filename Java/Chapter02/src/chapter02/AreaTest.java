package chapter02;

public class AreaTest {

	public static void main(String[] args) {
		//1. 변수명(반지름,면적)을 선언한다..double(radius.area)
		//2. 반지름을 할당한다.(5)
		//3. 면적을 계산한다(반지름*반지름*3.141592)
		//4. 면적과 반지름을 출력한다 printf, println
		
		double radius=5.0;
		double area=3.141592*radius*radius;
		System.out.println("반지름은 : "+radius+" 면적은"+radius);
		System.out.printf("반지름 : "+area+"\n");

	}

}
