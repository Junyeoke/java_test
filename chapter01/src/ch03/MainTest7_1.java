package ch03;

public class MainTest7_1 {

	// 메인 쓰래드
	public static void main(String[] args) {
		
		// 논리 연산자(논리곱, 논리합)
		
		int num1 = 5;
		int i = 0;
		
		boolean value = ( (num1 = 1 +10 ) < 10 ) && ( ( i = i + 2 ) < 10 );
		System.out.println(value); // 논리 곱 기준 앞 연산자가 false 값이므로 뒤 연산자는 확인할 필요없이 false가 출력됨
		System.out.println(num1); 
		System.out.println(i); // 앞 연산이 false 이므로 뒤 연산자를 확인할 필요가 없어서 빠른 평가에 의해 2가 더해지지 않고 0으로 바로 출력
		
		// 논리 합
		boolean value2 = ((num1 = num1 + 1) > 0) || ((i = 100) < 2000 );
		System.out.println(value2); 
		System.out.println(num1);
		System.out.println(i);
		
		// 부정 연산자 (!)
		// value2 = true
		System.out.println(!value2); // value2 값 참을 부정하므로 false
		System.out.println(value2);
		
	} // end of main

} // end of class
