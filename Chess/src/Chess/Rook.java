package Chess;

public class Rook extends Piece{
	int row;
	int col;
	State color;
	public Rook(int row, int col, State color) {
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
		return Identifier.Rook;
	}
}
