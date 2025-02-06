package matrix.display;

import matrix.Matrix;

public class MatrixDisplay {
	/**
	 * Matrix to hold and display. This matrix can be changed with the setMatrixDisplay function.
	 * 
	 */
	Matrix M;
	
	public MatrixDisplay(Matrix B) {
		setMatrix(B);
	}
	
	/**
	 * Method to print the matrix when from CLI
	 */
	public void displayMatrix(){		
		
		System.out.println("[");
		for(int i = 0; i< M.getRows(); i++) {		
			for(int j = 0; j< M.getCols(); j++) {
				
				System.out.print(M.getEquations()[i][j]);
				if(i == 3 && i ==j) {
					System.out.println();
				}
			}
			System.out.println();
		}
		System.out.println("]");
	}
	
	public void setMatrix(Matrix A) {
		M = A;
	}

}
