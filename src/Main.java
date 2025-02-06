import matrix.Matrix;
import matrix.display.MatrixDisplay;
import matrix.operations.MatrixSum;

public class Main {

	public static void main(String[] args) {
		//TODO - Set Up UI
		Matrix m = new Matrix(3,3);
		MatrixDisplay d = new MatrixDisplay(m);
		MatrixSum sum = new MatrixSum();
		d.displayMatrix();
		
		
		Matrix b = new Matrix("3x + 2y + 5z", "2x + 5y - 8z");
		d.setMatrix(b);
		d.displayMatrix();
		
		
		
	}	
}