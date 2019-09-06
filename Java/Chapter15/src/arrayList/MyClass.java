package arrayList;

public class MyClass {
	public int number;

	public MyClass(int number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return super.toString()+"\n"+ "MyClass [number=" + this + "]";
	}
	
}
