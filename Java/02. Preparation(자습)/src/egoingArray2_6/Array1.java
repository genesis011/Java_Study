package egoingArray2_6;

public class Array1 {

	public static void main(String[] args) {
		String[] classCroup= {"������","������","�ѾƸ�","�̰���"};
		System.out.println(classCroup[1]);
		System.out.println(classCroup.length); //4���� ���� ����� �� �ִٴ��ǹ�
		//0��: ������, 1��: ������, 2��: �ѾƸ�, 3��: �̰���
	String[] classGroup1=new String[4]; //4���� ���� ����� �� �ִٴ��ǹ�
	classGroup1[0]="������";
	System.out.println(classGroup1.length); //4���� ���� ����� �� �ִٴ��ǹ�
	
	classGroup1[1]="������";
	System.out.println(classGroup1.length); //4���� ���� ����� �� �ִٴ��ǹ�
	
	classGroup1[2]="�ѾƸ�";
	System.out.println(classGroup1.length); //4���� ���� ����� �� �ִٴ��ǹ�
	
	classGroup1[3]="�̰���";
	System.out.println(classGroup1.length); //4���� ���� ����� �� �ִٴ��ǹ�
	}
}
