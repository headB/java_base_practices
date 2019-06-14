package day13异常.practice06;

//public class LogicException extends RuntimeException {
public class LogicException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	//然后根据eclipse来创建异常处理.
	
	//创建构造器.公共可访问的构造器
	public LogicException() {
		super();
	}
	
	public LogicException(String message) {
		
		super(message);
		
		/**
		 * 
		 * @param message 报错的原因
		 * @param cause   异常的原因
		 */
		
		
	}

	public LogicException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
