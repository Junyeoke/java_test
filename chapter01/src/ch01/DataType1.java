package ch01;

public class DataType1 {

	public static void main(String[] args) {

		// 데이터 타입 종류는 크게 두가지가 있다.
		// 1. 기본데이터 타입(primitive type)
		// 2. 참조 타입(Reference Type)

		// 기본 데이터 타입의 종류 - 정수형 int가 기본 연산단위로 사용됨
		byte b; // 1바이트
		short s; // 2바이트
		int i; // 4바이트
		long l; // 8바이트

		b = 127;
		b = -128;

		// R벨류(오른쪽 값) 기준으로 정수형 기본(int) 4바이트로 받아들인다.
		// 즉, 접미사를 작성해주어야 한다.
		// 정수형의 기본 연산 단위는 4바이트 이다.
		// long 단위를 작성을 할 때는 접미사를 넣어줘야 인식을 한다.
		l = 21000000000L;

		// 실수형을 표현할 때 사용하는 데이터 타입(float, double) - double이 기본 연산단위로 사용됨.

		double dou = 10.0;
		float fot = 11.7f; // 접미사 f(F)를 작성해야 한다. double이 기본 연산단위라서.

		// 정수형 - int (4byte)
		// 실수형 - double (8byte)

	} // end of main

}// end of class
