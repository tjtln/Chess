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
		
		return moves;
	}
}
