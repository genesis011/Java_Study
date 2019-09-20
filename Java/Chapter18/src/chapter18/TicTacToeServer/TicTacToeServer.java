package chapter18.TicTacToeServer;

import java.io.IOException;
import java.net.ServerSocket;

// 소스를 입력하고 Ctrl+Shift+o를 눌러서 필요한 파일을 포함한다.
public class TicTacToeServer {

	public static void main(String[] args) throws IOException {
//		포트번호 9001번을 게임 서버의 포트로 사용된다.
		ServerSocket ss = new ServerSocket(9001);
		System.out.println("Tic Tac Toe 서버가 시작되었습니다.");
		try {
			while (true) {
				Game game = new Game();// 새로운 게임을 생성한다.
//				경기자를 나타내는 객체를 2개 생성한다.
				Player player1 = new Player(game, ss.accept(), 'X');
				Player player2 = new Player(game, ss.accept(), 'O');
//				상대방이 누구인지 알린다.
				player1.setOther(player2);
				player2.setOther(player1);
//				경기자가 2명 모집되면 게임을 시작한다.
				player1.start();
				player2.start();
				System.out.println("페어가 만들어 졌습니다.");
			} // end of while
		} finally {ss.close();} // end of try
	} // end of main
} // end of TicTacToeServer
