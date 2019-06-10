package day09.expand01;

public class Ship extends Seater implements ISwimable {

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("船舶开始在海洋中漂泊了;铁达尼号般的航行");
	}
	
	public void  work() {
		this.swim();
	}
	
	
}
