package tests;



import org.junit.After;
import org.junit.Before;


import vector.Vector;
import vector.operations.VectorOperator;

public class VectorOperatorTest {
	/**
	 * Vectors to be tested
	 * {x}E represents the elements inside {x} vector
	 * @see Vector
	 */
	Vector u;
	double[] uE = {3, 2, -1};
	Vector v;
	double[] vE = {0,2,-3};
	Vector w;
	double[] wE = {2, 6, 7};
	Vector r;
//	Vector Operator to be implemented in a calculator
	VectorOperator VO;
	
	
	@Before
	public void setUp() throws Exception {
		u = new Vector(uE);
		v = new Vector(vE);
		w = new Vector(wE);
	
		VO = new VectorOperator();
		
	}

	@After
	public void tearDown() throws Exception {
		u = null;
		v = null;
		w = null;
		VO = null;
	}

}
