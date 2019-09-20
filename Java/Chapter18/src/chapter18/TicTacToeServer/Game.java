package chapter18.TicTacToeServer;

// 하나의 게임을 나타내는 클래스이다.
public class Game {
	char[][] boards = new char[3][3];
//	2차원 문자 배열을 이용하여서 보드를 나타낸다.

	public void setBoard(int i, int j, char playerMark) {
		boards[i][j] = playerMark;
	} // end of setBoard

	public char getBoard(int i, int j) {
		return boards[i][j];
	} // end of getBoard
//	보드의 현재 상태를 콘솔에 출력한다.
	public void printBorad() {
		for(int k=0; k<3;k++) {
			System.out.println(" "+boards[k][0]+"| "+boards[k][1]+"| "+boards[k][2]);
			if(k!=2) {
				System.out.println("---|---|---");
			} //end of if
		} // end of for
	} // end of printBorad
} // end of Game Class
