package student;

public class GraduateStudent extends Student {

	public GraduateStudent(int number, String name, String lab) {
		super(number, name);
		this.lab=lab;
	}
	public String lab;
}
