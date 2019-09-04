package chapter03;

public class B9_Test {

	public static void main(String[] args) {
		int number=0;
		number=(int)(Math.random()*(200-100+1)+100);
		toBinaryString(number);

	}
	
	public static void toBinaryString(int number) {
		String str=Integer.toBinaryString(number);
		while (str.length()<32) {
			str="0"+str;
			
		}
		System.out.println(number+"ÀÌÁøÁ¢="+str);
	}
}
