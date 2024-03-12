package main;

import exceptions.MatrixException;
import matrix.Matrix;
import matrix.display.MatrixDisplay;
import matrix.operations.MatrixSum;

public class Main {
	public static void main(String[] args) {
		Matrix A = new Matrix(3,3);
		Matrix B = new Matrix(3,3);
		A.setEquations(new int[][] {{1,2,3}, {3,3,3}, {2,2,2}});
		MatrixDisplay.displayMatrix(A);
		A.transpose();
		MatrixDisplay.displayMatrix(A);
		try {
			A = MatrixSum.sum(A, A);
		} catch (MatrixException e) {
			System.out.print("Matrix Error");
			e.printStackTrace();
		}
		MatrixDisplay.displayMatrix(A); 
	}
	
}
