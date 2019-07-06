package day18.io2.enhance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;

//增强IO练习

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//调用方法.
		try {
			operateFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	static void operateFile() throws Exception {
		
//		File f1 = new File("/Users/lizhixuan/Downloads/eatFruit1.short.txt");
		
		FileInputStream f2 = new FileInputStream("/Users/lizhixuan/Downloads/eatFruit1.short.txt");
		
		FileWriter f3 = new FileWriter("/Users/lizhixuan/Downloads/eatBBBB.txt");
		
		//尝试读取.
		int existContent=-1;
		
		byte[] content = new byte[20];
		
		while((existContent=f2.read(content))!=-1) {
			
				System.out.println(new String(content));
//				边度边写
				f3.write(new String(content).toCharArray());
			
		}
		
		f2.close();
		f3.close();
		
		
	}

}
