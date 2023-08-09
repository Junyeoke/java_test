package ch04;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {

		// 문제 1
		Scanner sc = new Scanner(System.in); // 스캐너 도구 준비완료

		// 스캐너를 사용하여 성적을 입력받아주세요.
		System.out.println("성적을 입력해주세요!");
		int score = sc.nextInt(); // R value -> 정수값을 키보드에서 입력 받는다.
		// 2. 만약 90점 이상이면 A 출력
		// 3. 만약 80점 이상이면 B 출력
		// 4. 만약 70점 이상이면 C 출력
		// 5. 만약 70점 아래면 F 출력
		if (score >= 90) {
			System.out.println("당신의 성적은 A학점 입니다.");
		} else if (score >= 80) {
			System.out.println("당신의 성적은 B학점 입니다.");
		} else if (score >= 70) {
			System.out.println("당신의 성적은 C학점 입니다.");
		} else {
			System.out.println("당신의 성적은 F학점 입니다.");
		} 
	}
}
