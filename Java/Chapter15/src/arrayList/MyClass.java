package arrayList;

public class MyClass {
	public int number;

	public MyClass(int number) {
		super();
		this.number = number;
	}

	public void thisToString(MyClass thisAddress) {
		System.out.println("�θ� hashCode= "+super.hashCode());
		System.out.println("�θ� = "+super.toString());
		System.out.println("�θ� identity= "+System.identityHashCode(super.getClass()));
		System.out.println("�ڽ� = "+thisAddress);
		System.out.println("�ڽ� hashCode= "+thisAddress.hashCode());
		System.out.println("�ڽ� identity= "+System.identityHashCode(thisAddress));
		System.out.println("+=============+");
	}
	
//	@Override
//	public String toString() {
//		return super.toString()+"\n"+ "MyClass [number=" + this + "]";
//	}
	
}
