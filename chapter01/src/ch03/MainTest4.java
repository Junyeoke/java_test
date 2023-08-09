package ch03;

public class MainTest4 {

	public static void main(String[] args) {

		// 복합 대입 연산자
		// 대입 연산자와 다른 연산자랑 함께 쓰인다.

		int num1 = 1;
		// num1 = num1 +10;
		num1 += 10;
		System.out.println(num1);

		int num2 = 1;
		// num2 = num2 + 100;
		num2 += 100; // 위 식을 간소화 한것.
		System.out.println(num2);

		int num3 = 1;
		// num3 -= 10;
		// 위 식을 반대로 풀어서 코드작성
		num3 = num3 - 10;
		System.out.println(num3);

		// num1 = num1 * 2;
		// 위 식을 복합연산자로 변경하면
		num1 *= 2;
		System.out.println(num1);

		// num2 = num2 / 2;
		// 위 식을 복합연산자로 변경
		num2 /= 2;
		System.out.println(num2);

		// num2 = num2 % 2;
		// 위 식을 복합연산자로 변경
		num2 %= 2;
		System.out.println(num2);

	} // end of main

} // end of class
