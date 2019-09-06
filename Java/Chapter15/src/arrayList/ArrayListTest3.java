package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MyClass> al = new ArrayList<MyClass>();
		al.add(new MyClass(10));
		al.add(new MyClass(20));
		al.add(new MyClass(30));
		al.add(new MyClass(40));
		// 1. �÷��ǿ��� ���ͷ����͸� ������. �ݵ�� �ش�� Ŭ���� Ÿ������ �޾ƶ�.
		Iterator<MyClass> iter = al.iterator();
		// 2. �ݺ����� ���ؼ� ��ü�� ������ �ִ��� ���� Ȯ�� hasNext():������ü �ٰ� �ִ���
		while (iter.hasNext()) {
			// 3. ��ü�� ȣ��
			MyClass mc = (MyClass) iter.next();
			System.out.println(mc.number);
		}
	}

}
