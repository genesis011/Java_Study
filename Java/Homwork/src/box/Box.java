package box;

public class Box {
	private int width, length, height;
	private boolean empty = false;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public boolean isEmpty() {
		return empty;
	}
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	@Override
	public String toString() {
		return "Box [width=" + width + ", length=" + length + ", height=" + height + ", empty=" + empty + "]";
	}
	public Box() {
		this(0, 0, 0, true);
	}
	public Box(int w, int l, int h, boolean t) {
		width = w;
		length = l;
		height = h;
		empty = t;
	}
}