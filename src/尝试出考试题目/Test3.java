package 尝试出考试题目;

public class Test3 {

//	3、使用switch编写程序，给定一个学生成绩，给出相应等级：
//	(1)90~100 优秀
//	(2)80~89 良好
//	(3)70~79 中等
//	(4)60~69 及格
//	(5)0~59 不及格

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scoreOutput(97);
		scoreOutput(87);
		scoreOutput(77);
		scoreOutput(67);
		scoreOutput(57);
		scoreOutput(47);

		countNumber(15);

		advanceCountNumber(15, 0);

	}

	static void scoreOutput(int number) {

		switch (number / 10) {

		case 10:
		case 9:
			System.out.println("优秀");
			break;
		case 8:
			System.out.println("良好");
			break;
		case 7:
			System.out.println("中等");
			break;
		case 6:
			System.out.println("及格");
			break;
		default:
			System.out.println("不及格");
			break;

		}

	}

//	5、验证“鬼谷猜想”：对任意自然数num，
//	若是奇数，就对它乘以 3 再加 1；
//	若是偶数，就对它除以 2，这样得到一个新数，
//	再按上述计算规则进行计算，一直进行下去，最终num为1的时候不再运算，求出num为1时共循环了几次。
//	例如：num = 10偶数，除以2后num为5奇数，乘以3+1 num为16...

	static void countNumber(int number) {

		int count = 0;
		int sum = 0;
		while (number != 1) {

			if (number % 2 == 0) {

				number = number / 2;

			} else {

				number = number * 3 + 1;

			}

			count++;

		}

		System.out.println("循环了这几次!");
		System.out.println(count);

	}

	static void advanceCountNumber(int number, int count) {

		int sum = 0;

		if (number == 1) {
			System.out.println("循环了" + count);
		} else {

			count++;

			if (number % 2 == 0) {

				number = number / 2;

			} else {

				number = number * 3 + 1;

			}

			advanceCountNumber(number, count);

		}
		
		System.out.println("asd");

//		System.out.println("循环了这几次!");
//		System.out.println(count);

	}

}
