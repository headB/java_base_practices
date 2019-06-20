package day16集合2.comprehensive04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//4.综合四
//1) 创建一个 List，在 List 中增加三个工人，基本信息如下: 姓名 年龄 工资
//zhang3 18 3000
//li4 25 3500
//wang5 22 3200
//2) 在 li4 之前插入一个工人，信息为:
//姓名:zhao6，年龄:24，工资 3300
//3) 删除 wang5 的信息
//4) 利用 for 循环遍历，打印 List 中所有工人的信息
//5) 利用迭代遍历，对 List 中所有的工人调用 work 方法。
//6) 为 Worker 类重写 equals 方法，当姓名、年龄、工资全部相等时候才返回 true

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Worker> list = new ArrayList<>();
		
//		ArrayList<Worker> list2 = new ArrayList<>();
//		list2.
		
		list.add(new Worker("zhang3",18,3000));
		list.add(new Worker("li4",25,3500));
		list.add(new Worker("wang5",22,3200));
			
		
		System.out.println(list);
		
		boolean condition = false;
		Integer i = 0;
		for(Worker w11:list) {
			
			if("li4".equals(w11.getName())) {
//				list.add(i, new Worker("zhao6",24,3300));
				condition = true;
				break;
				
			}
			
//			if("li4".equals(w11.getName())) {
//				list.add(i, new Worker("zhao6",24,3300));
//			}
			
			i++;
			
		}
		
		if(condition) {
			list.add(i, new Worker("zhao6",24,3300));
		}
		
		System.out.println(i);

		System.out.println(list);
		
		
		for(int i1=0;i<list.size();i++) {
			
			System.out.println(list.get(i1).getAge());
			System.out.println(list.get(i1).getName());
			System.out.println(list.get(i1).getSalary());
			
		}
		
		Iterator<Worker> it1 = list.iterator();
		
		while(it1.hasNext()) {	
			Worker temp = it1.next();
			temp.work();	
			if("wang5".equals(temp.getName())) {			
				it1.remove();
			}
		}
		
		
//			while(it1.hasNext()) {
//			it1.next().work();	
//			if("wang5".equals(it1.next().getName())) {
//				it1.remove();
//				
//			}
//			
//		}
		
		list.add(new Worker("zhang3",18,3000));
		list.add(new Worker("zhang3",18,30000));
		
		System.out.println("自定义的equals去对比数值-> "+list.get(0).equals(list.get(1)));
		
		System.out.println("自定义的equals去对比数值-> "+list.get(0).equals(list.get(list.size()-2)));
		System.out.println("自定义的equals去对比数值-> "+list.get(0).equals(list.get(list.size()-1)));
		
		
	}

}

class Worker{
	
	private String name;
	private int age;
	private double salary;
	public Worker(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	void work() {
		
		System.out.format("\n我%s,在工作中\n",this.name);
		
	}
	
	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public boolean equals(Worker o) {
		
		if(o!=null) {
			
			if(this.name.equals(o.getName())) {
				
				if(this.age==o.age) {
					
					if(this.salary==o.salary) {
						
						return true;
					}
					
				}
				
			}
			
		}
		
		
		return false;
		
	}
	
	
}
