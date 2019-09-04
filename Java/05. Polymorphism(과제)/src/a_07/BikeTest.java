package a_07;


class Bike {
	public int gear; //private가 자기 클래스 안에서만 접근이 가능하기 때문입니다.
	public int speed;
}
class MountainBike extends Bike {
	public int seatHeight;

	public MountainBike(int g) {

		super();
		gear = g;
		
	}
}
public class BikeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
