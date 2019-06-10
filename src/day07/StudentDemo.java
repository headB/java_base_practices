package day07;


//StudentDemo.java
//需求：作为StudentDemo类和对象的测试类
//步骤：
//（1）创建学生对象
//（2）使用setter方法设置值
//（3）获取对象成员变量的值
//（4）通过有参数构造器创建对象并使用setter方法修改值
//
//作业要求：
//（1）掌握JavaBean规范的四个步骤
//（2）理解使用setter方法和构造器之间初始化字段的区别


public class StudentDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		
		s1.setName("kumanxuan");
		s1.setAge(18);
		
		//哈哈哈,调用方法的时候,忘记添加括号啦.!哈哈哈哈!.
		System.out.println("this is name "+s1.getName()+" and this is age "+s1.getAge());
		
		Student s2 = new Student("kumamon",20);
		System.out.println("this is name "+s2.getName()+" and this is age "+s2.getAge());
		
		
	}

}
