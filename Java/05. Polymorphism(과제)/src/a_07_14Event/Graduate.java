package a_07_14Event;

public class Graduate extends Student {
	private static String[] defaultType= {"교육조교","연구조교"};
	//1. 멤버변수 : 조교유형(교육조교, 연구조교),장학금비율(0~1)
	private String assistType;
	private double scholarshepRate;
	//2. 생성자 : 매개변수 있는 생성자를 (이름, 학번 소속학과,학년,이수학점,조교유형,장학금비율; 부모를 책임져야됨 5개매개변수 책임)
	public Graduate(String assistType, double scholarshepRate) {
		this(null, 0, null, 0, 0, null, 0.0);
	}
	public Graduate(String name, int number, String major, int grade, int score,String assistType, double scholarshepRate) {
		super(name, number, major, grade, score);
		int returnValue=0;
		this.assistType="교육조교";
		for(int i=0;i<defaultType.length;i++) {
			returnValue=assistType.compareTo(defaultType[i]);	
			if(returnValue==0) {this.assistType=assistType;}
		}
		if(scholarshepRate>=0.0 && scholarshepRate<=1.0) {
			this.scholarshepRate=scholarshepRate;
		}else {
			this.scholarshepRate=1.0;
		}	
	}
	public String getAssistType() {
		return assistType;
	}
	public void setAssistType(String assistType) {
		this.assistType = assistType;
	}
	public double getScholarshepRate() {
		return scholarshepRate;
	}
	public void setScholarshepRate(double scholarshepRate) {
		this.scholarshepRate = scholarshepRate;
	}
	@Override
	public String toString() {
		return "Graduate [assistType=" + assistType + ", scholarshepRate=" + scholarshepRate + "]\n"+super.toString();
	}
}
