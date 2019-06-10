package day12.practice08;

//8.第八题
//需求:
// 判断一个字符串是否全部有数字组成
// 判断一个字符串是否是手机号码
// 判断一个字符串是否是18位身份证号码
// 判断一个字符串是否6到16位，且第一个字必须为字母
//作业目的:了解正则表达式是什么东西，以后会查正则表达式即可。

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//正则我懂,但是,如何调用调用的确不是很懂啊.
		
		
//		判断一个字符串是否全部有数字组成
		
		//看来,java里面的正则匹配,都是自动添加  $   
		
		String s1 = "1234567898765";
		boolean isNumber = s1.matches("\\d");
		System.out.println(isNumber);  //居然是  false  s1的content和matches里面的正则不匹配.
		
		System.out.println(s1.matches("\\d+"));  //然后结果是  true,因为是多余一个
		System.out.println(s1.matches("[0-9]{0,}"));  //结果是 true
		System.out.println(s1.matches(""));
		
		System.out.println("看看是否数组的正则匹配是0到任何多个数字+");
		System.out.println("1  ".matches("\\d*"));  //结果为false
		System.out.println(" ".matches("\\d*"));  //结果为false
		System.out.println("1".matches("\\d*"));  //结果为true
		System.out.println("1s".matches("\\d*."));  //结果为true
		
		//这里这个结果真的是令人匪夷所思啊,就是,感觉真的是前后自动添加了^ $,除非就是
		//自己给定条件,前面不添加限制,这样就可以匹配内容.
		System.out.println("11233s".matches("\\d*"));  //结果为false
		
		System.out.println("=================下面是测试手机号码的正则=======");
		
		
		// 判断一个字符串是否是手机号码
//		String regex1 = ".*1[3|4|5|7|8][0-9]{9}"; 
		String regex1 = "^1[3|4|5|7|8][0-9]{9}$"; 
		System.out.println("12712345678".matches(regex1));// false 
		System.out.println("13712345678".matches(regex1));// true
//		System.out.println("13712345676".matches(regex1));// true
		
		System.out.println("=================");
		
		String regex2 = "\\d{17}[[0-9]X]"; 
		System.out.println("511123200110101234".matches(regex2));// true 
		System.out.println("51112320011010123X".matches(regex2));// true 
		System.out.println("51112320011010123S".matches(regex2));// false
		
		System.out.println("=================");
		// 判断一个字符串是否 6 到 16 位，且第一个字必须为字母
		String regex3 = "^[a-zA-Z]\\w{5,15}$"; 
		System.out.println("will".matches(regex3));// false 
		System.out.println("17will".matches(regex3));// false 
		System.out.println("will17willwillwill".matches(regex3));// false 
		System.out.println("will17".matches(regex3));// true
		
		
		
	}

}
