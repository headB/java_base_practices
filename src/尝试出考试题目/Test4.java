package 尝试出考试题目;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1 / 10);

		echoNumber(121);

		test123();
		
		whatYear(2000);
		whatYear(2001);
		whatYear(2004);

	}

//	6、一个n位数，判断它是不是回文数。例如：12321是回文数，个位与万位相同，十位与千位相同。

	static void echoNumber(int number) {

		int count = 1;
		int origin = number;
		int number1 = number;

		while (number / 10 > 0) {

			count++;
			number /= 10;

		}

		// 然后保存到数组?
		int[] array = new int[count];

		for (int i = 0; i < count; i++) {

			array[i] = origin % 10;
			origin /= 10;

		}

		System.out.println(Arrays.toString(array));

		// 然后就可以开始对比异常了.!

		boolean situation = false;
		for (int i = 0; i < count; i++) {

			if (!(i <= count - 1 - i)) {

				break;

			}

			if (array[i] != array[count - i - 1]) {
				System.out.println(array[i] + "-" + array[count - i - 1]);
				situation = true;
				break;
			}

		}

		if (situation) {
			System.out.println(number1 + "不是回音书数");
		} else {
			System.out.println(number1 + "是回音书数");
		}

		System.out.format("这是一个%s 位数", count);

		// 然后就得到多少位数

		// 操作索引?保存到数组?

		// 通过了上面证明这个数是一个一位数,不符合要求

	}

	static void test123() {
		String word = "121";
		int i = word.length();
		int j = 0;
		while (j <= (i / 2) - 1 && word.charAt(j) == word.charAt(i - j - 1))
			j++;
		if (j == i / 2)
			System.out.println("Yes it is HuiWen.");
		else
			System.out.println("No it is not HuiWen.");
	}
	
	static void whatYear(int year) {
		
		if(year % 4==0 && year % 100!=0) {
			System.out.println("闰年");
		}
		else if(year % 400 ==0) {
			System.out.println("闰年");
		}
		else {
			System.out.println("不是闰年!");
		}
		
	}

}
