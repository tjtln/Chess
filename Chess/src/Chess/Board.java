package Chess;

import java.util.ArrayList;

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
			System.out.print("--------------------------------\n");
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
		System.out.println("--------------------------------");
		System.out.flush();
	}
	public Move returnMove(String move) {
		Identifier piece;
		char rowCol = move.charAt(1); //start row or column (e.g. N(a)b4)
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
		int allowedCounter = 0; //#  of pieces allowed to move to desired square
		ArrayList<Move> mtbd = new ArrayList<Move>();
		int endRow = Character.getNumericValue(move.charAt(move.length() - 1));
		int endCol = (move.charAt(move.length() - 2) - 97);
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(grid[i][j] != null) {
					if(grid[i][j].getIdentifier() == piece) {
						for(int l = 0; l < grid[i][j].possibleMoves().size(); l++) {
							if(grid[i][j].possibleMoves().get(l).getRow() == endRow && grid[i][j].possibleMoves().get(l).getCol() == endCol) {
								allowedCounter++;
								mtbd.add(grid[i][j].possibleMoves().get(l));
							}
						}
					}
				}
			}
		}
		if(allowedCounter > 1) {
			for (int i = 0; i < mtbd.size(); i++) {
				if(!(mtbd.get(i).getStartRow() == rowCol || mtbd.get(i).getStartCol() == rowCol)) {
					mtbd.remove(i);
				}
			}
		}
		if(mtbd.size() > 0) {
			return mtbd.get(0);
		}
		return null;
	}
	public boolean isOccupied(Move move) {
		if(grid[move.getRow()][move.getCol()] == null) {
			return false;
		} else if(grid[move.getStartRow()][move.getStartCol()].getIdentifier() == grid[move.getRow()][move.getCol()].getIdentifier()) {
			return true;
		}
		return false;
	}
	public boolean isBlocked(Move move) {
		int rowDifference = move.getRow() - move.getStartRow();
		int colDifference = move.getCol() - move.getStartCol();
		int i = rowDifference;
		int j = colDifference;
		if(i > 0) {
			i--;
		}
		if(i < 0) {
			i++;
		}
		if(j > 0) {
			j--;
		}
		if(j < 0) {
			j++;
		}
		
		while(i!=0 || j!=0) {
			if(grid[move.getStartRow() + i][move.getStartCol() + j] != null) {
				return true;
			}
			if(i > 0) {
				i--;
			}
			if(i < 0) {
				i++;
			}
			if(j > 0) {
				j--;
			}
			if(j < 0) {
				j++;
			}
		}
		return false;
		
	}
	public boolean isInCheck(Move move) {
		return true;
	}
	public void updateBoard(Move move) {
		Identifier i = grid[move.getStartRow()][move.getStartCol()].getIdentifier();
		switch(i) {
		case Rook: 
			grid[move.getRow()][move.getCol()] = new Rook(move.getRow(), move.getCol(), grid[move.getStartRow()][move.getStartCol()].getColor());
			break;
		case Pawn: 
			grid[move.getRow()][move.getCol()] = new Pawn(move.getRow(), move.getCol(), grid[move.getStartRow()][move.getStartCol()].getColor());
			break;
		case Queen: 
			grid[move.getRow()][move.getCol()] = new Queen(move.getRow(), move.getCol(), grid[move.getStartRow()][move.getStartCol()].getColor());
			break;
		case King: 
			grid[move.getRow()][move.getCol()] = new King(move.getRow(), move.getCol(), grid[move.getStartRow()][move.getStartCol()].getColor());
			break;
		case Bishop: 
			grid[move.getRow()][move.getCol()] = new Bishop(move.getRow(), move.getCol(), grid[move.getStartRow()][move.getStartCol()].getColor());
			break;
		case Knight: 
			grid[move.getRow()][move.getCol()] = new Knight(move.getRow(), move.getCol(), grid[move.getStartRow()][move.getStartCol()].getColor());
			break;
		}
		grid[move.getStartRow()][move.getStartCol()] = null;
	}
}
