package a_07_09Person;

public class Person {
	String name, address, pnumber;

	public Person() {
		name = null;
		address = null;
		pnumber = null;
	}
	public Person(String name, String address, String pnumber) {
		this.name = name;
		this.address = address;
		this.pnumber = pnumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}
	public String getName(String name) {
		return this.name;
	}
	public String getAddress(String address) {
		return this.address;
	}
	public String getPnumber(String pnumber) {
		return this.pnumber;
	}
	public void print() {
		System.out.println("이름: " + this.name);
		System.out.println("주소: " + this.getAddress(address));
		System.out.println("전화번호: " + this.getPnumber(pnumber));
	}
}
