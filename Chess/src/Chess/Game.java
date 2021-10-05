package Chess;

public class Game {
	public static void main(String[] args) {
		Board b = new Board();
		b.printBoard();
//		Move move1 = new Move(1, 1, 6, 6);
		Move move = b.returnMove("e4");
		System.out.println(move);
		System.out.println(b.isBlocked(move));
//		b.updateBoard(move1);
//		b.printBoard();
	}
}
