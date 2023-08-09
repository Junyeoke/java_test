package ch05;

public class ContinueMainTest {
	public static void main(String[] args) {

		// 1부터 100까지 화면에 결과를 출력하시오.
		// 만약 3의 배수라면 화면에 값을 출력하지마시오.
		int i;
		int count = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				count += 1;
				continue;
			} // end of if
			System.out.println("i : " + i);		
		} // end of for
		// 3의 배수의 개수를 출력해주세요
		System.out.println("3의 배수 개수는 : "+count + " 입니다.");
		
		
	} // end of main

} // end of class
