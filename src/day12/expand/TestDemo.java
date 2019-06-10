package day12.expand;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

//1.拓展一
//给 一 个 字 符 串 
//name= 小 红 &age=17&salary=8000.00&hireDate=1991-07-03;
//name= 小 明 &age=23&salary=10000.00&hireDate=1992-12-11;
//name= 小 白 &age=18&salary=12000.00&hireDate=1996-01-09，
//
//请把字符串中的数据封装到 Employee 的对象中，
//类 Employee 有 
//name(String 类型)、
//age(int 类型)、
//salary(薪水是 BigDecimal 类型)、 
//hireDate(入职日期是 Date 类型)
// 四个字段且符合 JavaBean 规范 把三个创建的对象存放数组中，
// 求出在 1996 年前入职的员工的的平均薪资。

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 然后就是利用split来做分离,然后进行下一步的实例化了.!

		String s1 = "name= 小红&age=17&salary=8000.00&hireDate=1991-07-03;name= 小明&age=23&salary=10000.00&hireDate=1992-12-11;name= 小白&age=18&salary=12000.00&hireDate=1996-01-09;";

		Employee[] employeeArray = new Employee[3];

		// 然后就开始拆分了.
		String[] s2 = s1.split(";");

		int i = 0;

		for (String s3 : s2) {
			// 然后开始拆分具体的属性.
			String[] s4 = s3.split("&");
			// 然后就进行判断是否都具有这些属性,然后最后就正式创建并且保存到数据当中.

			String name = null;
			int age = 0;
			BigDecimal salary = null;
			Date hireDate = null;

			for (String s5 : s4) {

				String[] s6 = s5.split("=");
				if ("name".equals(s6[0])) {
					name = s6[1].trim();
				} else if ("age".equals(s6[0])) {
					age = Integer.parseInt(s6[1].trim());
				} else if ("salary".equals(s6[0])) {
					salary = new BigDecimal(s6[1].trim());
				} else if ("hireDate".equals(s6[0].trim())) {
					// 嗯嗯,重点来了,这里需要String转换成为Date
					// 先创建日期格式化的那个工具
					SimpleDateFormat sdf1 = new SimpleDateFormat();
					String pattern = "yyyy-mm-dd";
					sdf1.applyPattern(pattern);
					// 然后把时间的那个字符串扔到这个sdf1,这个sdf可以根据具体的Date输出格式,也可以解析时间
					try {
						hireDate = sdf1.parse(s6[1]);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					// 然后全部都判断一下是否都具备条件
					if (name != null && age != 0 && salary != null && hireDate != null) {

						employeeArray[i] = new Employee(name, age, salary, hireDate);

						i++;

					}

				}

			}

		}
		
		System.out.println(Arrays.toString(employeeArray));
		
		//不考虑代码优化问题了,直接重新写一个循环去判断了.!
		BigDecimal count = new BigDecimal("1");
		BigDecimal avg = null;
		BigDecimal sum = new BigDecimal("0");
		
		for(Employee e1:employeeArray) {
			
			//又得格式化输出!
			SimpleDateFormat sdf1 = new SimpleDateFormat();
			sdf1.applyPattern("yyyy");
			
			
			if(Integer.parseInt((sdf1.format(e1.getHireDate())))<1996) {
				
				//获取第一个对象的工资.格式化.,,,,不用格式化,已经有了. 并且进行累加
				sum = sum.add(e1.getSalary());
				//然后就相除
				System.out.println("this is count ---> "+count.toString());
				avg = sum.divide(count);
				
				count = count.add(new BigDecimal("1"));
				
				System.out.println("this is count -> "+count.toString());
				System.out.println("this is sum -> "+sum.toString());
				System.out.println("this is avg -> "+avg.toString());
			}
			
//			int date = e1.getHireDate().getYear();
//			System.out.println(date);
//			if(e1.getHireDate())
			
		}
		
		//最后就尝试打印结果
		System.out.println("这是平均值-> "+avg);
		

	}

}
