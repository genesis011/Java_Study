package b_Car;

public class TestMain {

		public static void main(String[] args) {
			Opreator[] obj = {new Car(), new Bus(), new Sub()};
			for(int i=0;i<obj.length;i++) {
				obj[i].start();
				obj[i].stop();
				obj[i].setSpeed(80);
				obj[i].turn(60);
				System.out.println("=============");
			}
		}
}
