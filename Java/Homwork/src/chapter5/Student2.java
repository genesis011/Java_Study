package chapter5;

public class Student2 {

	String name;
	int rollno;
	int age;

	@SuppressWarnings("unused")
	public Student2() {
		name="";
		rollno=0;
		age=0;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public void printer() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+rollno);
		System.out.println("���� : "+age);
	}
	
}
