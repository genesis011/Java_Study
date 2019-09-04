package chapter07EmloyeeManager;

public class Emloyee {
	public String name;
	String address;
	protected int salary;
	private int rrn;
	
	public Emloyee(String name, String address,
			int salary, int rrn) {
		this.name=name;
		this.address=address;
		this.salary=salary;
		this.rrn=rrn;
	}

	@Override
	public String toString() {
		return "Emloyee [name=" + name +
				", address=" + address + ", salary=" 
				+ salary + ", rrn=" + rrn + "]";
	}
}
