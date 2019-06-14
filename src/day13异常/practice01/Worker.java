package day13异常.practice01;

public class Worker {
	
	public static final int LATE = 0;
	public static final int IN_TIME = 1;
	private Car car = null;
	
	Worker(Car car){
		this.car = car;
	}
	
	
	public int gotoWork() {
		
		if(car.run()==Car.NO_OK) {
			
			walk();
			
			return LATE;
			
		}else {
			System.out.println("成功开车到达公司公司,并且打好卡!");
			return IN_TIME;
			
		}
		
		
		
	}


	private void walk() {
		// TODO Auto-generated method stub
		
		System.out.println("唉.部车爆左胎,只可以行路去翻工!");
		
	}
	

}
