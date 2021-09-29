package Chess;

import java.util.ArrayList;

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
		Move ac = new Move(row, col, row, col + 1);
		Move ad = new Move(row, col, row, col + 2);
		Move ae = new Move(row, col, row, col + 3);
		Move af = new Move(row, col, row, col + 4);
		Move ag = new Move(row, col, row, col + 5);
		Move ah = new Move(row, col, row, col + 6);
		Move ai = new Move(row, col, row, col + 7);
		Move aj = new Move(row, col, row, col - 1);
		Move ak = new Move(row, col, row, col - 2);
		Move al = new Move(row, col, row, col - 3);
		Move am = new Move(row, col, row, col - 4);
		Move an = new Move(row, col, row, col - 5);
		Move ao = new Move(row, col, row, col - 6);
		Move ap = new Move(row, col, row, col - 7);
		Move aq = new Move(row, col, row + 1, col);
		Move ar = new Move(row, col, row + 2, col);
		Move as = new Move(row, col, row + 3, col);
		Move at = new Move(row, col, row + 4, col);
		Move au = new Move(row, col, row + 5, col);
		Move av = new Move(row, col, row + 6, col);
		Move aw = new Move(row, col, row + 7, col);
		Move ax = new Move(row, col, row - 1, col);
		Move ay = new Move(row, col, row - 2, col);
		Move az = new Move(row, col, row - 3, col);
		Move ba = new Move(row, col, row - 4, col);
		Move bb = new Move(row, col, row - 5, col);
		Move bc = new Move(row, col, row - 6, col);
		Move bd = new Move(row, col, row - 7, col);
		moves.add(ac);
		moves.add(ad);
		moves.add(ae);
		moves.add(af);
		moves.add(ag);
		moves.add(ah);
		moves.add(ai);
		moves.add(aj);
		moves.add(ak);
		moves.add(al);
		moves.add(am);
		moves.add(an);
		moves.add(ao);
		moves.add(ap);
		moves.add(aq);
		moves.add(ar);
		moves.add(as);
		moves.add(at);
		moves.add(au);
		moves.add(av);
		moves.add(aw);
		moves.add(ax);
		moves.add(ay);
		moves.add(az);
		moves.add(ba);
		moves.add(bb);
		moves.add(bc);
		moves.add(bd);
		for(int abc = 0; abc < 56; abc++) {
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
