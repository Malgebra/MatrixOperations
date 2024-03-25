package vector;

import exceptions.VectorException;

public class Vector implements VectorI {
	private double[] elements;
/**
 * Generates a  vector that can be used in Vector Operations
 * <p>
 * A 3D Vector represents a set of a1,a2,a3...an elements in represented
 * in a double array
 * </p>
 * @see VectorOperations
 * @param elements		The elements contained in the vector, usually x,y,z for a 3D Vector
 */
	public Vector(double[] elements) {
		this.elements = elements;
	}
	
	public double getElement(int i) {
		return this.elements[i];
	}
	

	@Override
	public double dotProduct(Vector v) {
		int m = this.getElemNo();
		int n = v.getElemNo();
		double[] result = new double[m];
		
		if(m == n) {
			for(int i = 0; i < m; i++) {
				result[i] = v.getElement(i) * this.getElement(i);
			}
		}
		
		return 0;
	}


/**
 * Returns the amount of elements contained in this vector.
 */
	@Override
	public int getElemNo() {
		return this.elements.length;
	}

}
