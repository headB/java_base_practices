package day09.expand02;

public class ChinaMobile extends NetworkOperator implements ICall, IInternet,IChat {

	@Override
	public void getIntoInternet() {
		// TODO Auto-generated method stub
		System.out.println("中国联通需要实现上网");
	}

	@Override
	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("中国联通需要实现打电话");
	}

	@Override
	public void chat() {
		// TODO Auto-generated method stub
		System.out.println("我需要实现飞信功能!");
	}

}
