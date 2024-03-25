/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.MatrixException;
import junit.framework.TestCase;
import matrix.Matrix;
import matrix.display.MatrixDisplay;
import matrix.operations.MatrixSum;

/**
 * 
 */
public class MatrixSumsTest extends TestCase {

	/**
	 * Test method for {@link matrix.operations.MatrixSum#sum(matrix.Matrix, matrix.Matrix)}.
	 */

	Matrix A;
	Matrix B;
	Matrix C;
	Matrix D;
	
	@Override
	protected void setUp() {
		// Matrix 4x4
		A = new Matrix(new double[][] {{1,2,3,4},{3,2,1,4}, {4,4,4,4}, {5,2,1,2}});
		B = new Matrix(new double[][] {{0,8,6,3},{3,2,3,3}, {1,1,1,4}, {3,2,3,2}});
		// Matrix 3x4
		C = new Matrix(new double[][] {{3,2,3,3}, {1,1,1,4}});
		D = A;	
	}

	/**
	 * Tests for sum of Matrix of unequal Dimensions
	 */
	@Test(expected = MatrixException.class)
	public void testSumMatrix() {
		try {
			MatrixSum.sum(A, C);
		}catch(MatrixException e) {
			System.out.println("Matrix error");
		}
	}
	
	/**
	 * Test for a valid Matrix Summation
	 */
	@Test
	public void testMatrixSum() {
		try {
			MatrixSum.sum(A, B);
		} catch (MatrixException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
