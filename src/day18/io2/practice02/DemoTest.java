package day18.io2.practice02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//2. 作业二: 
//需求:演示字符文件输入流(FileReader)-输入操作
//作业目的:掌握字符文件输入流(FileReader)-输入操作

public class DemoTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		File f1 = new File("/Users/lizhixuan/Downloads/eatFruit.txt");
		
		FileReader fr1 = new FileReader(f1);
		char[] c1 = new char[8];
		int i =0;
//		int i = fr1.read(c1);
//		
//		while(i>0) {
//			
//			System.out.println(c1);
//			i = fr1.read(c1);
//			
//		}
		
		
		
		while((i=fr1.read(c1))!=-1) {
			
			//然后读取,输出
			System.out.println(c1);
		}
		System.out.println(fr1.read(c1));
		
		System.out.println("======输出剩下的字符!====");
		System.out.println(c1);
		
	}

}
