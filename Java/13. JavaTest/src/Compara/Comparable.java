package Compara;

import java.util.Arrays;

public class Comparable {

	public static void main(String[] args) {
		String[] sports = new String[] { "Soccer", "BaseBall", "Tennis", "Ski", "Hockey" };
		String[] names = new String[] { "헨리", "김수현", "유재석", "조세호", "스티브" };

		Arrays.sort(sports);
		Arrays.sort(names);

		for (int i = 0; i < sports.length; i++) {
			System.out.print(sports[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
	}
}
