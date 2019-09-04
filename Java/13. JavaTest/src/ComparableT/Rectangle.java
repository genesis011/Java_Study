package ComparableT;

public class Rectangle implements Comparable {
	public int whidth;
	public int height;

	public Rectangle(int whidth, int height) {
		super();
		this.whidth = whidth;
		this.height = height;
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Rectangle [whidth=" + whidth + ", height=" + height + "]";
	}

	public int getArea() {
		return this.whidth * this.height;
	}

	@Override
	public int compareTo(Object obj) {
		Rectangle compareRect = null;
		Circle circle = null;

		int returnValue = 0;

		if (obj instanceof Rectangle) {
			Rectangle compareRec = (Rectangle) obj;

			if (this.getArea() < compareRec.getArea()) {
				returnValue = -1;
			} else if (this.getArea() > compareRec.getArea()) {
				returnValue = 1;
			} else {
				returnValue = 0;
			}
		} else if (obj instanceof Circle) {
			circle = (Circle) obj;

			if (this.getArea() < circle.getArea()) {
				returnValue = -1;
			} else if (this.getArea() > circle.getArea()) {
				returnValue = 1;
			} else {
				returnValue = 0;
			}
		}

		return returnValue;
	}
}
