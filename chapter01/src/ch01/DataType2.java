package ch01;

public class DataType2 {

	public static void main(String[] args) {

		// 변수의 선언
		char name; // 2byte 공간에 하나의 문자를 담아 둘 수 있다.
		char a;
		char initial;

		// 값을 넣어보자.
		name = 'A'; // 홑 따옴표를 사용해야 한다. 하나의 문자만 담을 수 있다.
		// name = 'AB'; 는 사용불가

		// 문제
		// 1. name 변수의 값을 화면에 출력하시오.
		System.out.println(name);

		// 2. 문자 H를 화면에 출력하시오.
		System.out.println('H');

		// 3. 문자 b를 화면에 출력하시오.
		System.out.println('b');

	} // end of main

} // end of class
