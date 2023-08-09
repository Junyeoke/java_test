package ch03;

import java.util.Scanner;

public class MainTest8 {

	// 코드의 시작점
	public static void main(String[] args) {
		// 삼항 연산자
		// 조건식 ? 결과1 : 결과2;

		int num1 = (5 > 3) ? 10 : 20; // 조건식이 참이면 10, 거짓이면 20을 num1에 입력
		System.out.println(num1);
		// 변수의 선언과 초기화
		int num2 = (5 < 3) ? 10 : 20;
		System.out.println(num2); // 조건식이 거짓이므로 20출력
		System.out.println("=================");
		System.out.println((5 < 3) ? 10 : 20);

		// JDK가 만들어 놓은 도구
		int max = 0;
		// System.out.println("입력 받은 두 수 중 큰 수를 출력하세요");

		// 데이터 타입 이름 ---> 단 대문자로 시작했다.
		// 변수의 종류에는 가장 크게 딱 2가지만 존재한다.
		// 1. 기본데이터 타입
		// 2. 참조타입
		// Scanner sc;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 1 : ");
		int x = sc.nextInt();
		System.out.println("입력 2 : ");
		int y = sc.nextInt();

		/*System.out.println("받아 들인 값 : " + x);
		System.out.println("===================");

		두 수를 비교해서 어떤 사용자가 입력한 값 중에 큰 수를 화면에 출력하시오.
		System.out.println("첫번째 숫자를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요 : ");
		int b = sc.nextInt();
		int maxValue = (a > b) ? a : b;
		int minValue = (a > b) ? b : a;
		System.out.println("큰 숫자는 " + maxValue + " 입니다. ");
		System.out.println("작은 숫자는 " + minValue + " 입니다. ");
		System.out.println("==========================="); */
		
		
		// 삼항 연산자 - 조건 연산자
		// 메모리 공간 호출 = 식을 만들어서 담을 예정
		// x 나 y 중에 큰 값이 max 변수에 담기게 된다.
		max = (x > y) ? x : y ;
		System.out.println("큰 숫자는 " + max + " 입니다. ");
		
		

	} // end of main

} // end of class
