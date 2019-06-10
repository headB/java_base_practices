package day09.expand02;

public class ChinaTelecom extends NetworkOperator implements ICall, IInternet {
	
	//测试构造器的this使用
	private String nameTest;
	
	public ChinaTelecom() {
		super("TD-LTE");
	}
	
	public ChinaTelecom(String type,String name) {
		System.out.format("this is type %s and %s",type,name);
	}
	
	public ChinaTelecom(String name) {
		//super("TD-LTE"); 这里的话,但是super也是需要放到第一句的!.)
		this(name,name);
//		super("TD-LTE"); 不管是写在前面后面,都是会报错的.!
	}

	@Override
	public void getIntoInternet() {
		// TODO Auto-generated method stub
		System.out.println("中国电信需要实现上网!");
	}

	@Override
	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("中国电信需要实现打电话!");
	}

}
