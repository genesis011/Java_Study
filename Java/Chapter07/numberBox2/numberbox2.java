package numberBox2;

public class numberbox2 {
	// ��� ������ ���´�.
//  1.�������
	private int ivalue;
	private float fvalue;
	private double dvalue;
	private char cvalue;

//  2.������ �Լ�(�����ε�)
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

//  3.�ν��Ͻ� ����Լ� �����ε�
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
	// ��������̼�-�����Ϸ����� �������̵��̶�� �����϶�� ��.

}