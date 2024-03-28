package exceptions;

public class MatrixException extends Exception {

	private static final long serialVersionUID = 1L;
	private String msg;
	
	public MatrixException() {
		super();
	}
	
	public MatrixException(String msg) {
		super(msg);
	}
	
	public MatrixException(Throwable t) {
		super(t);
	}

	@Override
	public String toString() {
		return msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
}
