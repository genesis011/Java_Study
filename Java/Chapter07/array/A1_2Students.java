package array;

import java.util.Arrays;
import java.util.Scanner;

public class A1_2Students {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// 1. ����� �����Ѵ�.(�ɺ��� ��� : ������� STUDENTS=>10
		final int STUDENTS = 10;
		// 1.1���հ� ������ �����Ѵ�.
		int total = 0;
		// 2. 1���� ������ �迭Ŭ������ ��üȭ�Ѵ�. ������ ���� STUDENTS
		// ��ü ���� �������� : score
		int[] score = new int[] { 10, 20, 30, 40, 50 };
		// int[] score{10,20,30,40,50};//�̷��� ����ص� ��=>������ ��.
		Scanner scan = new Scanner(System.in);
		// int[] score=new int[STUDENTS];
		// �ݺ����� ����Ѵ�.�迭 ���̸�ŭ �ݺ��Ѵ�.
		for (int i = 0; i < score.length; i++) {
			// 3.1 �����Լ�ó���Ѵ�.(50~100)
			score[i] = (int) (Math.random() * (100 - 50 + 1) + 50);
			// 3.2 �迭 ���ҿ� �ִ� ���� �����Ѵ�.
			total += score[i];
		}
		System.out.println(Arrays.toString(score)
				+ "���հ��" + total + " ���=" + (int) (total / score.length));
	}
}
