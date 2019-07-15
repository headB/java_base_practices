package day09.expand01.test1;

public  class Common1 implements IWalkable,ISpeak  {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("我会讲野!");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("我会行路!");
	}

}
