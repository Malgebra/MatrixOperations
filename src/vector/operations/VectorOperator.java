package vector.operations;

import vector.Vector;

public class VectorOperator {
	
	public double dotProduct(Vector u, Vector v) {
		int m = u.getN();
		int n = v.getN();
		double result = 0;
		
		if(m == n) {
			for(int i = 0; i < m; i++) {
				result += u.getElement(i) * v.getElement(i);
			}
		}
		
		return result;
	}
	
	public Vector crossProduct(Vector u, Vector v) {
		double[] result = new double[3];
		int n = u.getN();
		for(int i = 0; i < n; i++) {
			result[i] = u.getElement(i) * v.getElement(i);
		}
		return new Vector(result);
		
	}
	
}
