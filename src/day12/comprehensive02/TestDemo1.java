package day12.comprehensive02;

public class TestDemo1 {
	
	String name = "lizhixuan";
	
	
	public void equals1(String name) {
		
		System.out.println(name==this.name);
		
	}
	
	public static void main(String[] args) {
		
		TestDemo1 t1 = new TestDemo1();
		t1.equals1("lizhixuan");
		
	}

}
