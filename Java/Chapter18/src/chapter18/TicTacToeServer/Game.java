package chapter18.TicTacToeServer;

// �ϳ��� ������ ��Ÿ���� Ŭ�����̴�.
public class Game {
	char[][] boards = new char[3][3];
//	2���� ���� �迭�� �̿��Ͽ��� ���带 ��Ÿ����.

	public void setBoard(int i, int j, char playerMark) {
		boards[i][j] = playerMark;
	} // end of setBoard

	public char getBoard(int i, int j) {
		return boards[i][j];
	} // end of getBoard
//	������ ���� ���¸� �ֿܼ� ����Ѵ�.
	public void printBorad() {
		for(int k=0; k<3;k++) {
			System.out.println(" "+boards[k][0]+"| "+boards[k][1]+"| "+boards[k][2]);
			if(k!=2) {
				System.out.println("---|---|---");
			} //end of if
		} // end of for
	} // end of printBorad
} // end of Game Class
