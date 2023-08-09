package ch01;

public class MainTest1 {

	// 코드의 시작점
	public static void main(String[] args) {

		Student kim;
		Student hong; // 변수의 선언
		hong = new Student(); // 변수의 초기화
		hong.age = 10; // . 연산자 -> 객체안에 들어간다.
		// 화면에 hong age 값을 출력하시오.
		System.out.println(hong.age);

	} // end of main
} // end of class
