package a_07_11Book;

public class Magazine extends Book { // ���
	private String Date;
	public Magazine(String theTitle, int thePages, String theAuthor, String theDate) {
		/* �� �κ��� ��ӹ��� �θ��� �����ڸ� ȣ���ϴ� ���Դϴ�. */
		super(theTitle, thePages, theAuthor);
		this.Date = Date;
	}
	public String toString() {
		return super.toString() + this.Date;
	}
	public static void main(String[] args) {

		Book n = new Book("�Ƿ���", 424, "soso");
		System.out.println(n);

	}
}