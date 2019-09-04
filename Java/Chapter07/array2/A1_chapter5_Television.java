package array2;

public class A1_chapter5_Television {

	// 1. ¸â¹ö º¯¼ö(setters)
	public int channel;
	public int volume;
	public boolean onOff;

	// 2. ¸â¹öÇÔ¼ö
	public A1_chapter5_Television() {
		this.channel = 0;
		this.volume = 0;
		this.onOff = false;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}

	// 3.¸â¹öÇÔ¼ö(getters)

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean getOnOff() {
		return onOff;
	}
}
