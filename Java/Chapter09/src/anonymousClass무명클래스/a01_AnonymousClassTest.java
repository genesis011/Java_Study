package anonymousClass무명클래스;
	interface RemoteControl{
		void turnOn();
		void turnOff();
	}
public class a01_AnonymousClassTest {

	public static void main(String[] args) {
		RemoteControl ac =new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("TV On");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV Off");
			}
		 };
		ac.turnOn();
		ac.turnOff();
	}
}
