package ex_01;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		int age = 19;
		if (age >= 20) {
			System.out.println("고등학교를 졸업 했습니다.");
		} else {
			System.out.println("학교에 다니고 있습니다.");
		}
		System.out.println("===================================");
		int age2 = 20;
		if (age <= 7) {
			System.out.println("학교에 다니지 않습니다.");
		} else if (age <= 13) {
			System.out.println("초등학교에 다니고 있습니다.");
		} else if (age <= 16) {
			System.out.println("중학교에 다니고 있습니다.");
		} else {
			System.out.println("고등학교에 다니고 있습니다.");
		}
		
		System.out.println("===================================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		int age3 = sc.nextInt();
		int charge;
		
		if(age3 < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		} else if (age3 < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		} else if (age3 < 20) {
			charge = 2500;
			System.out.println("중, 고등학생 입니다.");
		} else {
			charge = 10000;
			System.out.println("일반인 입니다.");
		}
		System.out.println("귀하의 입장료는 " + charge + "원 입니다.");
	

	}

}
