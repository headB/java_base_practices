package day18.io2.practice04;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//4. 作业四: 
//需求:文件字符流完成拷贝操作
//作业目的:掌握文件字符流完成拷贝操作

public class DemoTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//证实失败了,!二进制文件是不能使用FileWriter去操作的!.
//		/Users/lizhixuan/Downloads/贺圣军-python大纲.xmind
//		/Users/lizhixuan/Downloads/eatFruit.txt
		//
		File f1 = new File("/Users/lizhixuan/Downloads/eatFruit.txt");
		File f2 = new File("/Users/lizhixuan/Downloads/eatFruit.bak.txt");
		
		FileReader f3 = new FileReader(f1);
		FileWriter f4 = new FileWriter(f2);
		
		//边读取,边copy
		char[] charArray = new char[512];
		int i = 0;
		
		while( (i=f3.read(charArray))!=-1 ) {
			
			f4.write(charArray);
			
		}
		System.out.println(charArray);
		
		//记得close,不然的话,是不会写入到文件的!.
		f4.close();
		f3.close();
		
		
		

	}

}
