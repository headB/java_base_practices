package day09.comprehensive.practice02;

public class BRoboot extends BaseRoboot implements ISeeable {
	
	public BRoboot(String name,String model) {
		super(name,model);
	}
	
	@Override
	public void see() {
		// TODO Auto-generated method stub
		System.out.format("机器人:%s, 型号:%s 我会头像识别!\n",super.getName(),super.getModel());
	}

	//B机器可以看见
	
}
