package chapter5;

public class DogTest {
	public static void main(String[] args) {
		
		Dog dog =new Dog();
		//std.printer();
		
		dog.setBreed("풍산개");
		dog.setAge(11);
		dog.setColor("화이트");
		dog.printer();
		dog.barking();
		dog.hungry();
		dog.sleeping();
	}
}
