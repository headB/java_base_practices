package day08.object_demo;

public class Person {
	
	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String toString() {
//		System.out.println("覆盖了object的toString方法");
		return "覆盖了object的toString方法";
	}
	
	//尝试重写一个equals方法
	public boolean equals(Object obj) {
		
		if(this==obj) 
			return true;
		
		if(obj==null)
			return false;
		
		//然后进行强转
		Person OtherPerson = (Person) obj;
		
		if(OtherPerson.age==this.age && this.age!=0 )
			return true;
		
		
		return false;
	}

}
