package InterFaceComparable;

public class Rectangle implements Comparable{
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	@Override
	public int compareTo(Object obj) {
		Rectangle compareRec = null;
		int recResult = 0;
		
		if(obj instanceof Rectangle) {
			compareRec = (Rectangle)obj;
			
			if(this.width<compareRec.width) {
				recResult =  -1;
			}else if(this.width>compareRec.width) {
				recResult =1;
			}else {
				recResult = 0;				
			}
		}
		return recResult;
	}
}
