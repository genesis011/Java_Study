package solution;

public class Rectangle {
	public int width;
	public int height;

	public Rectangle() {
		super();
		this.width = width;
		this.height = height;
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public Rectangle(int width, int height) {
		width = width;
		height = height;
	}

	public int getArea() {
		return width * height;
	}
	public void CompareTo(Object obj) {
		Rectangle CompareRec;
		
		if(obj instanceof Rectangle) {
			CompareRec=(Rectangle)obj;
		}else{
			return;
		}

	}
}
