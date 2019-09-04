package a_MethodOverLoadExam;

public class MethodOverloadExam {
	int x = 0;
	int y = 0;
	int z = 0;
	String q = null;
	String p = null;

	public int plus(int x, int y) {
		return x + y;
	}

	public int plus(int x, int y, int z) {
		return x + y + z;
	}

	public String plus(String q, String p) {
		return q + p;
	}
}
