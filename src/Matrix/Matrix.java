package Matrix;

public class Matrix implements IMatrix{
	int rows;
	int cols;
	int[][] equations;
	
	public Matrix(int rows, int columns) {
		this.rows = rows;
		this.cols = columns;
		this.equations = new int[rows][columns];
		for(int i =0; i < rows; i++) {
			for(int j =0; j < columns; j++) {
				this.equations[i][j] = 0;
			}
		}
	}
	
	@Override
	public int[][] transpose(int[] rows, int[] columns) {
		return null;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	public int[][] getEquations() {
		return equations;
	}

	public void setEquations(int[][] equations) {
		this.equations = equations;
	}
}
