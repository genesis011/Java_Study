package shapeTest;

public class CarTest1 {

	public static void main(String[] args) {
		Car1 firstCar = new Car1("BMW520d");
		Car1 secondCar = new Car1("BMW520d");
		if (firstCar.equals(secondCar)) {
			System.out.println("������ ������ �ڵ����Դϴ�.");
		} else {
			System.out.println("������ ������ �ƴմϴ�.");
		}
	}
}
