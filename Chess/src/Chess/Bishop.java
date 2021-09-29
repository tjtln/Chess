package Chess;

import java.util.ArrayList;

public class Bishop extends Piece{
	int row;
	int col;
	State color;
	public Bishop(int row, int col, State color) {
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
		return Identifier.Bishop;
	}
	@Override
	ArrayList<Move> possibleMoves() {
		ArrayList<Move> moves = new ArrayList<Move>();
		Move a = new Move(row, col, row + 1, col + 1);
		Move b = new Move(row, col, row + 2, col + 2);
		Move c = new Move(row, col, row + 3, col + 3);
		Move d = new Move(row, col, row + 4, col + 4);
		Move e = new Move(row, col, row + 5, col + 5);
		Move f = new Move(row, col, row + 6, col + 6);
		Move g = new Move(row, col, row + 7, col + 7);
		Move h = new Move(row, col, row - 1, col + 1);
		Move i = new Move(row, col, row - 2, col + 2);
		Move j = new Move(row, col, row - 3, col + 3);
		Move k = new Move(row, col, row - 4, col + 4);
		Move l = new Move(row, col, row - 5, col + 5);
		Move m = new Move(row, col, row - 6, col + 6);
		Move n = new Move(row, col, row - 7, col + 7);
		Move o = new Move(row, col, row + 1, col - 1);
		Move p = new Move(row, col, row + 2, col - 2);
		Move q = new Move(row, col, row + 3, col - 3);
		Move r = new Move(row, col, row + 4, col - 4);
		Move s = new Move(row, col, row + 5, col - 5);
		Move t = new Move(row, col, row + 6, col - 6);
		Move u = new Move(row, col, row + 7, col - 7);
		Move v = new Move(row, col, row - 1, col - 1);
		Move w = new Move(row, col, row - 2, col - 2);
		Move x = new Move(row, col, row - 3, col - 3);
		Move y = new Move(row, col, row - 4, col - 4);
		Move z = new Move(row, col, row - 5, col - 5);
		Move aa = new Move(row, col, row - 6, col - 6);
		Move ab = new Move(row, col, row - 7, col - 7);
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
		// TODO Auto-generated method stub
		return col;
	}
}
