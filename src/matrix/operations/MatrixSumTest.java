/**
 * 
 */
package matrix.operations;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import matrix.Matrix;
import matrix.display.MatrixDisplay;

/**
 * 
 */
public class MatrixSumTest extends TestCase {

	/**
	 * Test method for {@link matrix.operations.MatrixSum#sum(matrix.Matrix, matrix.Matrix)}.
	 */

	Matrix A;
	Matrix B;
	
	@Override
	protected void setUp() {
		A = new Matrix(new int[][] {{1,2,3,4},{3,2,1,4}, {4,4,4,4}, {5,2,1,2}});
		MatrixDisplay.displayMatrix(A);
	}
	
	/**
	 * Adds the zero matrix to the Matrix A
	 */
	@Test
	void sumPlusZeroTest() {
		MatrixSum.sum(A, new Matrix(A.getRows(), A.getCols()));
		assertEquals(A, B);
	}
}
