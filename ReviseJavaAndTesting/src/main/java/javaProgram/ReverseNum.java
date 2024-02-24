package javaProgram;

public class ReverseNum {

	public static void main(String[] args) {
		int num = -897;
		int originalNum = num;
		int reverseNum = 0;
		boolean isNegtive = false;
		if (num < 0) {
			num = num * -1;
			isNegtive = true;

		}

		while (num != 0) {

			reverseNum = reverseNum * 10 + (num % 10); // find last digit (reminder)
			num = num / 10; // delete each digit(quotient part)

		}

		if (isNegtive)
			System.out.println(reverseNum + "-");
		else
			System.out.println(reverseNum);
	}

}
