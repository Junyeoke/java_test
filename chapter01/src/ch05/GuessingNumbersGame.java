package ch05;

import java.util.Random;

public class GuessingNumbersGame {

	public static void main(String[] args) {
		
		// 스캐너
		// Random 무작위
		Random random = new Random();
		int resultRandom = random.nextInt(3) + 1; // 난수(랜덤 정수값을 하나 반환해준다)
		// (45) 괄호 안에 숫자를 넣으면 0부터 44까지 랜덤 숫자를 만들어준다.
		System.out.println(resultRandom);
		
		// 스캐너를 화
	} // end of main

} // end of class
