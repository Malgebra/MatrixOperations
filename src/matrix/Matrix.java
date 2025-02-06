package matrix;
public class Matrix implements IMatrix{
	int rows;
	int cols;
	double[][] equations;
	
	// Generates the zero matrix with provided dimensions
	public Matrix(int rows, int columns) {
		setRows(rows);
		setCols(columns);
		this.equations = new double[rows][columns];
		for(int i =0; i < rows; i++) {
			for(int j =0; j < columns; j++) {
				this.equations[i][j] = 0;
			}
		}
	}
	
	public Matrix(String ...eqs) {
		// Set the amount of rows based on number of equations passed
		setRows(eqs.length);
		// Split equations using regex to find +- and spaces
//		String[] myar = eqs[0].split("[+-]\s");
//		System.out.println("Printing first element of first array\n"+
//				myar[0]);
//		System.out.println("Printing Array Object\n"+myar);
		
		String[] eq;
		double[] new_eq;
		double[][] eqset = new double[eqs.length][];
		for(int i = 0; i < eqs.length; i++) {
			eq = eqs[i].split("[-+ a-z]+");
			new_eq = new double[eq.length];
			for(int j = 0; j < eq.length; j++) {
				System.out.println("J loop" + Double.parseDouble(eq[j]));
				new_eq[j] = Double.parseDouble(eq[j]);
				eqset[i] = new double[eq.length];
				eqset[i][j] = Double.parseDouble(eq[j]);
				System.out.println("eq i,j:"+eqset[i][j]);
				
			}
			
		
			
		}
		
		System.out.println("EQSET[0]"+eqset[0][0]);
		setEquations(eqset);
	}
	
	public Matrix(double[][] equations) {
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
		double[][] eq = this.getEquations();
		double[][] eq_transpose = new double[this.getRows()][this.getCols()];
		
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

	public double[][] getEquations() {
		return equations;
	}

	public void setEquations(double[][] equations) {
		this.equations = equations;
		
		
	}

	// TODO -> Throw exception if matrices are not the same size
	@Override
	public boolean equals(Matrix B) {
		
		if(this.getCols() != B.getCols() && this.getRows() != B.getRows()) {
			return false;
		}
		
		for(int i =0; i < this.getRows(); i++) {
			for(int j =0; j < this.getCols(); j++) {
				if(this.getEquations()[i][j] != B.getEquations()[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public boolean checkDimensions() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ROC_Index findMostZeroes() {
		int currentZeroes = 0;
		int maxZeroes = 0;
		ROC_Index roc = new ROC_Index();
		double[][] equations = this.getEquations();
		/**
		 * This iteration will check for rows with the most zeroes
		 */
		for(int i = 0; i < this.rows; i++) {
			for(int j = 0; j < this.cols; j++) {
				if(equations[i][j] == 0)
					currentZeroes++;	
				if(currentZeroes > maxZeroes) {
					roc = new ROC_Index('r', i);
					maxZeroes = currentZeroes;
				}
			}
		}		
		/**
		 * This iteration will check for rows with the most zeroes
		 */
		for(int i = 0; i < this.rows; i++) {
			for(int j = 0; j < this.cols; j++) {
				if(equations[i][j] == 0)
					currentZeroes++;	
				if(currentZeroes > maxZeroes) {
					roc = new ROC_Index('r', i);
					maxZeroes = currentZeroes;
				}
			}
		}
		/**
		 * This iteration will check for columns with the most zeroes
		 */
		for(int i = 0; i < this.rows; i++) {
			for(int j = 0; j < this.cols; j++) {
				if(equations[j][i] == 0)
					currentZeroes++;	
				if(currentZeroes > maxZeroes) {
					roc = new ROC_Index('c', j);
					maxZeroes = currentZeroes;
				}
			}
		}
		return roc;
	}
}
