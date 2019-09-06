package vacter;

import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class VacterTest {

	public static void main(String[] args) {
		Vector vc = new Vector();
		MyClass mc = new MyClass(1);
		// 벡터에 삽입

		vc.add(new String("World"));
		vc.add(new Integer(10));
		vc.add(new MyClass(1));
		vc.add(mc);
		vc.add(1, "Hello");

		// 요소출력
		java.util.Iterator iter = vc.iterator();
		while (iter.hasNext()) {
			Object ob = iter.next();
			if (ob instanceof MyClass) {
				MyClass mc1 = (MyClass) ob;
				System.out.println(mc1.number);
			} else {
				System.out.println(ob);
			}

		}
		System.out.println("================>");

		for (int i = 0; i < vc.size(); i++) {
			System.out.println(i + "=" + vc.get(i));
		}
		System.out.println("----------->");
		int j = 0;
		for (Object o : vc) {
			System.out.println((j++) + "=" + o);
		}
		// 요소 삭제
		System.out.println("요소삭제");
		vc.remove(mc);
		for (int i = 0; i < vc.size(); i++) {
			System.out.println(i + "=" + vc.get(i));
		}
		// 요소 삭제2
		System.out.println("요소삭제2");
		vc.remove(new MyClass(1));
		for (int i = 0; i < vc.size(); i++) {
			System.out.println(i + "=" + vc.get(i));
		}
	}
}
