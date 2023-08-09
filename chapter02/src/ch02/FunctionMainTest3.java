package ch02;

import ch01.User;

public class FunctionMainTest3 {

	// 코드의 시작점
	public static void main(String[] args) {
		// total << 기본 데이터 타입, (지역변수)
		int total = (int)minus(10.0, 5.0);
		System.out.println(total);
		
		// kim << 참조타입, (지역 변수)
		User kim = new User();
		System.out.println(kim);
		
		

	} // end of main

	// 함수를 만들어 주세요
	// 리턴 값이 실수인 minus라는 이름을 가진 함수를 선언
	// 매개변수는 실수형 2개를 받는 것을 선언해주세요
	// n1에서 n2를 빼는 기능
	public static double minus(double n1, double n2) {
		// 지역변수 : 스택 메모리에 올라간 녀석을 지역 변수라고 한다.
 		double result = n1 - n2;
		return result;
	}
	
	
} // end of class
