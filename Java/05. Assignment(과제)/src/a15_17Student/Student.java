package a15_17Student;

public class Student {
	private String name;
	private String address;
	private String phone;
	public Student(String name, String address, String phone) {
		super();
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	public int compareTo(Object obj) {
		Student stu=null;
		if(obj instanceof Student) {
			stu=(Student)obj;
		}
		return phone.compareTo(stu.phone);
	}
}
