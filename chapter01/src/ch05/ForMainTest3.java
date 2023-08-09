package ch05;

public class ForMainTest3 {

	public static void main(String[] args) {

		// 1 부터 10까지 더하는 결과를 화면에 출력하시오.
		int num = 10;
//		num = num + 1; // 1
//		num = num + 2; // 3
//		num = num + 3; //
//		num = num + 4;
//		num = num + 5;
//		num = num + 6;
//		num = num + 7;
//		num = num + 8;
//		num = num + 9;
//		num = num + 10;

		// 11부터
		for (int i = 1; i < 11; i++) {
			num = --num + i;
					}
		System.out.println("결과 : " + num);
	}

}
