package day09.expand02;

public class ChinaUnicom extends NetworkOperator implements ICall, IInternet {

	public ChinaUnicom() {
		
	}
	
	public ChinaUnicom(String type) {
		super(type);
	}
	
	@Override
	public void getIntoInternet() {
		// TODO Auto-generated method stub
		System.out.println("中国联通需要自己去实现上网");

	}

	@Override
	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("中国联通需要实现上网功能!");

	}

}
