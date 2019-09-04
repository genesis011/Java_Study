package a9_22Die;

public class DieTest {

	public static void main(String[] args) {
		Die d = new Die();
		Die d1 = new Die();
		System.out.println("사용자 " + d.toString());
		System.out.println("컴퓨터 " + d1.toString());
		d.result(d);
	}
}
