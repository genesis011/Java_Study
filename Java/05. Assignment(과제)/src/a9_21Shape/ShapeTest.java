package a9_21Shape;

public class ShapeTest {

	public static void main(String[] args) {
		Shape s1=new  Rectangle(10, 10);
		Shape s2 =new Triangle(5, 5);
		
		Shape[] arrShape = {s1,s2};
		for(int i=0;i<arrShape.length;i++) {
			arrShape[i].calcArea();
			System.out.println("도형 색상: "+ arrShape[i].toString());
		}
	}
}
