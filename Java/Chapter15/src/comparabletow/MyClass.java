package comparabletow;

public class MyClass implements Comparable<MyClass> {

	
	private int number;
	private String name;
	
	
	public MyClass(int number, String name) {
		super();
		this.number=number;
		this.name=name;
	}
	
	@Override
	public int compareTo(MyClass o) {
		if(this.number<o.number) {
			return -1;
		}else if(this.number>o.number)
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "MyClass [number=" + number + ", name=" + name + "]";
	}

}
