import java.util.Scanner;
public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oranges=0;
    	@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
    	System.out.print("�������� ������ �Է��Ͻÿ�: "); // �Է� �ȳ� ���
		oranges =    input.nextInt()   ;
    	System.out.println( oranges/10 + "�ڽ��� �ʿ��ϰ� " + 
		oranges%10 + "���� �����ϴ�. ");
	}

}
