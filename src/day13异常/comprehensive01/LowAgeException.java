package day13异常.comprehensive01;

public class LowAgeException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LowAgeException() {
		
	}
	
	public LowAgeException(String message) {
		super(message);
	}
	
	public LowAgeException(String message,Throwable cause) {
		
		super(message,cause);
		
	}

}
