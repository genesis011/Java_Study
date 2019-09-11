package a15_10ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Example {

	public static void main(String[] args) {
		ArrayList<Double>list =new ArrayList<Double>();
		list.add(1.0);
		list.add(2.0);
		list.add(3.0);
		list.add(4.0);
		list.add(5.0);
		System.out.println("-----------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------");
		for(Double e:list) {
			System.out.println(e);
		}
		System.out.println("-----------");
		Iterator<Double>it =list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
