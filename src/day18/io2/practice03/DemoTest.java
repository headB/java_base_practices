package day18.io2.practice03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//3. 作业三:
//需求:演示字符文件输出流(FileWriter)-输出操作 
//作业目的:掌握字符文件输出流(FileWriter)-输出操作

public class DemoTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File f1 = new File("/Users/lizhixuan/Downloads/eatFruit1.txt");
		
		
		FileWriter f2 = new FileWriter(f1);
		f2.write(97);
		f2.write("Test 测试write!");
		
		f2.close();
		
		

	}

}
