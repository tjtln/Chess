package Chess;

import java.util.ArrayList;

public class Pawn extends Piece {
	int row;
	int col;
	State color;
	public Pawn(int row, int col, State color) {
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
		return Identifier.Pawn;
	}
	@Override
	ArrayList<Move> possibleMoves() {
		ArrayList<Move> moves = new ArrayList<Move>();
		Move a = new Move(row, col + 1, row, col);
		Move b = new Move(row, col + 2, row, col);
		Move c = new Move(row, col, row + 1, col + 1);
		Move d = new Move(row, col, row + 1, col - 1);
		Move e = new Move(row, col, row - 1, col + 1);
		Move f = new Move(row, col, row - 1, col - 1);
		Move g = new Move(row, col ,row - 1, col);
		Move h = new Move(row, col, row - 2, col);
		moves.add(a);
		moves.add(b);
		moves.add(c);
		moves.add(d);
		moves.add(e);
		moves.add(f);
		moves.add(g);
		moves.add(h);
		for(int i = 0; i < moves.size(); i++) {	//make sure they are all on the board
			if(!(moves.get(i).getCol() > -1 && moves.get(i).getCol() < 8 && moves.get(i).getRow() > -1 && moves.get(i).getRow() < 8)) {
				moves.remove(i);
				i--;
			}
			
		}
		if(color == State.Black) {
			moves.remove(e);
			moves.remove(f);
			moves.remove(g);
			moves.remove(h);
		}else {
			moves.remove(a);
			moves.remove(b);
			moves.remove(c);
			moves.remove(d);
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
