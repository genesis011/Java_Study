package a_07_11Book;

public class Magazine extends Book { // 상속
	private String Date;
	public Magazine(String theTitle, int thePages, String theAuthor, String theDate) {
		/* 이 부분은 상속받은 부모의 생성자를 호출하는 것입니다. */
		super(theTitle, thePages, theAuthor);
		this.Date = Date;
	}
	public String toString() {
		return super.toString() + this.Date;
	}
	public static void main(String[] args) {

		Book n = new Book("의뢰인", 424, "soso");
		System.out.println(n);

	}
}