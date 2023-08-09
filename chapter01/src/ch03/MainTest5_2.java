package ch03;

public class MainTest5_2 {

	public static void main(String[] args) {

		// 증감, 감소 연산자 - 모양 : 변수 기준으로 앞에 사용, 뒤에 사용 가능하다. (주의 점은 오직 1만 더하거나 빼는 것)
		
		// 1. 증가 연산자가 뒤에 올 경우
		int num1 = 10;
		num1++;
		
		// 응용
		int num2 = 10;
		int num3;
		
		num3 = num2++;
		System.out.println(num3);
		System.out.println(num2);
		
		System.out.println("=================");
		
		// 2. 감소 연산자가 앞에 올 경우
		
		int num20 = 100;
		int num21;
		
		num21 = ++num20;
		System.out.println(num20);

	} // end of main

} // end of class
