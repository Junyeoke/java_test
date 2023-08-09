package ch03;

public class MainTest7 {

	public static void main(String[] args) {
		// 핵심정리
		// 논리 연산자 ( &&, ||, ! )
		// 관계 연산자와 혼합하여 많이 사용한다.
		// 연산의 결과는 true, false로 반환된다.

		int num1 = 10;
		int num2 = 20;
		// 논리 곱 연산자(&&)는 모든 결과 값이 참이어야 참이 나온다. true
		// 하나라도 거짓이 나오면 무조건 거짓이 나온다. false
		// 논리곱 연산
		boolean flag1 = (num1 > 0) && (num2 > 0); // 앞 연산이 T, 뒤 연산이 T 이므로 논리 곱 출력 값도 True!
		System.out.println(flag1);
		boolean flag2 = (num1 > 0) && (num2 < 0); // 앞 연산이 T, 뒤 연산이 F 이므로 논리 곱 출력 값은 false!
		System.out.println(flag2);
		boolean flag3 = (num1 < 0) && (num2 < 0); // 앞 연산이 F, 뒤 연산이 F 이므로 논리 곱 출력 값은 false!
		System.out.println(flag3);

		// 결론
		// 논리 곱에서 하나라도 거짓이 있으면 연산의 결과는 false이다.

		System.out.println("============================");

		// 논리 합 연산(||)
		// 논리 합에서는 하나라도 참이 있으면 연산의 결과는 true이다.
		flag1 = (num1 < 0) || (num2 > 0); // 앞 연산은 F, 뒤 연산은 T 논리 합은 하나라도 참이면 참 값이 출력되므로 True
		System.out.println(flag1);
		// flag2 = T || T -> T
		// flag3 = T || F -> T
		// flag4 = F || F -> F
		flag1 = (num1 > 0) || (num2 > 0); // T || T - T
		System.out.println(flag1);
		flag1 = (num1 < 0) || (num2 > 0); // F || T - T
		System.out.println(flag1);
		flag1 = (num1 < 0) || (num2 < 0); // F || F - F
		System.out.println(flag1);
	}

}
