package chapter07Single3;

public class SingleTon {
	private static SingleTon singleTon = new SingleTon();
	static {
		singleTon = new SingleTon();
	}

	private SingleTon() {

	}

	public static SingleTon getSingleTon() {
		if (singleTon == null) {
			singleTon = new SingleTon();
		}
		return singleTon;
	}
}