package arrays;

import java.util.Scanner;

public class Array {
	private int[] score;
	private int sum;
	private double average;
	private int max;
	private int min;
	//private static int count=0; //����� �ʱⰪ
	
	public Array() {
		this.score=new int[5];
		this.sum=0;
		this.average=0.0;
		this.max=0;
		this.min=100;
	}
	public Array(int size, int sum, double average, int max, int min) {
	this.score=new int[size]; this.sum=sum; this.average=average;this.max=max; this.min=min;	
	}
	public void getValue() {
		Scanner scan =new Scanner(System.in);
		for(int i=0;i<score.length;i++) {
			this.score[i]=(int)(Math.random()*(100-1+1)+1);
			System.out.print("���� �Է� : ");
			score[i]=scan.nextInt();
		}
	}
	public int getSum() {
		for(int i=0;i<score.length;i++) {
			this.sum=this.sum+this.score[i];
		}
		return this.sum;
	}

	public double getOverage() {
		this.average=this.sum/this.score.length;
		return this.average;
	}
	public int getMax() {
		max=score[0];
		for(int i=0;i<score.length;i++) {
			if(max<score[i]) {
				max=score[i];
				
			}
		}
		return this.max;
	}
	public int getMin() {
		min=score[0];
		for(int i=0;i<score.length;i++) {
			if(min>score[i]) {
				min=score[i];
				
			}
		}	
		return this.min;
	}
	//����� �Լ��� ���������� ������ Test���� �ν��� ���Ѵ�.
	//public static int getCount() { //����� �ʱⰪ �Լ�
	//	return count;
	//}
	
}
