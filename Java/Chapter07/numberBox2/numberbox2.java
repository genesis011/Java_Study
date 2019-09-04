package numberBox2;

public class numberbox2 {
	// 멤버 변수를 적는다.
//  1.멤버변수
	private int ivalue;
	private float fvalue;
	private double dvalue;
	private char cvalue;

//  2.생성자 함수(오버로딩)
	public numberbox2() {
		ivalue = 0;
		fvalue = 0.0f;
		dvalue = 0.0;
		cvalue = 65;

	}

	public numberbox2(int ivalue, float fvalue, double dvalue) {
		this.ivalue = ivalue;
		this.fvalue = fvalue;
		this.dvalue = dvalue;
		this.cvalue = 65;
	}

	public numberbox2(int ivalue, float fvalue, double dvalue, char cvalue) {
		this.ivalue = ivalue;
		this.fvalue = fvalue;
		this.dvalue = dvalue;
		this.cvalue = 67;
	}

//  3.인스턴스 멤버함수 오버로딩
	public float calculate(int ivalue, float fvalue) {
		this.ivalue += ivalue;
		this.fvalue += fvalue;
		return this.ivalue * this.fvalue;
	}

	public double calculate(int ivalue, float fvalue, double dvalue) {
		this.ivalue += ivalue;
		this.fvalue += fvalue;
		this.dvalue += dvalue;
		return this.ivalue + this.fvalue + this.dvalue;
	}

	@Override
	public String toString() {
		return "NumberBox [ivalue=" + ivalue + ", fvalue=" + fvalue + ", dvalue=" + dvalue + ", cvalue=" + cvalue + "]";
	}
	// 어노테이이션-컴파일러한테 오버라이딩이라고 점검하라고 함.

}