package matrix.display;

import matrix.Matrix;

public class MatrixDisplay {
	
	public static void displayMatrix(Matrix M){		
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
}
