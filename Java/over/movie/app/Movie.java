package movie.app;

public class Movie {
	private String name;
	private int grade;//평점
	private String director;//감독
	private int year;
	
	public Movie() {
		this.name=null;
		this.grade=0;
		this.director=null;
		this.year=0;
	}
	public Movie(String name,int grade, String director, int year) {
		this.name=name; this.grade=grade;
		this.director=director; this.year=year;
	}
	public void setName(String name) {
		this.name=null;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public void setDirector(String director) {
		this.director=director;
	}
	public void setYear(int year) {
		this.year=year;
	}
	
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public String getDirector() {
		return director;
	}
	public int getYear() {
		return year;
	}
	
	public void print() {
		System.out.println("영화제목 : " + this.name);
		System.out.println("평     점 : " + this.grade + "점");
		System.out.println("감     독 : " + this.director);
		System.out.println("연     도 : " + this.year);
	}

}
