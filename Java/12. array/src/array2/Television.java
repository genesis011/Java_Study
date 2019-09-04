package array2;

public class Television {

	public static void main(String[] args) {
		A1_chapter5_Television television = new A1_chapter5_Television();
		System.out.println("television=" + television.getChannel());
		System.out.println("volume=" + television.getVolume());
		System.out.println("onOff=" + television.getOnOff());

		television.setChannel(20);
		television.setVolume(40);
		television.setOnOff(true);

		System.out.println("television" + television.getChannel());
		System.out.println("volume" + television.getVolume());
		System.out.println("onOff" + television.getOnOff());

	}
}
