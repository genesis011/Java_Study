package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MyClass>al=new ArrayList<MyClass>();
		al.add(new MyClass(10));
		al.add(new MyClass(20));
		al.add(new MyClass(30));
		al.add(new MyClass(40));
		
		Iterator iter=al.iterator();
		while(iter.hasNext()) {
			MyClass mc=(MyClass)iter.next();
			System.out.println(mc.number);
		}
	}

}
