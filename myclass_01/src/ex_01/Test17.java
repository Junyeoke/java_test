package ex_01;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		
		// 정수를 입력 받고, 입력받은 정수의 갯수만큼 열을 출력하며 이때, 열마다 행의 *갯수는 +1씩 추가되는 코드를 작성
		
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하시오 : ");
		int user = sc.nextInt();
		for (int i = 0; i < user; i++) {
			for (int j = 1; j <= user; j++) {
				if (j >= user - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
