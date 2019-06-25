package day18.io2.practice01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;

//一、视频作业
//1. 作业一: 
//需求:文件拷贝案例-拷贝指定目录的指定类型文件到指定目录
//作业目的:第一天内容的综合操作



public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f1 = new File("/Users/lizhixuan/Downloads");
		
		File f3 = new File("/Users/lizhixuan/Downloads/bak");
		f3.mkdirs();
		
		//列出自己指定的文件过滤
		
//		f1.listFiles( new FileFilter() {
		f1.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				
				if(name!=null && name.contains("txt")) {
					
					//我偷懒啦.!直接在这里设置操作啦.!
//					f3.getPath();
					
					
					
					//然后读取具体的文件内容,然后copy另存为!
					try {
						
						FileOutputStream fo1 = new FileOutputStream(f3.getAbsolutePath()+File.separator+name);
						
						FileInputStream fi1 = new FileInputStream(dir+File.separator+name);
						int i = 0;
						byte[] byteArray = new byte[512];
						while((i=fi1.read(byteArray))!=-1) {
							
							fo1.write(byteArray);
							
						}
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					
					return true;
				}
				
				return false;
			}
			
			
			
		});
		
		

	}

}
