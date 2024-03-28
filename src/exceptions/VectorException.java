package exceptions;

public class VectorException extends Exception{
	String msg;
	
	public VectorException() {
		super();
	}
	
	public VectorException(Throwable t) {
		super(t);
	}
	
	public VectorException(String message) {
		super(message);
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
