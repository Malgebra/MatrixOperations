package matrix.operations;

import exceptions.MatrixException;
import matrix.Matrix;
import matrix.display.MatrixDisplay;

public class MatrixSum {

	
	public static Matrix sum(Matrix A, Matrix B) throws MatrixException {
		if(A.getCols() != B.getCols() || A.getRows() != B.getRows()) {
			System.out.println("Error - Matrix must have same Dimensions");
			throw new MatrixException("");
			
		}
		int rows = A.getRows();
		int columns = A.getCols();
		Matrix result = new Matrix(rows, columns);
		for(int i =0; i < rows-1; i++) {
			for(int j =0; j < columns-1; j++) {
				result.getEquations()[i][j] = A.getEquations()[i][j] + B.getEquations()[i][j];
			}
		}
		
		return result;
	}
	
}
