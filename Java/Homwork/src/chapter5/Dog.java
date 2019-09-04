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
		System.out.println(color+" "+age+"살"+breed+"가 짖고 있습니다.");
	}
	public void hungry() {
		System.out.println(color+" "+age+"살"+breed+"가 배고프다고 합니다.");
	}
	public void sleeping() {
		System.out.println(color+" "+age+"살"+breed+"가 자고 있습니다.");
	}

	public void printer() {
		System.out.println("종류 : "+getBreed());
		System.out.println("나이 : "+getAge());
		System.out.println("색깔 : "+getColor());
	}

}