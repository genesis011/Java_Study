package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		String str1 = new String("butter");

		// 삽입
		al.add("milk");
		al.add("bread");
		al.add(str1);

		// 출력
		int j = 0;
		for (String str : al) {
			System.out.println((j++) + " = " + str);
		}
		System.out.println("-----");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(i + " = " + al.get(i));
		}
		System.out.println("-----");
		// 1. 반복자 처리
		Iterator<String> iter = al.iterator();
		// 2. 반복자 내용유무 물어본다.
		while (iter.hasNext()) {
			//3. 반복자 내용을 가져온다.
			String str=iter.next();
			System.out.println(str);
		}
	}

}
