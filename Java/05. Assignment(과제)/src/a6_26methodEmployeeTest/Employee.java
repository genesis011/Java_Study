package a6_26methodEmployeeTest;

public class Employee {
	private String name;
	private String tel;
	private int salary; //����
	
	public Employee () {
		this.name=null;
		this.tel=null;
		this.salary=0;
	}
	public Employee(String name, String tel, int salary) {
		this.name=name;
		this.tel=tel;
		this.salary=salary;
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTel(String tel) {
		this.tel =  tel;
	}

	public void setSal(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public int getSal() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", tel=" + tel + ", salaryl=" + salary + "]";
	}
}
