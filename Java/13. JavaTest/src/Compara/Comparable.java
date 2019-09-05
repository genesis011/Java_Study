package Compara;

import java.util.Arrays;//임포트

public class Comparable {// 클래스

	public static void main(String[] args) {//메인함수
		String[] sports = new String[] { "Soccer", "BaseBall", "Tennis", "Ski", "Hockey" };
		String[] names = new String[] { "헨리", "김수현", "유재석", "조세호", "스티브" };

		Arrays.sort(sports);//Arrays.sort Arrays클래스명으로 함수 sort를 부름
		Arrays.sort(names);//따로 저장하지 않아도 정렬을 해주지

		for (int i = 0; i < sports.length; i++) { //0 부터 sports.length 길이 만큼
			System.out.print(sports[i] + "; ");
		}
		System.out.println();
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "; ");
		}
	}
	
}
