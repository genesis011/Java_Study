package chapter10.View_controll_Test2;

import javafx.beans.property.SimpleStringProperty;

public class Phone {
	private SimpleStringProperty amartPhone;
	private SimpleStringProperty image;
	
	public Phone(String smartPhone, String image) {
		this.amartPhone = new SimpleStringProperty(smartPhone);//����Ʈ ��
		this.image =new SimpleStringProperty (image) ; //�̹���
	}
// ���ͽ� ���ͽ��� �����. /����Ʈ��
	public String getAmartPhone() {//���ڿ��� �ٲ�� �Ѵ�.
		return amartPhone.get();
	}

	public void setAmartPhone(String amartPhone) {// ��ü��� �����Ƿ� ���� �ٸ��� �־��
		this.amartPhone.set(amartPhone);
//		this.amartPhone = new SimpleStringProperty(amartPhone);
	}
//	�̹����� �����
	public String getImage() { // ���ڿ��� �ٲ�� �Ѵ�.
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
