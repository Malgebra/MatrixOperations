/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import matrix.Matrix;

/**
 * 
 */
public class MatrixTest extends TestCase{

	int m;
	int n;
	
	Matrix A;
	Matrix B;
	
	
	@Override
	protected void setUp() {
		m =3;
		n =3;
		A = new Matrix(m, n);
		B = new Matrix(m, n);
	}
	
	@Test
	public void testMatrix() {
		for(int j=0;j<A.getRows();j++) {
			for(int i=0;i<A.getCols();i++) {
				if(A.getEquations()[i][j] != 0) {
					fail("Matrix Generation Error");
				}
				assertEquals(A.getEquations()[i][j], 0.0, 0.0);
			}
			
		}
	}
	
	@Test
	public void testFindMostZeroes() {
		double[][] eq = {{3, 2, 1}, {1, 2, 0}, {0, 0, 0}};
		B.setEquations(eq);
		assertEquals(B.findMostZeroes().getIndex(), 2);
		assertEquals(B.findMostZeroes().getRoc(),'c');
	}


}
