package Chess;

import java.util.ArrayList;

public abstract class Piece {
	abstract State getColor();
	abstract Identifier getIdentifier();
	abstract ArrayList<Move> possibleMoves();
	abstract int getRow();
	abstract int getCol();
}
