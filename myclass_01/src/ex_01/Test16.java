package ex_01;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 단을 입력해주세요!");
		int num = sc.nextInt();
		if ((num <= 1) || (num >= 10)) {
			System.out.println("잘못 입력하였습니다. ");
		} else {
			for (int i = 1; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		}

	}

}
