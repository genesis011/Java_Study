package chapter5;

public class Dog {

	private String breed;
	private int age;
	private String color;

	@SuppressWarnings("unused")
	public Dog() {
		breed=null;
		age=0;
		color=null;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	

	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}
	
	public String getColor() {
		return color;
	}
	public void barking() {
		System.out.println(color+" "+age+"��"+breed+"�� ¢�� �ֽ��ϴ�.");
	}
	public void hungry() {
		System.out.println(color+" "+age+"��"+breed+"�� ������ٰ� �մϴ�.");
	}
	public void sleeping() {
		System.out.println(color+" "+age+"��"+breed+"�� �ڰ� �ֽ��ϴ�.");
	}

	public void printer() {
		System.out.println("���� : "+getBreed());
		System.out.println("���� : "+getAge());
		System.out.println("���� : "+getColor());
	}

}