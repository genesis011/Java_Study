package ban05;

import ban06.BanB01;

public class BanAMain {

	public static void main(String[] args) {
		//���� ��Ű�� ������
		BanA01 banA01 =new BanA01();//public class
		banA01.pubNo=10;
		//banA01.prriNo;
		banA01.defNo=10;
		banA01.protectedNo=10;
		
		BanA02 banA02 =new BanA02();//default class
		//banA02.pubNo=10;//�ۺ��� ���� ����
		//banA02.prriNo;//�ۺ��� ���� ����
		
		//�ٸ� ��Ű�� �ִ°��� ������.
		BanB01 banB01 =new BanB01();
		banB01.pubNo=10;
		//banA01.prriNo;
		//banB01.defNo=10;//������ �ȵǴ� ��Ű��
		//banBo1.protected int protectedNo;//����� �ɶ��� �ȴ�.
		//������Ƽ��� ����Ʈ�� �Ȱ���. �� ��ӿ����� �����ϴ�.
		
		//BanB02 banB02 =new BanB02();
	}
}
