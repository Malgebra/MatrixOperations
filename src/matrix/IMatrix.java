package matrix;

public interface IMatrix {
	void transpose();
	int getRows();
	int getCols();
	void setRows(int rows);
	boolean equals(Matrix B);
	boolean checkDimensions();
	ROC_Index findMostZeroes();
}
