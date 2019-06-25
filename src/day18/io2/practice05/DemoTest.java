package day18.io2.practice05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

//5. 作业五: 
//需求:字符解码和编码操作
//作业目的:掌握字符解码和编码操作

public class DemoTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File f1  = new File("/Users/lizhixuan/Downloads/eatFruit-GBK.txt");
		
		//这里说模拟输入!
		String s1 = "今天是星期5";
		
		//编码是针对byte来做的!.
		byte[] byteArray = s1.getBytes("GBK");
		
		
		//然后设置到文件里面
		//只能字节流来操作了.!
		FileOutputStream f2 = new FileOutputStream(f1);
//		FileWriter f2 = new FileWriter(f1);
		
		f2.write(byteArray);
		
		f2.close();
		
		//成功了.!写入了gbk格式的!.
		//然后马上自己尝试去读取
		
		//用reader试一下先.!
		
		FileInputStream f3 = new FileInputStream(f1);
		int i=0;
		byte[] charArray = new byte[512];
		while((i=f3.read(charArray))!=-1) {
			
			//GBK 乱码
//			System.out.println(charArray);
			String s11 = new String(charArray,"GBK");
			System.out.println(s11);
//			System.out.println(charArray.toString().getBytes("GBK"));
			
			
			
		}
		
		

	}

}
