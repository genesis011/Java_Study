package a_07_11Book;

class Book { // 일반적인 책을 나타내는 Book 클래스

	private String title; // 책의 제목
	private int numPages; // 책의 페이지 수
	private String author; // 책의 저자

// Book 생성자 선언
	public Book(String theTitle, int pages, String theAuthor) {
		this.title = theTitle;

		this.numPages = pages;
		this.author = theAuthor;

	}
	public String toString() {
		return "제목: " + this.title + " 페이지 수: " + this.numPages + " 책의 저자: " + this.author;
	}
}
