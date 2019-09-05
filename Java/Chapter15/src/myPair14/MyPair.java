package myPair14;

class MyPair<T> {
	private T a;
	private T b;
	public MyPair(T a, T b) {
		this.a = a;
		this.b = b;
	}
	public T getA() {
		return this.a;
	}
	public T getB() {
		return this.b;
	}
	public void setA(T a) {
		this.a = a;
	}
	public void setB(T b) {
		this.b = b;
	}
	public String toString() {
		return a + " + " + b;
	}
}
