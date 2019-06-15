package day14线程.expand03;

//所以这一题是凭自己的想象力去做??

public class Gun {
	
	private int[] clip = {5};
	
	public int getClip() {
		return this.clip[0];
	}
	
	
	
	synchronized void pop() {
		
		if(clip[0]>0) {
			
			System.out.println("BAN BAN! 子弹飞!");
			clip[0]--;
			
		}
	}
		
	synchronized void push() {
		 if(clip[0]<5) {
			 System.out.println("装紧子弹!");
			 clip[0]++;
		 }
	 }
		
		
		
	

}
