package Compara;

import java.util.Arrays;//����Ʈ

public class Comparable {// Ŭ����

	public static void main(String[] args) {//�����Լ�
		String[] sports = new String[] { "Soccer", "BaseBall", "Tennis", "Ski", "Hockey" };
		String[] names = new String[] { "�", "�����", "���缮", "����ȣ", "��Ƽ��" };

		Arrays.sort(sports);//Arrays.sort ArraysŬ���������� �Լ� sort�� �θ�
		Arrays.sort(names);//���� �������� �ʾƵ� ������ ������

		for (int i = 0; i < sports.length; i++) { //0 ���� sports.length ���� ��ŭ
			System.out.print(sports[i] + "; ");
		}
		System.out.println();
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "; ");
		}
	}
	
}
