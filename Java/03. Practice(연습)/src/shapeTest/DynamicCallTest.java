package shapeTest;
	class Animal{
		void sound() {
			System.out.println("Animal Å¬·¡½ºÀÇ sound()");
		}
	}
class Dog extends Animal{
	void sound() {
		System.out.println("¸Û¸Û");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("¾ß¿õ");
	}
}
	
public class DynamicCallTest {
	
	public static void main(String[] args) {
		Animal animal =new Animal();
		Dog dog= new Dog();
		Cat cat=new Cat();
		
		Animal obj;
		
		obj=animal;
		obj.sound();
		
		obj=dog;
		obj.sound();
		
		obj=cat;
		obj.sound();
	}
}
