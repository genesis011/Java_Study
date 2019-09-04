package shapeTest;

public class CarTest1 {

	public static void main(String[] args) {
		Car1 firstCar = new Car1("BMW520d");
		Car1 secondCar = new Car1("BMW520d");
		if (firstCar.equals(secondCar)) {
			System.out.println("동일한 종류의 자동차입니다.");
		} else {
			System.out.println("동일한 차종이 아닙니다.");
		}
	}
}
