package day17.io.practice01;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

//1. 作业一:FileDemo1.java
//需求:演示 File 类分隔符
//作业目的:了解 File 类中的字段，最终使用”/”

//2. 作业二:FileDemo2.java
//需求:演示 File 类中方法-获取 File 路径和检测状态
//作业目的:熟悉 File 类中的获取 File 路径和检测状态方法 

public class DemoTest {

	/**
	 * @param args
	 * @throws IOException
	 */
	/**
	 * @param args
	 * @throws IOException
	 */
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String s1 = File.pathSeparator;
		char c1 = File.pathSeparatorChar;
		
		System.out.println(s1);
		System.out.println(c1);
		
		String s2 = File.separator;
		char c2 = File.separatorChar;
		
		System.out.println(s2);
		System.out.println(c2);
		
		//unix 使用  : 分隔属性,window使用 ; 分隔属性,不懂.我去尝试一下吧!.
		//去指定一个文件的具体位置.!
		
		File f1 = new File("/Users/lizhixuan/Download/eatFruit.txt");
		System.out.println("打印书否存在这个文件! -> "+f1.exists());
		
		File f2 = new File("/Users/lizhixuan/Downloads/eatFruit.txt");
		System.out.println("打印书否存在这个文件! -> "+f2.exists());
		
		System.out.println(f2.getName());
		
		String fileName = File.separator+"Users"+File.separator+"lizhixuan";
		System.out.println(fileName);
		
		System.out.println("path的使用"+f2.getParent());
		System.out.println("path的使用"+f2.getPath());
		System.out.println("path的使用"+f2.getParentFile());
		
		System.out.println("path的使用"+f2.getAbsolutePath());
		
		System.out.println("isXxx的使用"+f2.isFile());
		System.out.println("isXxx的使用"+f2.isAbsolute());
		System.out.println("isXxx的使用"+f2.isDirectory());
//		System.out.println("isXxx的使用"+f2.;
		
		//尝试创建文件
		//然后证实了,mkdirs可以顺便创建文件和文件夹,如果里面涉及多个文件夹的话,都可以顺便一起创建>!
		//如果已经存在文件的话,是不能重复创建的,看来是需要手动删除,然后再创建!>
//		File f3 = new File("/Users/lizhixuan/Downloads/kumanxuan/six.txt");
		File f3 = new File("/Users/lizhixuan/Downloads/kumanxuan");
		File f4 = new File("/Users/lizhixuan/Downloads/kumanxuan/six.txt");
//		System.out.println("创建文件夹是否成功!? ->"+f4.mkdirs());
		//下面这个一样不会覆盖的!.
		System.out.println("创建文件测试是否覆盖!!? ->"+f4.createNewFile());
		
		//测试一下看看能否删除.!
		//测试过了,就是,可以删除目录的!.
//		System.out.println("查看是否删除成功!-> "+f3.delete());
		
		
		//列出文件
		System.out.println("测试list");
		System.out.println(Arrays.toString(f3.list()));
		
		//测试lists
		//测试结果就是,获取的结果,就是File类型的,然后呢,是带有完整的文件路径.!
		System.out.println("测试listFiles");
		System.out.println(Arrays.toString(f3.listFiles()));
		
		
	}

}
