package day10.practice04;

//4. 第四题
//需求:演示匿名内部类用法
// 定义一个父类Animal和一个接口IUSB
// 在测试类中创建一个Animal的子类匿名内部类和IUSB的实现类匿名内部类
//作业目的:掌握匿名内部类的语法和使用


public class TestDemo {
	
	public static void main(String[] args) {
		
		//下面这里才是重点.!
		
		new Animal() {
			void speak() {
				System.out.println("时间返回到19890604");
			}
		};
		
		//实例化一个Animal对象
		
		Animal a11 = new Animal();
		a11.getIUSB(new IUSB() {
			
			public void work() {
				System.out.println("hello world!");
			}
			
		});
		
//		new Animal().new Human();
		
		
		//匿名创建IUSB的实现内部类!???
		new IUSB(){
			
			public void work() {
				System.out.println("hello world!");
			}
			
		};
		
		
		
		
		
		
		
		
		
		
		
		//创建  实例内部类的匿名内部类,原来,Human这个实例内部类,
		//真的是和成员变量一样,可以直接调用,
		Animal a1 = new Animal();
		Animal.Human a2 = a1.new Human();
		
		
		//实例化一个   用static修饰的内部类.
		Animal.HumanStatic h1 = new Animal.HumanStatic();
		h1.speak();
		
		
		
		
		
		//这里是尝试创建一个Animal的子类.
		
		
		
		
		
		
		//{ 这里添不添加这个  局部变量的代码块,好像只影响能不能调用而已,
		//好像并没有其他太大的意义.!
		
			//局部内部类??,对啊,有什么卵用?
			class TestIntractClass {
				
				void echo() {
					System.out.println("echo,局部内部类??,对啊,有什么卵用?");
				}
						
			}
			TestIntractClass t1 = new TestIntractClass();
			t1.echo();
			
	//}
		TestIntractClass t2 = new TestIntractClass();
		t1.echo();
			
		}
			
		
		
	}

