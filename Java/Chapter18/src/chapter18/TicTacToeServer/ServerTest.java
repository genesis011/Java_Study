package chapter18.TicTacToeServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(9001);
		System.out.println("게임이 시작되었습니다,");
		while (true) {
			Game game = new Game();
			Socket socket = ss.accept();
			Player player1 = new Player(game, socket, 'x');
			Socket socket1 = ss.accept();
			Player player2 = new Player(game, socket1, 'o');
			player1.start();
			player2.start();
		} // end of while
	}

	// Game 클래스 설계
	public static class Game {
		private char[][] boards = new char[3][3];

		public synchronized char setBoards(int i, int j, char playerMark) {
			return boards[i][j] = playerMark;
		}

		public synchronized char getBoards(int i, int j) {
			return boards[i][j];
		}

		public synchronized void printBoard() {
			for (int k = 0; k < 3; k++) {
				System.out.println(" " + boards[k][0] + " | " + boards[k][1] + " | " + boards[k][2]);
				if (k != 2) {
					System.out.println("---|---|---");
				}
			}
		}
	}

//  Player 클래스 설계
	public static class Player extends Thread {
		public Game game;
		public Socket socket;
		public BufferedReader br;
		public PrintWriter pw;
		public Player other;
		public char playerMark;

		public Player(Game game, Socket socket, char playerMark) {
			this.game = game;
			this.socket = socket;
			this.playerMark = playerMark;
			try {
				this.br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				this.pw = new PrintWriter(socket.getOutputStream(), true);
				pw.println("START " + playerMark);
				pw.println("PRINT 다른경기자를 기다리고 있습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			pw.println("PRINT 모두경기자가 연결되었습니다.");
			if (playerMark == 'x') {
				pw.println("PRINT 당신차례입니다.");
			}
			try {
				while (true) {
					String command = br.readLine();
					if (command.startsWith("MOVE")) {
						int i = Integer.parseInt(command.substring(5, 6));
						int j = Integer.parseInt(command.substring(7, 8));
						game.setBoards(i, j, playerMark);
						game.printBoard();
						other.pw.println("OTHER " + i + " " + j);
						pw.println("PRINT 기다리세요!");
						other.pw.println("PRINT 당신 차례입니다.");
					} else if (command.startsWith("QUIT")) {
						break;
					}
				}
			} catch (IOException e) {

			} finally {
				try {
					pw.close();
					br.close();
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}// run() of end
	}
}
