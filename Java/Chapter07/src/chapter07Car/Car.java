package chapter07Car;

public class Car {
	protected int speed;
	int dspeed;
	public static int myCar;

	public Car(int speed) {
		super();
		System.out.println("�θ� ������");
		this.speed = speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
