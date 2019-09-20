package myTest;

import java.io.Serializable;

public class Data implements Serializable {
	public String ip;
	public String year;
	public String name;

	public Data(String ip, String year, String name) {
		super();
		this.ip = ip;
		this.year = year;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [ip=" + ip + ", year=" + year + ", name=" + name + "]";
	}
}
