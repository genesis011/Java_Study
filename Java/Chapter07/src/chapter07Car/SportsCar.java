package chapter07Car;

public class SportsCar extends Car {

	private static int speed;
	@SuppressWarnings("unused")
	private boolean turbo;
	boolean dturbo;
	
	
	public SportsCar() {
		super(speed);
		System.out.println("SportsCar»ý¼ºÀÚ");
	}

	public void setTurbo(boolean turbo) {
		this.turbo=turbo;
		Car.myCar=20;
	}
}
