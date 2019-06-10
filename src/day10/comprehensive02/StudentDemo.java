package day10.comprehensive02;

public class StudentDemo {
	
	
	public static void main(String[] args) {
		
		//然后尝试实例化几个学生类.
		
		
		
		Student s1 = new Student(1,"kumanxuan",96);
		
		
		Student s2 = new Student();
//		s2.setScore(92);
		
		System.out.println("当前的平均分是!"+Student.getAvg());
		
		Student s3 = new Student(3,"beetle",90);
		
		System.out.println("当前的平均分是!"+Student.getAvg());
		
		Student[] allStudent = new Student[5];
		
		allStudent[0] = s1;
		allStudent[0] = s2;
		allStudent[0] = s3;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
	
	
	

}
