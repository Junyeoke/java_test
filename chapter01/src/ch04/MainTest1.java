package ch04;

public class MainTest1 {

	public static void main(String[] args) {

		// 제어문 if
		// 주어진 조건에 따라서 실행이 이루어 지도록 만들 수 있다.

		boolean flag = false;

		// if 문 단독 -> 첫번째 방법
		if (100 < 1) {
			System.out.println("조건식의 결과가 참(ture)입니다.");
		} // end of if

		flag = true;
		if (flag) {
			System.out.println("조건식에 true 출력 됨");
		}

		// if else 구문 -> 두번째 방법
		if (false) {
			System.out.println("결과가 참이면 실행 됩니다.");
		} else {
			System.out.println("결과 거짓이면 이부분이 실행 됩니다.");
		}

		// if else if else 구문 --> 세번째 방법
		
		System.out.println("---------------------------------");
		System.out.println("성적을 입력하시오.");
		int point = 70;
		// 만약 점수가 90점 이상이면 A를 출력하시오.
		// 만약 90점 아래라면 B학점을 출력하시오.
		if (point >= 90) {
			System.out.println("당신의 학점은 A 학점 입니다.");
		} else if (point >= 80) {
			System.out.println("당신의 학점은 B 학점 입니다.");
		} else if (point >= 70) {
			System.out.println("당신의 학점은 C 학점 입니다.");
		} else {
			System.out.println("당신의 학점은 F 학점 입니다.");
		} 
		
		

	}

}
