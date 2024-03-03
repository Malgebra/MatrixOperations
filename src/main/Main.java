package main;

import Matrix.Matrix;

public class Main {
	public static void main(String[] args) {
		Matrix M = new Matrix(3,3);
		
		System.out.println("HI");
		System.out.println(M.getRows());
		for(int i=0;i< M.getRows(); i++ ) {
			System.out.println(M.getEquations()[i][i]);
		}
	}
}
