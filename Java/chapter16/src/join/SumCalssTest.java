package join;

public class SumCalssTest {

	public static void main(String[] args) throws InterruptedException {
//		1. ������ü�� �����.
		Data data=new Data();
		System.out.println("1~100�հ�="+data.getSum());
//		2. ������ sumClass ��ü�� �����.
		Thread thread=new SumClass(data);
		thread.start();
		System.out.println("��ٷ��ּ���... ... ...");
//		Thread.sleep(1);
		thread.join(); //SumClass �����尡 ������ main �����尡 �۵���
//		main ������� �Ͻ� ���� ���·� ������.
		System.out.println("1~100�հ�="+data.getSum());
	}
}
