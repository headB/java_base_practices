package day17.io.practice04;

import java.io.File;

//4. 作业四:FileDemo4.java
//需求:File 类案例-使用递归列出指定目录中所有的子文件
//作业目的:综合使用 File 类中的方法 

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//这个时候.最适合设置一个当度的方法来设置循环.
		
		File f1 = new File("/Users/lizhixuan/Downloads");
		
		list(f1);
		
		
		System.out.println("=============================================");
		System.out.println("=============================================");
		
		
		listFile(f1);

	}
	
	public static void listFile(File f) {
		
		//自己调用自己吧,然后最后设置一个出口
		if(f.isDirectory()) {
			System.out.println("\n当前的目录是-> "+f.getAbsolutePath());
			//然后文件,但是得判断他是文件还是文件夹,然后再次输出文件!
			for(File f2:f.listFiles()) {
				if(f2.isDirectory()) {					
					listFile(f2);
				}else {
					System.out.println("文件名-> "+f2.getName());
				}
			}
		}else {
			System.out.println("文件名-> "+f.getName());
			
		}
		
	}
	
	
	public static void list(File file) {
	    if (file.isDirectory()) {
	// 如果是文件夹，则继续列出 
	    	File[] fs = file.listFiles(); if (fs != null) {
	            for (File f : fs) {
	                list(f);
	} }
	}
	    System.out.println(file);
	}
	
	
	

}
