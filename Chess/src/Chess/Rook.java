package Chess;

import java.util.ArrayList;

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
	@Override
	ArrayList<Move> possibleMoves() {
		ArrayList<Move> moves = new ArrayList<Move>();
		Move a = new Move(row, col, row, col + 1);
		Move b = new Move(row, col, row, col + 2);
		Move c = new Move(row, col, row, col + 3);
		Move d = new Move(row, col, row, col + 4);
		Move e = new Move(row, col, row, col + 5);
		Move f = new Move(row, col, row, col + 6);
		Move g = new Move(row, col, row, col + 7);
		Move h = new Move(row, col, row, col - 1);
		Move i = new Move(row, col, row, col - 2);
		Move j = new Move(row, col, row, col - 3);
		Move k = new Move(row, col, row, col - 4);
		Move l = new Move(row, col, row, col - 5);
		Move m = new Move(row, col, row, col - 6);
		Move n = new Move(row, col, row, col - 7);
		Move o = new Move(row, col, row + 1, col);
		Move p = new Move(row, col, row + 2, col);
		Move q = new Move(row, col, row + 3, col);
		Move r = new Move(row, col, row + 4, col);
		Move s = new Move(row, col, row + 5, col);
		Move t = new Move(row, col, row + 6, col);
		Move u = new Move(row, col, row + 7, col);
		Move v = new Move(row, col, row - 1, col);
		Move w = new Move(row, col, row - 2, col);
		Move x = new Move(row, col, row - 3, col);
		Move y = new Move(row, col, row - 4, col);
		Move z = new Move(row, col, row - 5, col);
		Move aa = new Move(row, col, row - 6, col);
		Move ab = new Move(row, col, row - 7, col);
		moves.add(a);
		moves.add(b);
		moves.add(c);
		moves.add(d);
		moves.add(e);
		moves.add(f);
		moves.add(g);
		moves.add(h);
		moves.add(i);
		moves.add(j);
		moves.add(k);
		moves.add(l);
		moves.add(m);
		moves.add(n);
		moves.add(o);
		moves.add(p);
		moves.add(q);
		moves.add(r);
		moves.add(s);
		moves.add(t);
		moves.add(u);
		moves.add(v);
		moves.add(w);
		moves.add(x);
		moves.add(y);
		moves.add(z);
		moves.add(aa);
		moves.add(ab);
		for(int abc = 0; abc < 28; abc++) {
			if(!(moves.get(abc).getCol() > -1 && moves.get(abc).getCol() < 8 && moves.get(abc).getRow() > -1 && moves.get(abc).getRow() < 8)) {
				moves.remove(abc);
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
