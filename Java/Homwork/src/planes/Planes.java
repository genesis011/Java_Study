package planes;

public class Planes {
	private int num, p_num;
	private String model;
	private static int planes;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getP_num() {
		return p_num;
	}
	public void setP_num(int p_num) {
		this.p_num = p_num;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public static int getPlanes() {
		return planes;
	}
	public static void setPlanes(int planes) {
		Planes.planes = planes;
	}
	public Planes() { 
		 }
	public Planes(int n, String m, int pn) {
		  num = n;
		  p_num = pn;
		  model = m;
		 }
	public Planes(int n, String m) {
		  num = n;
		  model = m;
		 }
	@Override
	public String toString() {
		return "Plane [½Äº°¹øÈ£ : " + num + ", ½Â°´¼ö : " + p_num + ", ¸ðµ¨ : " + model + "]";
	}
}