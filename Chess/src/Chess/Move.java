package Chess;

public class Move {
	int col;
	int row;
	int startCol;
	int startRow;
	public Move(int startRow, int startCol, int row, int col) {
		this.row = row;
		this.col = col;
		this.startCol = startCol;
		this.startRow = startRow;
	}
	
	public int getRow(){
		return row;
	}
	public int getCol(){
		return col;
	}
	public int getStartRow() {
		return startRow;
	}
	public int getStartCol() {
		return startCol;
	}
	@Override
	public String toString(){
		char a = (char) (startCol + 97);
		char b = (char)(col + 97);
		String s = "" + a + startRow + "  -->  " + b + row;
		return s;
	}
}
