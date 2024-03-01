package Matrix;

public class Matrix implements IMatrix{
	int rows;
	int columns;
	int[][] equations;
	
	public Matrix(int rows, int columns) {
		this.equations = new int[rows][columns];
		for(int i =0; i < rows; i++) {
			for(int j =0; j < rows; j++) {
				this.equations[i][j] = 0;
			}
		}
	}
	
	@Override
	public int[][] transpose(int[] rows, int[] columns) {
		return null;
	}
}
