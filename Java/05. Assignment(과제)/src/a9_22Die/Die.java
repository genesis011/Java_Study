package a9_22Die;
public class Die {
	private int value;
	private int num;
	public Die() {
		value = 1;
	}
	public int roll() {
		num = (int) (Math.random() * 6 + 1);
		return num;
	}
	public void setValue(int v) {
		value = v;
	}
	public String toString() {
		return ("현재 주사위 상태 : " + roll());
	}
	public void result(Die d) {
		if (this.roll() < d.roll()) {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		else if (this.roll() > d.roll()) {
			System.out.println("사용자가 이겼습니다.");
		}
		else {
			System.out.println("비겼습니다.");
		}
	}
}
