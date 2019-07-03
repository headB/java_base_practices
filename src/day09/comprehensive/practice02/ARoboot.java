package day09.comprehensive.practice02;

public class ARoboot  extends BaseRoboot implements ISpeakable {

	public ARoboot(String name,String model) {
		super(name,model);
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.format("机器人名字:%s ,型号:%s, 我会讲话!\n",super.getName(),super.getModel());
	}
	
	//然后这里可以写一个方法,去调用父类的走路方法.
	
	
	
	//A机器可以讲野

}
