package day17.io.practice09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//9. 作业九 
//需求:使用文件字节流进行文件拷贝
//作业目的:掌握文件拷贝操作

public class DemoTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//嗯嗯,准备尝试去copy文件了,但是呢,就是,任何文件都是可以这样copy吗?
		//我就记得python里面,如果是涉及到操作二进制文件复制的话,直接用b就可以表示是二进制文件的copy的了.!
		
//		一般的，操作二进制文件(图片、音频、视频等)必须使用字节流
		
		String s1 = "/Users/lizhixuan/Downloads/贺圣军-python大纲.xmind";
		
		File f1 = new File(s1);
		
		FileInputStream f2 = new FileInputStream(f1);
		
		//设置固定长度的数组
		byte[] byteArray = new byte[50];
		int i=0;
	
		
		//然后写入到另外一个文件,
		
		FileOutputStream f3 = new FileOutputStream(s1+".bak.xmind");
		
		
		//尝试定义一个Arraylist的数组去保存数据
		List<byte[]> list = new ArrayList<>();
		
		while((i = f2.read(byteArray))!= -1) {
			f3.write(byteArray);	
//			list.add(byteArray);
		}
		System.out.println(Arrays.toString(byteArray));
		
//		for(byte[] b1:list) {
//			f3.write(b1);
//		}
		
		f3.close();
		
		System.out.println(Arrays.toString(byteArray));
		
		

		//然后关闭资源.
		f2.close();
		
	}

}
