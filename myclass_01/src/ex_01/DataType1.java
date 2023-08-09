package ex_01;

public class DataType1 {

	public static void main(String[] args) {

		// 데이터 타입에는 2가지 종류
		// 1. 기본 데이터 타입
		// 2. 참조타입

		// 기본 데이터 타입 - int가 기본 연산단위
		byte b; // 1바이트
		int i; // 2바이트
		short s; // 4바이트
		long l; // 8바이트

		b = 127;
		System.out.println(b);
		b = -128;
		System.out.println(b);

		// R벨류값 기준 정수형 int(4바이트)로 받아들인다.
		// 즉, 접미사를 입력해주어야 한다.
		// l = 120000000000; // <- 오류발생
		l = 120000000000L; //
		System.out.println(l);

		// 실수형을 표현할 때는 기본단위는 double이 적용됨.
		double dou = 11.0;
		// float fot = 18.0; <-오류발생
		float fot = 18.0F; // 접미사 f(F)를 사용해야 한다. 기본단위가 double로 적용되기 때문.

		System.out.println("double의 값 : "+ dou);
		System.out.println("float의 값 : "+ fot);
	} // end of main
} // end of class
