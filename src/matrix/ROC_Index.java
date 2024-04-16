package matrix;

public class ROC_Index {	
	private char roc;
	private int index;
	
	public ROC_Index(char c, int i) {
		this.roc = c;
		this.index = i;
	}
	
	public ROC_Index() {
		
	}









	// 	GETTERS AND SETTERS
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public char getRoc() {
		return roc;
	}
	public void setRoc(char roc) {
		this.roc = roc;
	}
	
}
