package ex_01;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력해주세요");
		double score = sc.nextDouble();
		
		if (score >=90) {
			System.out.println("점수가 100~90점 입니다.");
			System.out.println("등급은 A입니다.");
		} else if (score >=80) {
			System.out.println("점수가 80~89점 입니다.");
			System.out.println("등급은 B입니다.");
		} else if (score >=70) {
			System.out.println("점수가 70~79점 입니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70점 미만입니다.");
			System.out.println("등급은 D 입니다.");
		}

	}

}
