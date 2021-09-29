package Chess;

public class Board {
	Piece[][] grid;
	public Board() {
		grid = new Piece[8][8];
		grid[0][0] = new Rook(0, 0, State.Black);
		grid[0][7] = new Rook(0, 7, State.Black);
		grid[7][7] = new Rook(7, 7, State.White);
		grid[7][0] = new Rook(7, 0, State.White);
		grid[0][1] = new Knight(0, 1, State.Black);
		grid[0][6] = new Knight(0, 6, State.Black);
		grid[7][1] = new Knight(7, 1, State.White);
		grid[7][6] = new Knight(7, 6, State.White);
		grid[0][2] = new Bishop(0, 2, State.Black);
		grid[0][5] = new Bishop(0, 5, State.Black);
		grid[7][2] = new Bishop(7, 2, State.White);
		grid[7][5] = new Bishop(7, 5, State.White);
		grid[0][3] = new Queen(0, 3, State.Black);
		grid[0][4] = new King(0, 4, State.Black);
		grid[7][3] = new Queen(7, 3, State.White);
		grid[7][4] = new King(7, 4, State.White);
		for(int i = 0; i < 8; i++) {
			grid[1][i] = new Pawn(1, i, State.Black);
			grid[6][i] = new Pawn(6, i, State.White);
		}
	}
	public void printBoard(){
		for(int i = 0; i < 8; i++) {
			System.out.print("-----------------------------------------------\n");
			System.out.flush();
			for (int j = 0; j < 8; j++){
				System.out.print("|");
				System.out.flush();
				if(grid[i][j] == null) {
					System.out.print("   ");
				} else {
					Identifier k = grid[i][j].getIdentifier();
					switch(k) {
					case Pawn: 
						if(grid[i][j].getColor() == State.White) {
							System.out.print(" P ");
							System.out.flush();
						} else {
						System.err.print(" P ");
						System.err.flush();
						}
						break;
					case Rook:
						if(grid[i][j].getColor() == State.White) {
							System.out.print(" R ");
							System.out.flush();
						} else {
							System.err.print(" R ");
							System.err.flush();
						}
						break;
					case Bishop:
						if(grid[i][j].getColor() == State.White) {
							System.out.print(" B ");
							System.out.flush();
						} else {
							System.err.print(" B ");
							System.err.flush();
						}
						break;
					case Knight:
						if(grid[i][j].getColor() == State.White) {
							System.out.print(" N ");
							System.out.flush();
						} else {
							System.err.print(" N ");
							System.err.flush();
						}
						break;
					case Queen:
						if(grid[i][j].getColor() == State.White) {
							System.out.print(" Q ");
							System.out.flush();
						} else {
							System.err.print(" Q ");
							System.err.flush();
						}
						break;
					case King:
						if(grid[i][j].getColor() == State.White) {
							System.out.print(" K ");
							System.out.flush();
						} else {
							System.err.print(" K ");
							System.err.flush();
						}
						break;
					}
				}
			}
			System.out.print("|");
			System.out.println("");
			System.out.flush();
		}
		System.out.print("----------------------------");
		System.out.flush();
	}
	public boolean checkLegal(String move) {
		Identifier piece;
		char k = move.charAt(0);
		switch(k) {
		case 'K':
			piece = Identifier.King;
			break;
		case 'Q':
			piece = Identifier.Queen;
			break;
		case 'R':
			piece = Identifier.Rook;
			break;
		case 'N':
			piece = Identifier.Knight;
			break;
		case 'B':
			piece = Identifier.Bishop;
			break;
		default:
				piece = Identifier.Pawn;
		}
		char startRow;
		char startCol;
		char endRow = move.charAt(move.length() - 1);
		char endCol = move.charAt(move.length() - 1);
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(grid[i][j].getIdentifier() == piece) {
					
				}
			}
		}
		return false;
	}
}
