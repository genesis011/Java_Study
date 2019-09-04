package numberBox;

public class numberboxtest {

	public static void main(String[] args) {
		numberbox box = new numberbox(10, 1.2345f);
		box.printer();

		box.setIvalue(20);
		box.setFvalue(5.435f);
		

		box.printer();
		System.out.println("multP = "+box.multP());
	}

}
