package a15_18Loto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class LottoTest {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		while (true) {
			int number = (int) (Math.random() * (45 - 1 + 1) + 1);
			if (!set.contains(new Integer(number))) {
				set.add(new Integer(number));
			}
			if (set.size() == 6)
				break;
		}
//		출력하기
		for (Integer integer : set) {
			System.out.println(integer);
		}
		System.out.println("----------");
//		set-> treeset convert
		TreeSet<Integer> tset = new TreeSet<Integer>(set);
//		set-> arrayList
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
