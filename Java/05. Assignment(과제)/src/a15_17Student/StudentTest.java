package a15_17Student;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student>list=new ArrayList<>();
//		�����Է�
		list.add(new Student("�輺��", "������","12342454"));
		list.add(new Student("������", "���ı�","12342454"));
		list.add(new Student("������", "���","12342454"));
//		�����˻�
		Iterator<Student>iterastor=list.iterator();
		boolean tag=false;
		while(iterastor.hasNext()) {
			Student stu=iterastor.next();
			if(stu.getName().equals("������")) {
				System.out.println(stu.getName()+"�л��� �ֽ��ϴ�.");
				System.out.println("��������"+stu.getAddress()+stu.getPhone());
			}
		}
		if(tag==false) {
			System.out.println("������ �л��� �����ϴ�.");
		}
//		���� ���
		Iterator<Student>iterastor2=list.iterator();
		while(iterastor2.hasNext()) {
			Student stu=iterastor2.next();
			if(stu.getName().equals("������")) {
				iterastor2.remove();
			}
		}
//		����ϴ� ���
		for(Student student:list) {
			System.out.println(student);
		}
	}
}
