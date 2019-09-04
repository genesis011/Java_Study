package array;

import java.util.Arrays;
import java.util.Scanner;

public class A1_2Students {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// 1. 상수를 정의한다.(심볼릭 상수 : 변수상수 STUDENTS=>10
		final int STUDENTS = 10;
		// 1.1총합계 변수를 선언한다.
		int total = 0;
		// 2. 1차원 정수형 배열클래스를 객체화한다. 생성자 값은 STUDENTS
		// 객체 참조 변수명은 : score
		int[] score = new int[] { 10, 20, 30, 40, 50 };
		// int[] score{10,20,30,40,50};//이렇게 사용해도 됨=>생략된 것.
		Scanner scan = new Scanner(System.in);
		// int[] score=new int[STUDENTS];
		// 반복문을 사용한다.배열 길이만큼 반복한다.
		for (int i = 0; i < score.length; i++) {
			// 3.1 랜덤함수처리한다.(50~100)
			score[i] = (int) (Math.random() * (100 - 50 + 1) + 50);
			// 3.2 배열 원소에 있는 값을 누적한다.
			total += score[i];
		}
		System.out.println(Arrays.toString(score)
				+ "총합계는" + total + " 평균=" + (int) (total / score.length));
	}
}
