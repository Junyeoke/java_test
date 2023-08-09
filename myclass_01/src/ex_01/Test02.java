package ex_01;

public class Test02 {

	public static void main(String[] args) {
		byte b = 100;
		// byte result = -b; <- 컴파일 에러 발생함.
		// 정수타입(byte, short, int)의 연산결과는 int 타입이다.
		// 부호를 바꾸는 것도 연산이기 때문에 int 타입 변수에 대입해야 한다.
		int result = -b;
		System.out.println(result);
		
		int x = -100;
		x = -x;
		System.out.println(x);
		
		byte c = 100;
		int y = -b;
		System.out.println(y);

	}

}
