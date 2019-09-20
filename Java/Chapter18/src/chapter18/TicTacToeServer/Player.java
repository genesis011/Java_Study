package chapter18.TicTacToeServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Player extends Thread {
	Game game;// 경기자가 속한 게임을가리킨다.
	Socket socket;// 현재 경기에 연결된 소켓
	BufferedReader input;// 소켓에서 얻은 출력 스트림
	PrintWriter output;// 소켓에서 얻은 출력 스트림
	char playerMark;// 현재 경기자가 'X'인지 'O'인지 나타낸다.
	Player other;// 상대방 경기자 객체

	public Player(Game game, Socket socket, char playerMaek) {
		this.game = game;
		this.socket = socket;
		this.playerMark = playerMaek;
		try {
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			output = new PrintWriter(socket.getOutputStream(), true);
			output.println("START" + playerMaek);
			output.println("PRINT 다른 경기자를 기다립니다.");
		} catch (IOException e) {System.out.println("연결이 끊어졌습니다." + e);}
	} // end of Player

	public void setOther(Player other) {
		this.other = other;
	} // end of setOther

	public void run() {
		try {
			output.println("PRINT 모든 경기자가 연결되었습니다.");
			if (playerMark == 'X') {
				output.println("PRINT 당신 차례입니다.");
			}
//			클라이언트로부터 명령어를 받아서 처리한다.
			while (true) {
				String commend = input.readLine();
				if (commend == null)
					continue;
				if (commend.startsWith("MOVE")) {// MOVE명령어
					int i = Integer.parseInt(commend.substring(5, 6));
					int j = Integer.parseInt(commend.substring(7, 8));
					game.setBoard(i, j, playerMark);
					game.printBorad();
					other.output.println("OTHER" + i + " " + j);
					output.println("PRINT 기다리세요!");
					other.output.println("PRINT 당신 차례입니다.");
				} else if (commend.startsWith("QUIT")) { // QUIT 명령어
					return;
				}
			} // end of while
		} catch (IOException e) { // end of try
			System.out.println("연결이 끊어졌습니다." + e);
		}finally {
			try {socket.close();}catch(IOException e) {}
		}
	}// end of run
} // end of Player Class
