package day09.comprehensive.practice02;

public class ARoboot extends BaseRoboot implements ISpeakable {

	public ARoboot(String name, String model) {
		super(name, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("我实现了讲话了,调用的方法名是speak!只要调用speak()就可以了 !");
	}

}
