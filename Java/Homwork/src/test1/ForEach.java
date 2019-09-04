package test1;

public class ForEach {

	// 1.멤버변수
	private int[] numbers;

	// 2.생성자함수
	public ForEach() {
		numbers = new int[] { 10, 20, 30 };
	}

	public ForEach(int[] numbers) {
		this.numbers = numbers;
	}
	
	// 3.멤버함수
	public void forPrint() {
		for(int i=0;i<numbers.length;i++) {
			System.out.print("\t"+numbers[i]);
		}
	}
	
	public void forEachPrint() {
		for(int number:numbers) {
			System.out.print("\n"+number);
		}
	}
}
