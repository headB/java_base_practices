package day09.practice01;

//需求:
//定义一个青蛙类(Frog)继承于动物类(Animal)，
//同时实现于会走路(IWalkable)， 
//会游泳(ISwimable)的接口

public class Frog extends Animal implements ISwimable,IWalkable {
	
		public void walk() {
			System.out.println("蛙跳,你说刺不刺激!");
		};
		
		public void swim() {
			System.out.println("我蛙泳,游啊游,刺不刺激!");
		};
		
	}