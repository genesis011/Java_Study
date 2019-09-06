package arrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// »ğÀÔ
		al.add("milk");
		al.add("bread");
		al.add("butter");
		// »ğÀÔ
		al.add(1, "Apple");

		// Á¦°Å
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
