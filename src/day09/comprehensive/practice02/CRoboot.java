package day09.comprehensive.practice02;

public class  CRoboot extends BaseRoboot implements ISpeakable,ISeeable {

	
	public CRoboot(String name,String model) {
		super(name,model);
	}

	@Override
	public void see() {
		// TODO Auto-generated method stub
		System.out.format("机器人名字:%s ,型号:%s, 我会讲话!\n",super.getName(),super.getModel());
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.format("机器人:%s, 型号:%s 我会头像识别!\n",super.getName(),super.getModel());
	}
	
	

	//可以讲话和图形识别!
	

}
