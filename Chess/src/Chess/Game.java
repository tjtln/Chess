package Chess;

public class Game {
	public static void main(String[] args) {
		Board b = new Board();
		b.printBoard();
		Move move1 = b.returnMove("e4");
		Move move2 = b.returnMove("Bg5");
		Move move3 = b.returnMove("Bxf7");
		b.updateBoard(move1);
		b.isInCheck(move1);
		b.updateBoard(move2);
		b.isInCheck(move2);
		b.isInCheck(move3);
	}
}
