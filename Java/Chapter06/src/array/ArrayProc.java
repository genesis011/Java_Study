package array;

import java.util.Scanner;

public class ArrayProc {
	public Scanner scan=new Scanner(System.in);
	public int[] score;
	public int sum;
	public double overage;
	
	public ArrayProc() {
		this.score=new int[5];
		this.sum=0;
		this.overage=0.0;
	}
	public ArrayProc(int size, int sum,double overrage) {
		this.score=new int [size];
	}
	public void getValues() {
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<score.length;i++) {
			System.out.print("값을 입력하시오 : ");
			score[i]=scan.nextInt();
		}
	}
	public int getSum() {
		for(int i=0;i<this.score.length;i++){
			this.sum=this.sum+score[i];
		}
		return this.sum;
	}
	public double getOverage() {
		this.overage=(double)this.sum/(double)this.score.length;
		return this.overage;
	}
}
