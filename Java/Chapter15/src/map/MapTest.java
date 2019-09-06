package map;
//9일날 월요일 시험
import java.util.HashMap;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, Student> hm = new HashMap<String, Student>();
		hm.put("1", new Student(1, "구준표"));
		hm.put("2", new Student(2, "홍준표"));
		hm.put("3", new Student(3, "윤지후"));

		System.out.println(hm);
		hm.remove("1");
		System.out.println(hm);// 1번 제거
		hm.put("3", new Student(3, "소이정"));// 대체

		System.out.println(hm);
		// 향상된 포문(맵을 set으로 바꾸어서 그 안에 데이타를 가져온)
		// hm.sntrySet() -> 맵을 Set<Entry<String, Student>>
		for (Entry<String, Student> set : hm.entrySet()) {
			String str = set.getKey();
			Student stu = set.getValue();
			System.out.println(str + " = " + stu.name + stu.number);
		}
	}
}
