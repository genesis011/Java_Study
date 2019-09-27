package chapter10.View_controll_Test2;

import javafx.beans.property.SimpleStringProperty;

public class Phone {
	private SimpleStringProperty amartPhone;
	private SimpleStringProperty image;
	
	public Phone(String smartPhone, String image) {
		this.amartPhone = new SimpleStringProperty(smartPhone);//스마트 폰
		this.image =new SimpleStringProperty (image) ; //이미지
	}
// 겟터스 셋터스를 만든다. /스마트폰
	public String getAmartPhone() {//문자열로 바꿔야 한다.
		return amartPhone.get();
	}

	public void setAmartPhone(String amartPhone) {// 객체명과 같으므로 폰을 다르게 주어됨
		this.amartPhone.set(amartPhone);
//		this.amartPhone = new SimpleStringProperty(amartPhone);
	}
//	이미지를 만든다
	public String getImage() { // 문자열로 바꿔야 한다.
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
