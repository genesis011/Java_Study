package test1;

public class A1_forEach {

	public static void main(String[] args) {
		//1.��� �迭�� 3�� �����Ѵ�.
		//int[]numbers=new int[] {10,20,30};
		ForEach fe =new ForEach();//ForEach�� fe������ �� ����.
		//�迭 ��ü�� �Ϲ������� Ȱ���Ͽ� ����Ѵ�.
		//for(int i=0;i<numbers.length;i++) {
			//System.out.print("\t"+numbers[i]);
		//}
		//���� ������ Ȱ���Ѵ�.
		//for(int number:numbers) {
			//System.out.print("\n"+number);
		//}
		
		fe.forPrint();
	}

}
