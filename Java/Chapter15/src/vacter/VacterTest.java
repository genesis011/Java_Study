package vacter;

import java.util.Vector;

public class VacterTest {

	public static void main(String[] args) {
		Vector vc = new Vector();
		MyClass mc=new MyClass(1);
		// ���Ϳ� ����

		vc.add(new String("World"));
		vc.add(new Integer(10));
		vc.add(new MyClass(1));
		vc.add(mc);
		vc.add(1, "Hello");

		// ���
		for (int i = 0; i < vc.size(); i++) {
			System.out.println(i + "=" + vc.get(i));
		}
		System.out.println("-----------");
		int j = 0;
		for (Object o : vc) {
			System.out.println((j++) + "=" + o);
		}
		// ��� ����
		System.out.println("��һ���");
		vc.remove(mc);
		for (int i = 0; i < vc.size(); i++) {
			System.out.println(i + "=" + vc.get(i));
		}
		// ��� ����2
		System.out.println("��һ���2");
		vc.remove(new MyClass(1));
		for (int i = 0; i < vc.size(); i++) {
			System.out.println(i + "=" + vc.get(i));
		}
	}
}
