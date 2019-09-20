package chapter18.TicTacToeServer;

import java.io.IOException;
import java.net.ServerSocket;

// �ҽ��� �Է��ϰ� Ctrl+Shift+o�� ������ �ʿ��� ������ �����Ѵ�.
public class TicTacToeServer {

	public static void main(String[] args) throws IOException {
//		��Ʈ��ȣ 9001���� ���� ������ ��Ʈ�� ���ȴ�.
		ServerSocket ss = new ServerSocket(9001);
		System.out.println("Tic Tac Toe ������ ���۵Ǿ����ϴ�.");
		try {
			while (true) {
				Game game = new Game();// ���ο� ������ �����Ѵ�.
//				����ڸ� ��Ÿ���� ��ü�� 2�� �����Ѵ�.
				Player player1 = new Player(game, ss.accept(), 'X');
				Player player2 = new Player(game, ss.accept(), 'O');
//				������ �������� �˸���.
				player1.setOther(player2);
				player2.setOther(player1);
//				����ڰ� 2�� �����Ǹ� ������ �����Ѵ�.
				player1.start();
				player2.start();
				System.out.println("�� ����� �����ϴ�.");
			} // end of while
		} finally {ss.close();} // end of try
	} // end of main
} // end of TicTacToeServer
