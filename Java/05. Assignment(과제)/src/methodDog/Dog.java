package methodDog;

public class Dog {
	private String name;
	public String breed;
	private int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}
}
