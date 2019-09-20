package objectStream;

import java.io.Serializable;

public class Student implements Serializable {
	public int number;
	public String name;
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}
}
