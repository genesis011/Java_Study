package chapter07single;

public class SingleTonTest {

	public static void main(String[] args) {
		//StringTon string = new StringTon();
		SingleTon single=SingleTon.getSingleTon();
		single.print();
		//single.setString("�Ϸ����");
		single.print();
		SingleTon single2=SingleTon.getSingleTon();
	}
}
