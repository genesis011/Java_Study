package chapter5;

public class Student1 {

	String name;
	int rollno;
	int age;

	@SuppressWarnings("unused")
	public Student1() {
		String name;
		int rollno;
		int age;
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
		System.out.println("이름 : "+getName());
		System.out.println("힉번 : "+getRollno());
		System.out.println("나이 : "+getAge());
	}
	
}
