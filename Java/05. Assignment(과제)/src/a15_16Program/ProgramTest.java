package a15_16Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProgramTest {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		int i = 0;
		double pro = 0.0;
		double val = 0.0;
		
		Scanner scan =new Scanner(System.in);
		for(i=0;i<10;i++) {
			System.out.print("�ɻ�����"+(i+1)+"�� ����: ");
			pro=scan.nextInt();
			if(pro<0 || pro>10) {
				System.out.println("������ �߸� �Ǿ����ϴ�. �ٽ� �Է� ���");
				i--;
				continue;
			}
			list.add(i,pro);
			val +=pro;
		}
		val=val-Collections.max(list)-Collections.min(list);
		System.out.println("���� ��: "+val);
	}
}
