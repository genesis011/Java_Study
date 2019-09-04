package reverse.app;

public class Reverse {
	private String str;
	
	public Reverse() {
		this.str=null;
	}
	public Reverse(String str) {
		this.str=str;
	}
	public String reversePrint() {
		String sum=null;
		String result=null;
		for(int i=str.length()-1;i>=0;i--) {//그림그려보기
			sum=sum+str.charAt(i);
		}
		result=sum.replaceFirst("null","");
		return result;
	}
}
