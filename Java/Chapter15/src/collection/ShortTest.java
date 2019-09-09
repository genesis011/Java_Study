package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ShortTest {

	public static void main(String[] args, Iterator<String> ierator) {
//		1. 배열을 선언한다.
		String[] str = new String[] { "aaa", "bbb", "ccc", "ddd", };
//		2. 배열을 List로 바꾼다.
		List<String> list = Arrays.asList(str);
//		3. list iterator 출력해보세요.
		Iterator<String> iterator = list.iterator();
		while (ierator.hasNext()) {
			System.out.println(iterator.next());
		}
//		4. List 정렬한다.
		Collections.sort(list);
		System.out.println("=====정렬=====");
		iteratorFunc(list);
		System.out.println("===배열 정렬===");
	}

	private static void iteratorFunc(List<String> list) {
		// TODO Auto-generated method stub

	}
}
