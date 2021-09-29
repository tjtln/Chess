package Chess;

import java.util.ArrayList;

public class Knight extends Piece {
	int row;
	int col;
	State color;
	public Knight(int row, int col, State color) {
		this.row = row;
		this.col = col;
		this.color = color;
	}
	@Override
	State getColor() {
		return color;
	}
	@Override
	Identifier getIdentifier() {
		return Identifier.Knight;
	}
	ArrayList<Move> possibleMoves(){
		ArrayList<Move> moves = new ArrayList<Move>();
		Move a = new Move(row, col, row + 2, col + 1);
		Move b = new Move(row, col, row + 2, col - 1);
		Move c = new Move(row, col, row + 1, col + 2);
		Move d = new Move(row, col, row + 1, col - 2);
		Move e = new Move(row, col, row - 1, col + 2);
		Move f = new Move(row, col, row - 1, col - 2);
		Move g = new Move(row, col ,row -2, col - 1);
		Move h = new Move(row, col, row -2, col + 1);
		moves.add(a);
		moves.add(b);
		moves.add(c);
		moves.add(d);
		moves.add(e);
		moves.add(f);
		moves.add(g);
		moves.add(h);
		for(int i = 0; i < 8; i++) {	//make sure they are all on the board
			if(!(moves.get(i).getCol() > -1 && moves.get(i).getCol() < 8 && moves.get(i).getRow() > -1 && moves.get(i).getRow() < 8)) {
				moves.remove(i);
			}
		}
		return moves;
	}
	@Override
	int getRow() {
		return row;
		
	}
	@Override
	int getCol() {
		return col;
	}
}
