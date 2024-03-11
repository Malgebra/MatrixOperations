package matrix.operations;

import matrix.Matrix;

public class MatrixSum {
	Matrix A;
	Matrix B;
	
	public static Matrix sum(Matrix A, Matrix B) {
		if(A.getCols() != B.getCols() && A.getRows() != B.getRows()) {
			
		}
		int rows = A.getRows();
		int columns = A.getCols();
		Matrix result = new Matrix(rows, columns);
		for(int i =0; i < rows; i++) {
			for(int j =0; j < columns; j++) {
				result.getEquations()[i][j] = A.getEquations()[i][j] + B.getEquations()[i][j];
			}
		}
		
		return result;
	}
	
}
