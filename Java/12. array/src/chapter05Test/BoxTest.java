package chapter05Test;

public class BoxTest {

	public int width;
	public int length;
	public int height;

	public BoxTest() {
		this.width = 0;
		this.length = 0;
		this.height = 0;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public int getLength() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int boxVolume() {
		int volume = 0;
		volume = width * length * height;
		return volume;
	}
}
