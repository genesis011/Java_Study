package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ShortTest {

	public static void main(String[] args, Iterator<String> ierator) {
//		1. �迭�� �����Ѵ�.
		String[] str = new String[] { "aaa", "bbb", "ccc", "ddd", };
//		2. �迭�� List�� �ٲ۴�.
		List<String> list = Arrays.asList(str);
//		3. list iterator ����غ�����.
		iteratorFunc(list);

//		4. List �����Ѵ�.
		Collections.sort(list);
		System.out.println("==== ���� ====");
		iteratorFunc(list);
		System.out.println("==== �迭 ���� ====");
		str=(String[])(list.toArray()); //String�� ���� ����Object /���� ����ȯ
		for(String s:str) {
			System.out.println(s);
		}
	}
	private static void iteratorFunc(List<String> list) {
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
