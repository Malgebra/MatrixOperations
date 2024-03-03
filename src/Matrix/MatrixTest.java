package Matrix;

import org.junit.After;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class MatrixTest extends TestCase{
	int m;
	int n;
	
	Matrix M;
	
	protected void setUp() {
		m =3;
		n =3;
		M = new Matrix(m, n);
		
	}
	@Test
	@After
	void testMatrix() {
		for(int j=0;j<M.rows;j++) {
			for(int i=0;i<M.cols;i++) {
				if(M.equations[i][j] != 0) {
					fail("Matrix Generation Error");
				}
			}
			
		}
	}
	
	
}
