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
			System.out.print("심사위원"+(i+1)+"의 점수: ");
			pro=scan.nextInt();
			if(pro<0 || pro>10) {
				System.out.println("점수가 잘못 되었습니다. 다시 입력 요망");
				i--;
				continue;
			}
			list.add(i,pro);
			val +=pro;
		}
		val=val-Collections.max(list)-Collections.min(list);
		System.out.println("점수 합: "+val);
	}
}
