package mapT;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, Student> hm = new HashMap<String, Student>();
		hm.put("1", new Student(1, "구준표"));
		hm.put("2", new Student(2, "군 표"));
		hm.put("3", new Student(3, "준 표"));
		
		
		System.out.println(hm);
		for (Entry<String, Student> set : hm.entrySet()) {
			
			Student stu = set.getValue();
			String str = set.getKey();
			System.out.println(str + "=" + stu.name + stu.number);
		}
	}
}
