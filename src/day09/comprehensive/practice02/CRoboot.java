package day09.comprehensive.practice02;

public class CRoboot extends BaseRoboot implements ISpeakable,ISeeable {

	@Override
	public void see() {
		System.out.println("但是,我是modelC类型,大家都是遵循 see,这个方法名,来完成功能的,然后实例化的时候可以调用 see()方法就可以实现识别方法!");
		
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("但是我是modelC类型,大家都是遵循 Speak!,这个方法名,来完成功能的,然后实例化的时候可以调用 Speak()方法就可以实现识别方法!");
	}

	

}
