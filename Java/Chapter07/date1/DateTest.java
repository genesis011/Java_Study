package date1;

public class DateTest {

	public static void main(String[] args) {

		Date date = new Date(2020, 3, 20);

		System.out.println("year" + date.getYear());
		System.out.println("month" + date.getMonth());
		System.out.println("day" + date.getDay());

		date.setYear(2019);
		date.setMonth(8);
		date.setDay(20);

		date.print();

	}
}
