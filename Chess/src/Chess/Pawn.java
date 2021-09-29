package Chess;

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
}
