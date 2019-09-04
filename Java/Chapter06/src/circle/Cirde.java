package circle;

public class Cirde {
	private int radius;
	private Point point;
	public Cirde() {
		this.radius=0;
		this.point=null;
	}
	
	public Cirde(Point point,int radius) {
		this.radius=radius;
		this.point=point;
	}

	@Override
	public String toString() {
		return "Cirde [radius=" + radius + ", Point=" + point + "]";
	}
	
}
