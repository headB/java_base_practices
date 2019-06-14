package day13异常.comprehensive01;

public class HighSalaryException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HighSalaryException() {
		
	}
	
	public HighSalaryException(String message) {
		super(message);
	}
	
	public HighSalaryException(String message,Throwable cause) {
		
		super(message,cause);
		
	}

}
