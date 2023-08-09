package ch05;

import java.util.Scanner;


public class DoWhileMainTest {

	public static void main(String[] args) {
		
//		do {
//			// 한번은 반드시 수행되는 구문
//		} while (조건식);
		
		Scanner sc = new Scanner(System.in);
		int userInput;
		
		do {
			System.out.println("==================");
			System.out.println("0번을 누르면 종료, 1번 메인화면 출력");
			userInput = sc.nextInt(); // 사용자에게 정수값 입력 받기
		} while ( userInput != 0); // 입력값이 0이 아니라면 수행문으로 다시 올라감, 0인 경우 do while 문 탈출
			System.out.println("프로그램 종료"); // 0인 경우 출력값
	} // end of main

} // end of class
