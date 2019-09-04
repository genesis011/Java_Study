package car;

import java.util.Scanner;

@SuppressWarnings("unused")
public class CarTest {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//String color=scan.nextLine();
		Car car = new Car("red", 2, 80);
		car.printcar();

		car.setColor("red");
		car.changeGear(4);
		car.setSpeed(80);

		car.printcar();
	}
}
