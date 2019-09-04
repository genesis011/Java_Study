package chapter05Test;

public class Box {
	public static void main(String[] args) {
		BoxTest box = new BoxTest();
		System.out.println("width=" + box.getWidth());
		System.out.println("width=" + box.getLength());
		System.out.println("width=" + box.getHeight());

		box.setWidth(20);
		box.setLength(20);
		box.setHeight(30);

		System.out.println("width" + box.getWidth());
		System.out.println("width" + box.getLength());
		System.out.println("width" + box.getHeight());
		System.out.println("부피 값은 = " + box.boxVolume());
	}
}
