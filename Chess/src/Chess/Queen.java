package Chess;

public class Queen extends Piece{
	int row;
	int col;
	State color;
	public Queen(int row, int col, State color) {
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
		return Identifier.Queen;
	}
}
