package day17.io.practice08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

//8. 作业八 FileInputStreamDemo.java
//需求:使用文件字节输入流进行输入操作
//作业目的:掌握输入操作

public class DemoTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String six = "666 我是six 666 六六六!";
		
		System.out.println(Arrays.toString(six.toCharArray()));
		System.out.println(Arrays.toString(six.getBytes()));
		//四大基佬
		
		//挖井
		
		File f1 = new File("/Users/lizhixuan/Downloads/kumanxuan/six.txt");
		//然后搭桥
		FileInputStream fl1 = new FileInputStream(f1);
		
//		System.out.println((char)fl1.read());
//		System.out.println((char)fl1.read());
		
		//设置一个缓冲区去接收.,普通的 byte数组就可以了
		byte[] charArray = new byte[30];
		int temp = fl1.read(charArray);
		System.out.println(temp);
		System.out.println("中间分界,心理变态!");
		System.out.println(Arrays.toString(charArray));
		System.out.println(charArray.toString());
		for(byte ctemp:charArray) {
			System.out.print((char)ctemp);
		}
		
		//然后尝试利用String去解读接收回来的Byte.!非char喔.!
		String s1 = new String(charArray);
		System.out.println("尝试利用new String 去读取中文!");
		System.out.println(s1);
		//然后成功了.!
		char[] char123 = s1.toCharArray();
		System.out.println("打印char数组!");
		System.out.println(Arrays.toString(char123));
		System.out.println(char123[6]);
		System.out.println(Arrays.toString("黎".getBytes()));
		
		
		
		fl1.close();
		
		//尝试演示 文件字符流
		File f11 = new File("/Users/lizhixuan/Downloads/kumanxuan/six2.txt");
		
		FileWriter w1 = new FileWriter(f11);
		
		w1.write("我是666,也不用转换字符串");
		
		w1.close();
		
		//然后尝试用回文件字节流去读取中文的东东.!
		FileReader r1 = new FileReader(f11);
		char[] charWord = new char[100];
		r1.read(charWord);
		System.out.println("打印用FileReader读取的文件!");
		System.out.println(charWord);
		
		
	}

}
