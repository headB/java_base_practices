package day14线程.comprehensive02;



//2. 练习二
//实现一个名为Person的类和
//它的子类Employee（普通员工），
//Manager（经理）是Employee的子类，
//
//设计一个方法addSalary作为涨工资，普通员工一次能涨10％，经理能涨20％。
//具体要求如下：
//(1)Person类中的属性有：姓名name(String类型)，
//    地址address(String类型)，定义该类的构造方法；
//(2)Employee类中的属性有：工号id(String型)，
//    工资salary(double类型)，工龄(int型)，定义该类的构造方法；
//(3)Manager类中的属性有：级别level(String类型)定义该类的构造方法；
//(4)编写一个测试类，产生一个员工和一个经理给该员工和经理涨工资，
//    并输出其具有的信息。

public class DemoTest {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("kumanxuan","广东","120",5000,10);
		Manager e2 = new Manager("kumanxuan","广东","120",5000,10,"2");
		
		System.out.println(e1.salary);
		System.out.println(e2.salary);
		
		e1.addSalary();
		e2.addSalary();
		
		System.out.println(e1.salary);
		System.out.println(e2.salary);
		
	}

}
