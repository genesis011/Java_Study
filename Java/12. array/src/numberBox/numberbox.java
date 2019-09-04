package numberBox;

public class numberbox {
	private int ivalue;
	private float fvalue;

	public numberbox(int ivalue, float fvalue) {
		this.ivalue = ivalue;
		this.fvalue = fvalue;
	}

	public void setIvalue(int ivalue) {
		this.ivalue = ivalue;
	}

	public void setFvalue(float fvalue) {
		this.fvalue = fvalue;
	}
	
	public int getIvalue() {
		return ivalue;
	}

	public float getFvalue() {
		return fvalue;
	}
	public void printer() {
		System.out.println("ivalue = "+getIvalue());
		System.out.println("ivalue = "+getFvalue());
	}
	public float multP() {
		return ivalue*fvalue;
	}
}
