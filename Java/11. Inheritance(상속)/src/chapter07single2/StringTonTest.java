package chapter07single2;

public class StringTonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon single = SingleTon.getSingleTon();
		single.print();
		single.print();
		SingleTon single2 = SingleTon.getSingleTon();
		single.getString();
	}

}
