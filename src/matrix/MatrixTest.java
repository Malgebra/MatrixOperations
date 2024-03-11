/**
 * 
 */
package matrix;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * 
 */
public class MatrixTest extends TestCase{

	int m;
	int n;
	
	Matrix M;
	
	@Override
	protected void setUp() {
		m =3;
		n =3;
		M = new Matrix(m, n);
		
	}
	
	@Test
	public void testMatrix() {
		for(int j=0;j<M.getRows();j++) {
			for(int i=0;i<M.getCols();i++) {
//				if(M.getEquations()[i][j] != 0) {
//					fail("Matrix Generation Error");
//				}
				assertEquals(M.getEquations()[i][j], 0);
			}
			
		}
	}


}
