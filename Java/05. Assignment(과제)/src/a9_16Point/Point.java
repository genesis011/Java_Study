package a9_16Point;

class Point2D{
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x=x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y=y;
	}
}
class Point3D extends Point2D{
	private int z;

	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z=z;
	}
}
