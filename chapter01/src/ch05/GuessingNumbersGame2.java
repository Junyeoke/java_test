package ch05;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumbersGame2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		// 랜덤 도구 사용
		// 스캐너 도구 사용
		// 1. 랜덤 숫자 발생 1부터 5까지 하나 생성
		// 2. 사용자의 키보드 입력값을 받아주세요
		// 3. 만약 랜덤 숫자와 사용자의 입력 값이 맞으면 성공
		// 4. 기회는 3번만 주어집니다.

		int count = 3;

		do {
			int randomNum = random.nextInt(5) + 1;
			System.out.println("5이하의 값을 입력해보세요!");
			System.out.print(">>>");
			int userNum = sc.nextInt();
			if (userNum == randomNum) {
				System.out.println("성공!! 프로그램을 종료합니다.");
				break;
			} else {
				count--;
				System.out.println("남은기회 : " + count + " 회 남았습니다.");
			}
		} while (count != 0);
		if (count == 0) {
			System.out.println("기회가 없습니다. 실패!!");
		}

	} // end of main

} // end of class
