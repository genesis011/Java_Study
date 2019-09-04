package a_07_12Food;

public class Melon extends Food {

	private String farminfo;// 경작 농원 정보
// Melon 생성자 선언

	public Melon(int cal, int price, int weight, String farminfo) { // Melon클래스의 생성자

		super(cal, price, weight);
		this.farminfo = farminfo;
	}

	public String toString() {
		return "칼로리: " + super.cal + " 가격: " + super.price + " 무게: " + super.weight + " 농원정보: " + farminfo;
	}
}
