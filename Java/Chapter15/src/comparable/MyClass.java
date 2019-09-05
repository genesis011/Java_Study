package comparable;

public class MyClass<T extends MyClass> implements Comparable<T> {

	private int no;
	private String name;

	public MyClass(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	@Override
	public int compareTo(T t) {

		MyClass mc = null;
		if (t instanceof MyClass) {
			mc = (MyClass) t;
		}
		if (this.no < mc.no) {
			return 1;
		} else if (this.no < mc.no) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "MyClass [no=" + no + ", name=" + name + "]";
	}
	
}
