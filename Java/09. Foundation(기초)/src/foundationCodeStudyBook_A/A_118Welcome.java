package foundationCodeStudyBook_A;

import java.sql.Date;

public class A_118Welcome {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date date = new Date(0);
		int currentHour = date.getHours(); // �帧 : current
		System.out.print("���� �ð��� : " + date);
		if (currentHour < 11) {
			System.out.println("Good morning");
		} else if (currentHour < 15) {
			System.out.println("Good afternoon");
		} else if (currentHour < 20) {
			System.out.println("Good evening");
		} else {
			System.out.println("Good night");
		}
	}
}
