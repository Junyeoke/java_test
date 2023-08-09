package ch03;

public class MainTest5 {

	public static void main(String[] args) {

		// 증감, 감소 연산자
		// How? ++, --

		// 1. 증감연산자
		int num1 = 1;
		// ++num1;
		// num1++;
		// 변수에 접근해서 값을 오직 더하기 1한다.
		System.out.println(num1);
		System.out.println("--------------------");
		// num1++;

		// num1의 값 2를 출력하라
		// 현재 num1 에는 1이라는 값이 담겨져 있다
		// 방법 1 num1 = 2;
		// 방법 2 num1 = num1 + 1;
		// 방법 3 num1 += num1;
		// 방법 4 num1++;
		// 주의 할 점 - 증감 연산자는 오직 1을 더해준다. 2도 아니고 3도 아니고 ...

		// 감소 연산자
		int num2 = 1;
		// num2 라는 메모리 공간 안에 0이 될 수 있는 코드 방식을 4가지로 작성
		// num2 = 0;
		// System.out.println(num2);
		// num2 = num2 - 1;
		// System.out.println(num2);
		// num2 -= num2;
		// System.out.println(num2);
		// num2 --;
		// System.out.println(num2);

	} // end of main

} // end of class
