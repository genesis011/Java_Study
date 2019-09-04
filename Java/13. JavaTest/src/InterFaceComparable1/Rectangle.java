package InterFaceComparable1;

public class Rectangle implements Compareble{
	public int width;
	public int height;
	public Rectangle( int width, int height) {
		super();
		this.width=width;
		this.height=height;
		System.out.println(this);
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	public int getArea() {
		return this.width*this.height;
	}
	public int compareTo(Object obj) {
		Rectangle comRec=null;
		int returnValue=0;
		if(obj instanceof Rectangle) {
			comRec = (Rectangle)obj;
			if(this.getArea()<comRec.getArea()) {
				returnValue = -1;
			}else if(this.getArea()>comRec.getArea()) {
				returnValue = 1;
			}else {
				returnValue = 0;
			}
		}
		
		return returnValue;
	
	}
	
}
