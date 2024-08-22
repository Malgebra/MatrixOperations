package tests;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import matrix.Matrix;
import matrix.display.MatrixDisplay;

class MatrixDisplayTest extends TestCase{

	MatrixDisplay display;
	Matrix A;
	double[][] eq;
	int r;
	int c;
	// Sets the up
	@Override
	protected void setUp() {
		
		eq = new double[][]{{1, 1, 3}, {2, 3, 4}, {6, 6, 6}};
		r = 3;
		c = 3;
		A = new Matrix(eq);
		display = new MatrixDisplay(A);
	}
	
	@Test
	void test() {
		System.out.print(A.getCols());
		display.displayMatrix();
	}

}
