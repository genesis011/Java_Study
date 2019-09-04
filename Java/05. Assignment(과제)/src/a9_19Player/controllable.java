package a9_19Player;

interface Player {
	void play();
	void stop();
}
public class controllable {
	public static void main(String[] arg) {
		Player player =new Player() {
			
			@Override
			public void stop() {
				System.out.println("PLAY");				
			}			
			@Override
			public void play() {
				System.out.println("STOP");				
			}
		};
		player.play();
		player.stop();
	}
}
