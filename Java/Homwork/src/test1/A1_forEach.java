package test1;

public class A1_forEach {

	public static void main(String[] args) {
		//1.멤버 배열를 3개 선언한다.
		//int[]numbers=new int[] {10,20,30};
		ForEach fe =new ForEach();//ForEach를 fe생략할 수 있음.
		//배열 객체를 일반포문을 활용하여 출력한다.
		//for(int i=0;i<numbers.length;i++) {
			//System.out.print("\t"+numbers[i]);
		//}
		//향상된 포문을 활용한다.
		//for(int number:numbers) {
			//System.out.print("\n"+number);
		//}
		
		fe.forPrint();
	}

}
