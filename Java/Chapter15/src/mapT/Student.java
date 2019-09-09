package mapT;

public class Student {
	public String name;
	public int number;

	public Student(int number, String name) {
		super();
		this.name = name;
		this.number = number;

	}

	@Override
	public String toString() {
		return "Map [name=" + name + ", number=" + number + "]";
	}

	public int CompareTo(Student num) {
		if (this.number > num.number) {
			return -1;
		} else if (this.number < num.number) {
			return 1;
		}
		return 0;
	}
}
