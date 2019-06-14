package day13异常.comprehensive01;

public class HighAgeException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HighAgeException() {
		
	}
	
	public HighAgeException(String message) {
		super(message);
	}
	
	public HighAgeException(String message,Throwable cause) {
		
		super(message,cause);
		
	}

}
