package day17.io.practice02;

import java.io.File;

//尝试

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//测试file
		String src =  "/Users/lizhixuan/Downloads/kumanxuan/six.txt";
		File f = new File(src);
		
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());

	}

}
