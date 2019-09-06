package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest4 {

	public static void main(String[] args) {

//		ArrayList<MyClass> al = new ArrayList<MyClass>();
//		al.add(new MyClass(10));
//		al.add(new MyClass(20));
//		al.add(new MyClass(30));
//		al.add(new MyClass(40));
		MyClass[] mc = { new MyClass(10), new MyClass(20), new MyClass(30), new MyClass(40) };
		List<MyClass> list = Arrays.asList(mc);

		// 1. �÷��ǿ��� ���ͷ����͸� ������. �ݵ�� �ش�� Ŭ���� Ÿ������ �޾ƶ�.
		Iterator<MyClass> iter = list.iterator();
		// 2. �ݺ����� ���ؼ� ��ü�� ������ �ִ��� ���� Ȯ�� hasNext():������ü �ٰ� �ִ���
		while (iter.hasNext()) {
			// 3. ��ü�� ȣ��
			MyClass mc1 = (MyClass) iter.next();
			System.out.println(mc1.number);
		}
	}
}
