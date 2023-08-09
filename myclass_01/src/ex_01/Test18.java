package ex_01;

import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {
		
		// 100이하의 정수를 입력받아 정수만큼 자바 프로그래밍 이라고 출력하는 프로그램
		
		Scanner scn = new Scanner(System.in);
		System.out.println("100이하의 정수를 입력해주세요");
		int i;
		int a = scn.nextInt();
		
		if (a > 0 && a < 101) {
			for (i = 1; i<=a; i++) {
				System.out.println("자바 프로그래밍");
			}
		} else {
			System.out.println("입력값이 잘못되었습니다.");
		}
	}

}
