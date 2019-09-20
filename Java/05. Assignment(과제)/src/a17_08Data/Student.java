package a17_08Data;

import java.io.Serializable;

public class Student implements Serializable{
	

	public int no;
	public String name;
	
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
	
	
}
