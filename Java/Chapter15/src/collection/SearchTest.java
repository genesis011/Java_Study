package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
//		1. arraylist integer ����
		List<Integer> li = new ArrayList<Integer>();
//		2. ���� ������ 1~100���� �Է��Ͻÿ�.
		for (int i = 0; i < 100; i++) {
			li.add((int) (Math.random() * 100 + 1));
//			li.add((int) (Math.random() * (100-1+1)+1);
			System.out.print(" " + li.get(i));
		}
		long start1 = System.nanoTime();
		for (int i = 0; i < 100; i++) {
			if (li.get(i) == 10)
				break;
		}
		long stop1 = System.nanoTime();
		System.out.println("�Ϲ� ������� �˻�ó�� �ð�=" + (stop1 - start1));

//		3. ���Ľ�ų��
		System.out.println("");
		Collections.sort(li);
		for (Integer i : li) {
			System.out.print(" " + i);
		}
		long start = System.nanoTime();
		int index = Collections.binarySearch(li, 50);
		long stop = System.nanoTime();
		System.out.println("\n " + index + " \n" + (stop - start));
	}
}
