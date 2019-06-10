package day12.comprehensive02;

//现有两个打印规范如下: 字母小写打印(ILowercaseLetter)，
//方法:void printLowercaseLetter()
//
//
//字母大写打印(IUppercaseLetter)，方法:printUppercaseLetter()
//1)现有打印类 Print 实现 ILowercaseLetter 和 IUppercaseLetter 规范。 
//2)要求覆盖
//    printUppercaseLetter()方法实现为:将成员变量str转换并打印为全大写英文字母 的功能，覆盖 
//    printLowercaseLetter()方法实现为:将成员变量 str 转换并打印为全小写英文字 母的功能。
//
//
//【提示:(码表 65 为 A，码表 97 为 a)】 请用多态的知识创建对象，并调用大小写打印方法。

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ILowercaseLetter p1 = new Print("CtctC  CCtv");
		p1.printLowercaseLetter();
		
		
		IUppercaseLetter p2 = new Print("CtctC  CCtv");
		p2.printUppercaseLetter();
		
		

	}

}
