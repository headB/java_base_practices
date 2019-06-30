package day17.io.test;

	
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

	//需求：字符解码和编码操作
	public class DemoTest2 {
		public static void main(String[] args) throws UnsupportedEncodingException {
			String str = "陈小丹@";
			//编码操作:String-->byte
			byte[] b = str.getBytes("UTF-8");//转换为UTF-8的字节
			System.out.println(Arrays.toString(b));
			//解码操作:byte-->String
			String ret = new String(b,"GBK");
			System.out.println(ret);
			//解决方案:重新对乱码编码回到byte[],按照UTF-8解码
			b = ret.getBytes("GBK");
			System.out.println(Arrays.toString(b));
			ret = new String(b,"UTF-8");
			System.out.println(Arrays.toString(ret.getBytes()));
			System.out.println(ret);
			
			
			Integer i22 = Integer.parseInt("6");
			Integer i23 = new Integer(6);
			
			System.out.println(i22);
			System.out.println(i23);
			
			int x = 1;
			int x1 = 4;
			int y = x++ + ++x1;
			System.out.println(y);
			
			System.out.println(Arrays.toString("煊".getBytes("GBK")));
			
			System.out.println("最后测试GBK的GBK的getByte");
			byte[] b123 = {-127,-56};
			System.out.println(new String(b123,"GBK"));
			System.out.println(Arrays.toString(new String(b123,"GBK").getBytes("GBK")));
			System.out.println(new String(new String(b123,"GBK").getBytes("GBK"),"GBK"));
			
			byte[] gbkByte =  "阿.阿萨cctv德".getBytes("gbk");
			System.out.println(Arrays.toString(gbkByte));
			System.out.println(new String(gbkByte,"utf-8"));
//			while(1) {
//				System.out.println("ss");
//			}
			
		}
	}


