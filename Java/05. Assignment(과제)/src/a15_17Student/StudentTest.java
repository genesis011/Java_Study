package a15_17Student;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student>list=new ArrayList<>();
//		정보입력
		list.add(new Student("김성민", "오동동","12342454"));
		list.add(new Student("유영삼", "송파구","12342454"));
		list.add(new Student("정민지", "잠실","12342454"));
//		정보검색
		Iterator<Student>iterastor=list.iterator();
		boolean tag=false;
		while(iterastor.hasNext()) {
			Student stu=iterastor.next();
			if(stu.getName().equals("정민지")) {
				System.out.println(stu.getName()+"학생이 있습니다.");
				System.out.println("정보제공"+stu.getAddress()+stu.getPhone());
			}
		}
		if(tag==false) {
			System.out.println("정민지 학생이 없습니다.");
		}
//		삭제 기능
		Iterator<Student>iterastor2=list.iterator();
		while(iterastor2.hasNext()) {
			Student stu=iterastor2.next();
			if(stu.getName().equals("정민지")) {
				iterastor2.remove();
			}
		}
//		출력하는 기능
		for(Student student:list) {
			System.out.println(student);
		}
	}
}
