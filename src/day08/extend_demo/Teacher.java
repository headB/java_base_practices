package day08.extend_demo;

public class Teacher extends Person {
	
	private String level;
	
	public void setLevel(String level) {
		this.level = level;
	}
	
	public String getLevel() {
		return this.level;
	}
	
	public void  giveLession() {
		
		System.out.println("我正在授课啦!");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
