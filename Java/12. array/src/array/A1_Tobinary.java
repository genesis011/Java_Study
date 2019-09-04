package array;

public class A1_Tobinary {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			int number = (int) (Math.random() * (150 - 50 + 1) + 50);
			String num=Integer.toBinaryString(number);
			while (num.length() < 16) {
				num="0"+num;
			}
			System.out.println(i+"번째 "+number+" 2진 법은 :"+num);
		}
		
	}
}
