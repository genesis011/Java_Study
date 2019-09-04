package chapter07single1;

public class SingleTonTest {

	public static void main(String[] args) {
		
		SingleTon single=SingleTon.getSinlgTon();
		single.print();
		single.print();
		SingleTon single2=SingleTon.getSinlgTon();
		single.getString();
	}
}
