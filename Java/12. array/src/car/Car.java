package car;

public class Car {
	public String color;
	public int gear;
	public int speed;

	public Car(String color, int gear, int speed) {
		this.color = color;
		this.gear = gear;
		this.speed = speed;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void changeGear(int gear) {
		this.gear = gear;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public int getGear() {
		return gear;
	}

	public int getSpeed() {
		return speed;
	}
	public void printcar() {
		System.out.println("color = " + getColor());
		System.out.println("gear = " + getGear());
		System.out.println("speed = " + getSpeed());
	}
}
