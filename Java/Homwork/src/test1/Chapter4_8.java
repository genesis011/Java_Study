package test1;

import java.util.Arrays;

public class Chapter4_8 {

	public static void main(String[] args) {
		double[] num = new double[10];
		init(num);
		System.out.println(Arrays.toString(num));
	}

	static void init(double[] values) {
		for (double i = 0.0; i < values.length; i++) {
			values[(int)i]=i+1;
		}
	}
}
