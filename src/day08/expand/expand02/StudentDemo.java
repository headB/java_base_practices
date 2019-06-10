package day08.expand.expand02;

public class StudentDemo {

	public static void main(String[] args) {
		
		//然后去实例化两个对象.
		
//		给出以下学生课程信息表：
//		·学生姓名：黄小铭，年龄:14,课程名称：语文，语文成绩：88
//		·学生姓名：王飞，年龄:15,课程名称：数学，数学成绩：98
		
		Student s1 = new Student("黄晓明",14,"语文",88);
		
		Student s2 = new Student("王菲",15,"数学",98);
		
		System.out.println(s1.getName());
		
		System.out.println(s1.getCourse().getName());
		
		System.out.println(s1.getCourse().getScore());
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
