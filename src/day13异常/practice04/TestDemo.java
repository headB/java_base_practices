package day13异常.practice04;
import java.io.IOException;
import java.security.acl.AclNotFoundException;

import day13异常.practice01.*;

public class TestDemo {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		
		//这里需要测试throw和throws
			
//			Son s1 = new Son();
//			System.out.println("six");
		
		TestDemo t1 = new TestDemo();
		
		try {
			t1.maybeError();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("手动处理了第一个错误!");
			e.printStackTrace();
		}
		
		
		
		t1.maybeError2();
		
		
		try {
			t1.maybeError1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("下面的红字只是表示信息而已,程序是没有终止的!");
			e.printStackTrace();
		}
		
		System.out.println("我是程序的最后!");
			

	}
	
	
//	public void maybeError() throws Exception,AclNotFoundException {
	public void maybeError()  {
		
		System.out.println("这里是测试throws");
		
//		int i = 1 / 0;
//		throw new CarWrongRuntimeException("你部车好似出左问题啦!");
		throw new NullPointerException("你出现空指针啦.!");
		
	}
	
public void maybeError1() throws Exception,AclNotFoundException  {
		
		System.out.println("这里是测试throws2222");
		
//		int i = 1 / 0;
//		throw new CarWrongRuntimeException("你部车好似出左问题啦!");
		throw new NullPointerException("你出现空指针啦222222.!");
		
		//后面的程序是不会运行的!
//		System.out.println("sss");
		
	}


//public void maybeError2() throws Exception,AclNotFoundException  {
//下面这个就是会报错,因为呢,这里throws没有传递到对应的  XxxxException 的异常.
//public void maybeError2() throws CarWrongRuntimeException,IOException   {
public void maybeError2() throws CarWrongException   {
	
	System.out.println("这里是测试throws2222");
	
//	int i = 1 / 0;
//	throw new CarWrongRuntimeException("你部车好似出左问题啦!");
//	throw new NullPointerException("你出现空指针啦222222sixsixsix.!");
//	throw new IOException();
	throw new CarWrongException();
	
	//后面的程序是不会运行的!
//	System.out.println("sss");
	
}
	
	

}
