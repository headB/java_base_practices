package day18.io2.practice06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//6. 作业六:
//需求:演示字节缓冲流(BufferedInputStream-BufferedOutputStream)-输入操作和输出操作 
//作业目的:掌握字节缓冲流(BufferedInputStream-BufferedOutputStream)-输入操作和输出操 作

//就是复制粘贴就可以啦!>

public class DemoTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//好像其实用法是一样的.
//		/Users/lizhixuan/Downloads/贺圣军-python大纲.xmind
		File f1 = new File("/Users/lizhixuan/Downloads/贺圣军-python大纲.xmind");
		File f2 = new File("/Users/lizhixuan/Downloads/贺圣军-python大纲1.xmind");
		File f3 = new File("/Users/lizhixuan/Downloads/贺圣军-python大纲2.xmind");
		
		//读取
		BufferedInputStream bi1 = new BufferedInputStream(new FileInputStream(f1));
		BufferedOutputStream bi2 = new BufferedOutputStream(new FileOutputStream(f2));
		
		//然后就开始边读边写.!
		byte[] byteArray = new byte[512];
		int i = 0;
		while((i=bi1.read(byteArray))!=-1) {
			
			bi2.write(byteArray);
			
		}
		
		bi2.close();
		bi1.close();
		
		
		
		

	}

}
