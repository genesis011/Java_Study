package a_07_14Event;

public class UnderGraduate extends Student {
	//1. 멤버변수 : 동아리
	private String club;
	//2. 생성자 : 매개변수 있는 생성자를 (이름, 학번 소속학과,학년,이수학점 부모를 책임져야됨 5개매개변수 책임)

	public UnderGraduate() {
		this(null,0,null,0,0,null);
	
	}
	public UnderGraduate(String club) {
		this(null,0,null,0,0,club);
		
	}

	public UnderGraduate(String name, int number, String major, int grade, int score, String club) {
		super(name, number, major, grade, score);
		this.club=club;
	}
	//3. 함수 : grtter. setter, toString
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	@Override
	public String toString() {
		return "UnderGraduate [club=" + club + "]"+super.toString();
	}
	
}
