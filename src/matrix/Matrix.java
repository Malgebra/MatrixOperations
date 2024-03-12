package matrix;

public class Matrix implements IMatrix{
	int rows;
	int cols;
	int[][] equations;
	
	/**
	 * Transpose Operation on a Matrix A
	 * <p> Elements in a row will now be in a column and vice-versa </p>
	 * @param A The Matrix to be transposed.
	 */
	public Matrix(int rows, int columns) {
		setRows(rows);
		setCols(columns);
		this.equations = new int[rows][columns];
		for(int i =0; i < rows; i++) {
			for(int j =0; j < columns; j++) {
				this.equations[i][j] = 0;
			}
		}
	}
	
	public Matrix(int[][] equations) {
		setEquations(equations);
		setRows(equations.length);
		setCols(equations[0].length);
		return;
	}
	/**
	 * Transpose Operation on a Matrix A
	 * <p> Elements in a row will now be in a column and vice-versa </p>
	 * @param A The Matrix to be transposed.
	 */
	@Override
	public void transpose() {
		int m = this.getRows();
		int n = this.getCols();
		setRows(n);
		setCols(m);
		/**
		 * Array to hold current set of equations
		 * Before transposing
		 */
		int[][] eq = this.getEquations();
		int[][] eq_transpose = new int[this.getRows()][this.getCols()];
		
		for(int i = 0; i< m; i++) {
			for(int j = 0; j< m; j++) {
				eq_transpose[j][i] = eq[i][j];
			}
		}
		this.setEquations(eq_transpose);
		
		
	}
	@Override
	public int getRows() {
		return rows;
	}
	
	@Override
	public void setRows(int rows) {
		this.rows = rows;
	}
	@Override
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

	@Override
	public boolean equals(Matrix B) {
		for(int i =0; i < this.getRows(); i++) {
			for(int j =0; j < this.getCols(); j++) {
				if(this.getEquations()[i][j] != B.getEquations()[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
