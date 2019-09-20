package chapter18.TicTacToeServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Player extends Thread {
	Game game;// ����ڰ� ���� ����������Ų��.
	Socket socket;// ���� ��⿡ ����� ����
	BufferedReader input;// ���Ͽ��� ���� ��� ��Ʈ��
	PrintWriter output;// ���Ͽ��� ���� ��� ��Ʈ��
	char playerMark;// ���� ����ڰ� 'X'���� 'O'���� ��Ÿ����.
	Player other;// ���� ����� ��ü

	public Player(Game game, Socket socket, char playerMaek) {
		this.game = game;
		this.socket = socket;
		this.playerMark = playerMaek;
		try {
			input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			output = new PrintWriter(socket.getOutputStream(), true);
			output.println("START" + playerMaek);
			output.println("PRINT �ٸ� ����ڸ� ��ٸ��ϴ�.");
		} catch (IOException e) {System.out.println("������ ���������ϴ�." + e);}
	} // end of Player

	public void setOther(Player other) {
		this.other = other;
	} // end of setOther

	public void run() {
		try {
			output.println("PRINT ��� ����ڰ� ����Ǿ����ϴ�.");
			if (playerMark == 'X') {
				output.println("PRINT ��� �����Դϴ�.");
			}
//			Ŭ���̾�Ʈ�κ��� ��ɾ �޾Ƽ� ó���Ѵ�.
			while (true) {
				String commend = input.readLine();
				if (commend == null)
					continue;
				if (commend.startsWith("MOVE")) {// MOVE��ɾ�
					int i = Integer.parseInt(commend.substring(5, 6));
					int j = Integer.parseInt(commend.substring(7, 8));
					game.setBoard(i, j, playerMark);
					game.printBorad();
					other.output.println("OTHER" + i + " " + j);
					output.println("PRINT ��ٸ�����!");
					other.output.println("PRINT ��� �����Դϴ�.");
				} else if (commend.startsWith("QUIT")) { // QUIT ��ɾ�
					return;
				}
			} // end of while
		} catch (IOException e) { // end of try
			System.out.println("������ ���������ϴ�." + e);
		}finally {
			try {socket.close();}catch(IOException e) {}
		}
	}// end of run
} // end of Player Class
