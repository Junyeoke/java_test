package ch02;

public class FunctionMainTest4 {

	public static void main(String[] args) {

		// 함수를 호출해서 실행하시오.
		int result = add(10, 50);
		System.out.println(result);

		int result2 = minus(500, 350);
		System.out.println(result2);

		int result3 = multi(300, 400);
		System.out.println(result3);
	}

	// 함수 3개를 선언하시오.

	public static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}

	public static int minus(int n1, int n2) {
		int result2;
		result2 = n1 - n2;
		return result2;
	}
	public static int multi(int n1, int n2) {
		int result3;
		result3 = n1 * n2;
		return result3;
	}
	
	
	
	}
	
