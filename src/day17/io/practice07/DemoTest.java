package day17.io.practice07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//7. 作业七:FileOutputStreamDemo.java 
//需求:使用文件字节输出流进行输出操作
//作业目的:掌握输出操作

public class DemoTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		//使用四大基佬是可以创建文件的.
		
		//可以存在也可以不存在.!具体的文件
		
		
		
		//四大基佬
		
		//具体文件存不存在,都是重新写进去的.!但是呢,就是,如果是文件夹不存在的话,就不能写入文件了.!
		
		
		//挖井.
		File f1 = new File("/Users/lizhixuan/Downloads/kumanxuan/six.txt");
		
		//哈哈哈,要的就是这样的效果,直接就可以创建文件夹,然后就顺势创建了文件.!
		f1.getParentFile().mkdirs();
		
		//搭水管
		FileOutputStream fo1 = new FileOutputStream(f1);
		
		//然后开始写文件
		byte[] b1 = {96,97,88,99,100,'s',-26,-120,-111};
	
		fo1.write(b1);
		
		String s1 = "kumanxuan is a man!";
		
		fo1.write(s1.getBytes());
	
		fo1.close();

	}

}
