package chapter5;

public class Sum {
	 int x;
	 int y;
	 int z;
	
	@SuppressWarnings("unused")
	public Sum() {
		int x=0;
		int y=0;
		int z=0;
	}
	public int sum(int x, int y) {
		return x+y;
	}
	public int sum(int x, int y, int z) {

		return  x+y+z;
	}
}
