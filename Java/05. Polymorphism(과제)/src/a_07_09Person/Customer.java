package a_07_09Person;
public class Customer extends Person {
	String id;
	int mileage;
	int customnum;
	public Customer() {
		this.id = null;
		this.mileage = 0;
		this.customnum = 0;
	}
	public Customer(String name, String address, String pnumber, int mileage, int customnum, String id) {
		super.name = name;
		super.address = address;
		super.pnumber = pnumber;
		this.mileage = mileage;
		this.customnum = mileage;
		this.id = id;
	} 
	public void setId(String id) {
		this.id = id;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public void setCustomnum(int customnum) {
		this.customnum = customnum;
	}
	public String getId(String id) {
		return this.id;
	}
	public int getMileage(int mileage) {
		return this.mileage;
	}
	public int getCustomnum(int customnum) {
		return this.customnum;
	}

	public void print1() {
		System.out.println("이름: " + this.name);
		System.out.println("주소: " + this.getAddress(address));
		System.out.println("전화번호: " + this.getPnumber(pnumber));
		System.out.println("마일리지: " + this.mileage);
		System.out.println("고객번호: " + this.customnum);
		System.out.println("아이디: " + this.getId(id));
	}
}
