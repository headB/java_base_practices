package BigDe;

/*
Ŀ��:
	�� һ �� �� �� �� name= С �� &age=17&salary=8000.00&hireDate=1991-07-03;
	name= С �� &age=23&salary=10000.00&hireDate=1992-12-11;
	name= С �� &age=18&salary=12000.00&hireDate=1996-01-09��
 	����ַ����е����ݷ�װ�� Employee �Ķ����У� 
 	�� Employee �� name��String ���ͣ���age��int ���ͣ���salary��нˮ�� BigDecimal ���ͣ�hireDate����ְ������ Date ���ͣ� �ĸ��ֶ��ҷ��� JavaBean �淶 �����������Ķ����������У������ 1996 ��ǰ��ְ��Ա���ĵ�ƽ��н��
*/
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;


/*
Ŀ��:
	�� һ �� �� �� �� name= С �� &age=17&salary=8000.00&hireDate=1991-07-03;
	name= С �� &age=23&salary=10000.00&hireDate=1992-12-11;
	name= С �� &age=18&salary=12000.00&hireDate=1996-01-09��
 	����ַ����е����ݷ�װ�� Employee �Ķ����У� 
 	�� Employee �� name��String ���ͣ���age��int ���ͣ���salary��нˮ�� BigDecimal ���ͣ�hireDate����ְ������ Date ���ͣ� �ĸ��ֶ��ҷ��� JavaBean �淶 �����������Ķ����������У������ 1996 ��ǰ��ְ��Ա���ĵ�ƽ��н��
*/

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		String names = "name= 小红 &age=17&salary=8000&hireDate=1991-07-03;name=  阿萨德&age=23&salary=10000&hireDate=1996-12-11;name=  阿萨德a&age=18&salary=12000&hireDate=1996-01-09";

		names = names.replace(" ", "");
		String[] arr1 = names.split(";");
		Employee[] arr3 = new Employee[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			String[] arr2 = arr1[i].split("[&=]");
			String name = arr2[1];
			int age = Integer.parseInt(arr2[3]);
			BigDecimal salary = new BigDecimal(arr2[5]);
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date hireDate = format.parse(arr2[7]);
			Employee employee = new Employee();
			employee.setName(name);
			employee.setAge(age);
			employee.setSalary(salary);
			employee.setHireDate(hireDate);
			arr3[i] = employee;
		}
		
		System.out.println(Arrays.toString(arr3));
		
		int year = 0;
		BigDecimal m = new BigDecimal("0");
		BigDecimal sum = new BigDecimal("0");
		for (int i = 0; i < arr3.length; i++) {
			Date hireDate = arr3[i].getHireDate();
			Calendar c = Calendar.getInstance();
			c.setTime(hireDate);
			year = c.get(Calendar.YEAR);
			if(year == 1996){
				sum =  sum.add(arr3[i].getSalary());
				m = m.add(new BigDecimal("1"));
			}
		}
		System.out.println(m);
		System.out.println(sum.divide(m));
	}
}




class Employee {
	//�� name��String ���ͣ���age��int ���ͣ���salary��нˮ�� BigDecimal ���ͣ���
	//hireDate����ְ������ Date ���ͣ�
	private String name;
	private int age;
	private BigDecimal salary;
	private Date hireDate;
	
	public Employee(){}
	public Employee(String name, int age, BigDecimal salary, Date hireDate) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", hireDate=" + hireDate + "]";
	}

	
}



