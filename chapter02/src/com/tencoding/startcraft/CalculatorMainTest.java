package com.tencoding.startcraft;

public class CalculatorMainTest {

	public static void main(String[] args) {
		
		// Calculator에 더하는 기능 호출
		// static 를 활용할 때 클래스이름.xxx 를 사용할 수 있다.
		System.out.println("더하기 : " + Calculator.add(1, 2));
		System.out.println("빼기 : " + Calculator.subtract(4, 2));
		System.out.println("곱하기 : " + Calculator.multiply(4, 2));
		System.out.println("나누기 : " + Calculator.divide(4, 2));
		System.out.println("나누기 오류 : " + Calculator.divide(4, 0));
		
		int result1 = Calculator.add(1, 10);
		System.out.println(result1);
		int result2 = Calculator.divide(10, 0);
		System.out.println(result2);

	} // end of main

} // end of class
