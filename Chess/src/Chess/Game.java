package Chess;

public class Game {
	public static void main(String[] args) {
		Board b = new Board();
		b.printBoard();
		Move move1 = new Move(6, 4, 4, 4);
		System.out.println(b.checkLegal("e4"));
		b.updateBoard(move1);
		b.printBoard();
	}
}
