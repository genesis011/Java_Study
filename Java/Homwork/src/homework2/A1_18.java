package homework2;

public class A1_18 {

	public static void main(String[] args) {
		String[] type = {"Clubs", "Diamonds", "Hearts","Spades"};
		String[] num= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace",};
		for(int i=0;i<type.length;i++) {
			for(int j=0;j<1;j++) {
				System.out.println(type[(int)(Math.random()*(3-0+1)+0)]+"ÀÇ"+num[(int)(Math.random()*(12-0+1)+0)]);
			}
		}
	}
}
