package day13异常.comprehensive01;

//现有三个自定义异常
//年龄低异常(LowAgeException)、
//年龄高异常(HighAgeException)、 
//工资高异常(HighSalaryException)，
//
//他们分别为运行时异常，并且调用了父类构造器 
//public RuntimeException(String message); 
//public RuntimeException(String message, Throwable cause) 

public class TestDemo {
	
	public static void main(String[] args) {
		
		try {
			Employee e1 = new Employee("kumanxuan",17,2000,120);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			Employee e2 = new Employee("kumanxuan",18,2000,120);
			System.out.println(Employee.getAcount());
			System.out.println(Employee.getCount());
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			Employee e3 = new Employee("",18,2000,120);
			System.out.println(Employee.getAcount());
			System.out.println(Employee.getCount());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		try {
			Employee e4 = new Employee("ss",61,2000,120);
			System.out.println(Employee.getAcount());
			System.out.println(Employee.getCount());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			Employee e5 = new Employee("ss1",20,1000,120);
			e5.addSalary(99000);
			System.out.println(Employee.getAcount());
			System.out.println(Employee.getCount());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
	}
	
	

}
