package ch05;

import java.util.Scanner;

public class ContinueMainTest2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1부터 10까지 화면에 결과를 출력하시오.
		// 만약 3의 배수라면 화면에 값을 출력하지마시오.
		int i;
		int count = 0;
		System.out.println("알고싶은 배수를 입력하세요");
		final int A = sc.nextInt();
		System.out.println("시작값을 입력하세요");
		int start = sc.nextInt();
		System.out.println("종료값을 입력하세요");
		int end = sc.nextInt();
		
		for (i = start; i <= end; i++) {
			if (i % A == 0) {
				count += 1;
				continue;
			} // end of if
			// System.out.println("i : " + i);		
		} // end of for
		// 3의 배수의 개수를 출력해주세요
		System.out.println(A +"의 배수 개수는 : "+ count + " 개 입니다.");
		
		
	} // end of main

} // end of class
