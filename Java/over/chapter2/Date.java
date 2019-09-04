package chapter2;

public class Date {
	private int year; private int month;
	private int day;

	public Date() {
		this.year = 0; this.month = 0;
		this.day = 0;
	}
	
	public Date(int year, int month, int day) {
		this.year = year; this.month = month;
		this.day = day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public int getDay() {
		return day;
	}	
	public int getMonth() {
		return month;
	}
	public void print1() {
		System.out.print("Year " + this.year +" ");
		System.out.print("Month " + this.month +" ");
		System.out.print("Day " + this.day +" ");
		System.out.println("\n");
	}
	public void print2() {
		System.out.print(this.year + " ");
		switch (this.month) {
		case 1:System.out.print("1월 ");
		break;
		case 2:System.out.print("2월 ");
		break;
		case 3:System.out.print("3월 ");
		break;
		case 4:System.out.print("4월 ");
		break;
		case 5:System.out.print("5월 ");
		break;
		case 6:System.out.print("7월 ");
		break;
		case 7:System.out.print("7월 ");
		break;
		case 8:System.out.print("8월 ");
		break;
		case 9:System.out.print("9월 ");
		break;
		case 10:System.out.print("10월 ");
		break;
		case 11:System.out.print("11월 ");
		break;
		case 12:System.out.print("12월 ");
		break;
		}
		System.out.print(this.day + " ");		
	}
}
