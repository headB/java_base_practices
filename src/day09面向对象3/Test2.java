package day09面向对象3;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world!XXX");
		
		Person pAdd = new Person();
		
		
		
		Person p1 = new Person("kumanxuan",18);
		Person p2 = new Person("kumanxuan",18);
		Person p3 = new Person("beetle",18);
		Person p4 = new Person("kumanxuan1",18);
		Person p5 = new Person("beetle",18);
		Person p6 = new Person("beetle123",18);
		Person p7 = new Person("beetle123123",18);

		
		
		System.out.println(pAdd.addPerson(p1));
		System.out.println(pAdd.addPerson(p2));
		System.out.println(pAdd.addPerson(p3));
		System.out.println(pAdd.addPerson(p4));
		System.out.println(pAdd.addPerson(p5));
		System.out.println(pAdd.addPerson(p6));
		System.out.println(pAdd.addPerson(p7));
		
	
		
		System.out.println(Arrays.toString(pAdd.person));
		
		
//		System.out.println( true || false && true  );
//		System.out.println( false || true && true  );
//		System.out.println( true || true && true  );

	}
	
	
	

}


class Person{
	
	public final String name1 = "kumanxuan";
	
	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	Person[] person = new Person[4];
	
	int index = 0;
	
	
	
	
	//然后模拟人类添加Person对象.
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ","+"" + "index=" + index+ "]";
	}

	boolean addPerson(Person p1) {
		
		//然后就是各种判断了.!
		
		
		//是这样的,因为需要判断当前index插入的是否重复于上一个index-1的对象内容,所以需要还需要添加条件判断,首先是不是第一个
		//然后也不是最后一个,因为,后面的不想执行了.
		
		//然后就是第一个是0的话,其实可以直接结果的.所以是 &&  
		
		//然后,然后是最后一个的话,也可以是直接结果,但是,上面的条件有一个和上面的重复判断有冲突,所以需要重新添加  检测是否为最后一个
		
		//然后我写的过程才发现,我需要遍历啊,不然的话,会一样出现重复的数值啊!!
		
		
		//如果不满足前面两个,就对比一下内容,看看是否重复了.!
		
		
		//如果都不是最后一个和者第一个的话,就进行下面的对话
		if( (index!=0 && index!=person.length && p1!=null) || index==0) {
			
			for(int index1=0;index1<index;index1++) {
				
				if(p1.name==person[index1].name) {
					System.out.println("添加当前失败,存在重复值");
					return false;
//					break;
					
				}
//				else {
//					person[index++] = p1;
//					return true;
//				}
				
			}
//			System.out.println(person.length);
			
//			System.out.print("index->"+index);
			System.out.println("添加成功!");
			person[index++] = p1;
//			System.out.println("this is index->"+index);
			return true;
		
		}else if(index==person.length){
			
			System.out.println("添加失败!,数组已经满了!");
			return false;
		}
		else {
			System.out.println("asdasdasdsa");
			return false;
		}
//		else {
//			
//			System.out.println("添加成功!");
//			person[index++] = p1;
//			
//		}
		
		
		
		
		

//			
//		
//			if(index!=0 && index!=person.length  && (person[index-1].name == p1.name) || index==person.length) {
//				
//				return false;
//				
//			}
//			else {
//				
//				person[index++] = p1;
//	
//				return true;
//				
//			}
		
		
	}
	
	
}
