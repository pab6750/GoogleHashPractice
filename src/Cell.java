
public class Cell {
	private static final int TOMATO = 0;
	private static final int MUSHROOM = 1;
	
	private int r;
	private int c;
	private boolean isTaken;
	private int type;
	
	public Cell(int r, int c, int type) {
		this.r = r;
		this.c = c;
		this.type = type;
		this.isTaken = false;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public boolean isTaken() {
		return isTaken;
	}

	public void setTaken(boolean isTaken) {
		this.isTaken = isTaken;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
}
