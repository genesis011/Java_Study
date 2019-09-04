package shapeTest;

public class Car1 {
	private String model;

	public Car1(String model) {
		this.model = model;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Car1)
			return model.equals(((Car1) obj).model);
		else
			return false;
	}
}