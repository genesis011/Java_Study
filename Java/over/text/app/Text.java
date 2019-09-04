package text.app;

public class Text {
	private String str;// 자음

	public Text() {
		this.str = null;
	}

	public Text(String str) {
		this.str=str;
	}

	public void print() {
		int con = 0;
		int vow = 0;

		for (int i = 0; i < str.length(); i++) { //자음과 모음을 구분하는 for문
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vow=vow+1;
			}else {
				con=con+1;
			}
		}
		System.out.println(con);
		System.out.println(vow);
	}
}
