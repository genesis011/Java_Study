package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		String str1=new String("butter");
		// »ğÀÔ
		al.add("milk");
		al.add("bread");
		al.add(str1);
		//Ãâ·Â

		int j = 0;
		for (String str : al) {
			System.out.println((j++) + " = " + str);
		}
		System.out.println("-----");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(i + " = " + al.get(i));
		}
		System.out.println("-----");
		Iterator<String> iter=al.iterator();
	}

}
