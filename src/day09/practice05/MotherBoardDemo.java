package day09.practice05;

public class MotherBoardDemo {

		public static void main(String[] args) {
			
			
			//首先创建一个主板
			MotherBoard m1 = new MotherBoard();
			
			//然后创建一个鼠标
			Mouse mouse = new Mouse();
			
			//然后创建一个键盘
			Keyboard keyboard = new Keyboard();
			
			//然后就尝试插入到主板上面,并且,并且同时产生反应.!
			m1.plugin(mouse);
			m1.plugin(keyboard);
			
			
			
			
		}
}
