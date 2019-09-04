package chapter07ParentChild;

public class Child extends Parent{
	
	public static void main(String[] args) {
		Child obj =new Child();
		obj.print();
	}
	
	public void print() {
		System.out.println("자식 클래스의 print() 메소드 ");
	}
}
