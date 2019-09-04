package movie4;

public class Cube {
//	private double side; // 정육면체의 한 변
//
//	public double getSide() {
//		return side;
//	}
//
//	public double getVolume() {
//		return side * side * side;
//	}
//
//	public Cube() {
//		side = 0;
//	}
//}

	private double side; // 정육면체의 한 변

	public double getSide() {
		return side;
	}

	public double getVolume() {
		return side * side * side;
	}

	public Cube() {
		side = 0;
	}

	public Cube(double side) {
		this.side = side;
	}
}