package ch03;

public class MainTest6 {

	public static void main(String[] args) {

		// 관계연산자, 비교연산자
		// 관찰의 결과가 참, 거짓을 판별할 때 사용한다.
		// 결과는 오직 true, false로 반환이 된다.

		boolean value1 = 5 > 3;
		boolean value2 = 5 < 3;
		boolean value3 = 5 == 1;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

		boolean value4;
		int num1 = 10;
		int num2 = 50;

		value4 = num1 < num2;
		System.out.println(value4);
		value4 = num1 > num2;
		System.out.println(value4);
		System.out.println("-------------------");
		// 문제 직접 만들어 보기
		// 1번 num3과 num4의 값을 비교한 결과는?
		boolean value5;
		int num3 = 100;
		int num4 = -20;
		value5 = num3 == num4;
		System.out.println(value5);

		// 2번 num5과 num6의 값을 비교한 결과는?
		boolean value6;
		int num5 = 0;
		int num6 = 0;
		value6 = num5 < num6;
		System.out.println(value6);

		// 3번
		boolean value7;
		int num7 = 45;
		int num8 = 45;
		value7 = num7 >= num8;
		System.out.println(value7);

		// 4번
		boolean value8;
		int num9 = 100;
		int num10 = 101;
		value8 = ++num9 == num10; 
		System.out.println(value8);

		// 5번
		boolean value9;
		int num11 = 10;
		int num12 = 11;
		value9 = (++num11) - 1 == num12;
		System.out.println(value9);
		System.out.println(num11);

		// 6번
		boolean value10;
		int num13 = 100;
		int num14 = 100;
		value10 = num13 != num14;
		System.out.println(value10);

	} // end of main

} // end of class
