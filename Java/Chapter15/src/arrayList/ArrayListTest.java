package arrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// ����
		al.add("milk");
		al.add("bread");
		al.add("butter");
		// ����
		al.add(1, "Apple");

		// ����
		al.remove("butter");

		int j = 0;
		for (String str : al) {
			System.out.println((j++) + "=" + str);
		}
		System.out.println("-----");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(i + "=" + al.get(i));
		}
	}

}
