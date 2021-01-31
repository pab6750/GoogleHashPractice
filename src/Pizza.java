import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;

public class Pizza {
	private static final String INPUT_ADDRESS = "C:\\Users\\pablo\\Downloads\\";
	private static final int TOMATO = 0;
	private static final int MUSHROOM = 1;
	
	private int r;
	private int c;
	private int l;
	private int h;
	private Cell[][] pizza;
	private ArrayList<Slice> slices;
	
	public Pizza(String filename) {
		this.parse(filename);
	}
	
	public void search(Slice slice, int row, int col) {
		
	}
	
	public void startSearch() {
		Slice firstSlice = new Slice(0,0,0,0);
		
		this.search(firstSlice, 0, 0);
	}
	
	public void parse(String filename) {
		File f = new File(INPUT_ADDRESS + filename);
		Scanner in = null;
		try {
			in = new Scanner(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		in.useLocale(Locale.ENGLISH);
		in.useDelimiter(" ");
		
		String firstRow = null;
		
		if(in.hasNext()) {
			firstRow = in.nextLine();
		}
		
		if(firstRow != null) {
			char rowChar = firstRow.charAt(0);
			this.r = rowChar - 48;
			
			char colChar = firstRow.charAt(2);
			this.c = colChar - 48;
			
			char lChar = firstRow.charAt(4);
			this.l = lChar - 48;
			
			char hChar = firstRow.charAt(6);
			this.h = hChar - 48;
		}
		
		this.pizza = new Cell[this.r][this.c];
		
		int counter = 0;
		
		while(in.hasNextLine()) {
			String currLine = in.nextLine();
			
			for(int i = 0; i < this.c; i++) {
				char currChar = currLine.charAt(i);
				if(currChar == 'T') {
					this.pizza[counter][i] = new Cell(counter, i, TOMATO);
				} else if(currChar == 'M') {
					this.pizza[counter][i] = new Cell(counter, i, MUSHROOM);
				}
			}
			
			counter++;
		}
		
		//this goes at the end
		in.close();
	}
	
	//setters and getters
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

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	
}
