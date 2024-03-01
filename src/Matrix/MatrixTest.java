package Matrix;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class MatrixTest extends TestCase{
	int m;
	int n;
	
	Matrix M;
	
	protected void setUp() {
		m =3;
		n =3;
		new Matrix(m, n);
		
	}
	@Test
	void testMatrix(int m, int n) {
		for(int j=0;j<m;j++) {
			for(int i=0;i<m;i++) {
				if(M.equations[i][j] != 0) {
					fail("Matrix Generation Error");
				}
			}
			
		}
	}
	
	
}
