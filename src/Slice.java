import java.util.ArrayList;

public class Slice {
	private int row1;
	private int row2;
	private int col1;
	private int col2;
	private ArrayList<Cell> cells;
	
	public Slice(int row1, int row2, int col1, int col2) {
		this.row1 = row1;
		this.row2 = row2;
		this.col1 = col1;
		this.col2 = col2;
		this.cells = new ArrayList<Cell>();
	}
	
	public int area() {
		int verticalSide = this.row2 - this.row1;
		int horizontalSide = this.col2 - this.col1;
		
		return verticalSide * horizontalSide;
	}

	//setters and getters
	public int getRow1() {
		return row1;
	}

	public void setRow1(int row1) {
		this.row1 = row1;
	}

	public ArrayList<Cell> getCells() {
		return cells;
	}

	public void setCells(ArrayList<Cell> cells) {
		this.cells = cells;
	}

	public int getRow2() {
		return row2;
	}

	public void setRow2(int row2) {
		this.row2 = row2;
	}

	public int getCol1() {
		return col1;
	}

	public void setCol1(int col1) {
		this.col1 = col1;
	}

	public int getCol2() {
		return col2;
	}

	public void setCol2(int col2) {
		this.col2 = col2;
	}
}
