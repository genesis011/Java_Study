package chapter10.View_controll;

import javafx.beans.property.SimpleStringProperty;

public class Phone {
	private SimpleStringProperty amartPhone;
	private SimpleStringProperty image;
	
	public Phone(String smartPhone, String image) {
		this.amartPhone = new SimpleStringProperty(smartPhone);
		this.image =new SimpleStringProperty (image) ;
	}

	public String getAmartPhone() {
		return amartPhone.get();
	}

	public void setAmartPhone(String amartPhone) {
		this.amartPhone.set(amartPhone);
//		this.amartPhone = new SimpleStringProperty(amartPhone);
	}

	public String getImage() {
		return image.get();
	}

	public void setImage(String image) {
		this.image.set(image);
//		this.image =new SimpleStringProperty(image);
	}

	@Override
	public String toString() {
		return "Phone [amartPhone=" + amartPhone.get() + ", image=" + image.get() + "]";
	}
	
	
	
	
}
