public class Word {
    String text;
	int length;
	int row;
	int col;
	String direction;

	public Word(String text, int length, int row, int col, String direction) {
		this.text = text;
		this.length = length;
		this.row = row;
		this.col = col;
		this.direction = direction;
	}


	public String getText() {
		return this.text;
	}

	public int getLength() {
		return this.length;
	}

	public int getRow() {
		return this.row;
	}

	public int getCol() {
		return this.col;
	}

	public String getDirection() {
		return this.direction;
	}

	@Override
	public String toString() {
		return String.format("%-15s %-5d %d,%-8d %-1s", text, length, row, col, direction);
	}
}
