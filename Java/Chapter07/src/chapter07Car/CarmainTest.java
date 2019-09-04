package chapter07Car;

public class CarmainTest {

	public static void main(String[] args) {
		SportsCar sc = new SportsCar();
		// sc.speed=10; //부모 private speed
		// sc.depeed=10; //부모 defualt dspeed
		sc.setSpeed(10);// 부모 defualt dspeed
	}

}
