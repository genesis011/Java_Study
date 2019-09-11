package a15_11ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Example {

	public static void main(String[] args) {
		ArrayList<String>list =new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		
		Iterator it =list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
