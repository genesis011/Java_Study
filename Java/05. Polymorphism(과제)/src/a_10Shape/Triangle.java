package a_10Shape;

public class Triangle extends Shape{
	private double height,base;
	public double getHeight() {return height;};
	public double getBase() {return base;};
	
	public void setHeight(double height) {this.height=height;};
	public void setBase(double base) {this.base=base;};

	Triangle(double height, double base) {
		this.height=height; this.base=base;
	}
	public double area(double height, double base) {
		super.setSize(height*base/2);
		return super.getSize();
	}
	public double circunference(double height,double base) {
		height=Math.pow(height, 2);
		base=Math.pow(base, 2);
		super.setSize(getHeight()+getBase()+Math.sqrt(height+base));
		return super.getSize();
	}
	@Override
	public String toString() {
		return "�غ�: "+getBase()+"����: "+getHeight()+
				"����: "+area(getHeight(),getBase())+"�ѷ�: "
				+circunference(getHeight(),getBase());
	}
}
