package chapter5;

public class DogTest {
	public static void main(String[] args) {
		
		Dog dog =new Dog();
		//std.printer();
		
		dog.setBreed("ǳ�갳");
		dog.setAge(11);
		dog.setColor("ȭ��Ʈ");
		dog.printer();
		dog.barking();
		dog.hungry();
		dog.sleeping();
	}
}
